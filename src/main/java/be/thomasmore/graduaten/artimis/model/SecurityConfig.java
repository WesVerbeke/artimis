package be.thomasmore.graduaten.artimis.model;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        //super.configure(auth);

        //eigen users gebruiken
        auth.inMemoryAuthentication()
                .withUser("bla")
                .password("bla")
                .roles("User")
                .and()
                .withUser("ble")
                .password("ble")
                .roles("Admin");
    }

    @Bean
    public PasswordEncoder getPasswordEncoder()
    {
        //password encryption instellen op clear tekst (voor testing)
        return NoOpPasswordEncoder.getInstance();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/admin").hasRole("Admin")
                .antMatchers("/user").hasAnyRole("User", "Admin")
                .antMatchers("/", "/kopen", "/productdetail", "/contact", "/privacy", "/register").permitAll()
                //.anyRequest().authenticated()
                .and()
                .formLogin();
                //.and() //deze lijn moet worden verwijderd om eigen loginpagina te gebruiken
                //.httpBasic(); //deze lijn moet worden verwijderd om eigen loginpagina te gebruiken


                //.loginPage("/login") //eigen loginpagina gebruiken
                //.permitAll(); //iedereen moet hier toegang toe krijgen
    }
}
