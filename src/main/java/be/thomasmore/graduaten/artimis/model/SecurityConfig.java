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
                .roles("USER")
                .and()
                .withUser("ble")
                .password("ble")
                .roles("USER");
    }

    @Bean
    public PasswordEncoder getPasswordEncoder()
    {
        //password encryption instellen op clear tekst (voor testing)
        return NoOpPasswordEncoder.getInstance();
    }

/*
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .anyRequest().authenticated()
                .and()
                .formLogin()
*/
/*
                .and()
                .httpBasic();
*//*

                .loginPage("/login") //eigen loginpagina gebruiken
                .permitAll(); //iedereen moet hier toegang toe krijgen
    }
*/
}
