package id.my.hendisantika.springwebfluxdemosystem.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.core.userdetails.MapReactiveUserDetailsService;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-webflux-demo-system
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 4/3/24
 * Time: 07:14
 * To change this template use File | Settings | File Templates.
 */
@EnableWebFluxSecurity
public class SecurityConfig {
    @Bean
    public MapReactiveUserDetailsService userDetailsService() {
        UserDetails user = User
                .withUsername("user")
                .password(passwordEncoder().encode("userpwd"))
                .roles("USER")
                .build();
        UserDetails admin = User
                .withUsername("admin")
                .password(passwordEncoder().encode("adminpwd"))
                .roles("ADMIN")
                .build();
        return new MapReactiveUserDetailsService(user, admin);
    }
}
