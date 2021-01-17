package be.thomasmore.graduaten.artimis.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configurers.provisioning.JdbcUserDetailsManagerConfigurer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;

import javax.sql.DataSource;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    DataSource dataSource; //verwijzing naar h2 database

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        //super.configure(auth);

        //database authentication
        auth.jdbcAuthentication()
                .dataSource(dataSource)
                //.passwordEncoder(passwordEncoder()); //voor encryption
                .usersByUsernameQuery(
                "SELECT username, password, enabled FROM GEBRUIKER WHERE username = ?"
                )
                .authoritiesByUsernameQuery(
                "SELECT g.username, a.authority FROM GEBRUIKER g, AUTORITEIT a " +
                "WHERE g.username = ? AND g.AUTORITEIT_autoriteitid = a.autoriteitid"
                );
    }

    @Bean
    public PasswordEncoder getPasswordEncoder()
    {
        //password encryption instellen op clear tekst (voor testdata met ongeencrypteerde wachtwoorden)
        return NoOpPasswordEncoder.getInstance();

        //return new BCryptPasswordEncoder(); //dit moet je normaal gezien doen voor encryption
    }

    @Bean
    public AuthenticationSuccessHandler myAuthenticationSuccessHandler(){
        return new MySimpleUrlAuthenticationSuccessHandler();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/admin", "/h2-console").hasRole("ADMIN")
                .antMatchers("/user").hasAnyRole("USER", "ADMIN")
                .antMatchers("/", "/kopen", "/productdetail", "/contact", "/privacy", "/register", "/gebruikers").permitAll()
                //.anyRequest().authenticated()
                .and()
                .formLogin()
                //.and()
                //.httpBasic();

                //.loginPage("/login") //eigen loginpagina gebruiken
                //.permitAll(); //iedereen moet hier toegang toe krijgen
                //.defaultSuccessUrl("/user", true)
                .successHandler(myAuthenticationSuccessHandler());
    }
}
