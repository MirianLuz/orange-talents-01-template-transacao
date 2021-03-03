package br.com.br.transacao.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.configurers.oauth2.server.resource.OAuth2ResourceServerConfigurer;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
    	
    	http.authorizeRequests()
        .anyRequest().authenticated()
        .and()
        .oauth2ResourceServer(OAuth2ResourceServerConfigurer::jwt);
    	
//        http.authorizeRequests(authorizeRequests ->
//                        authorizeRequests
//                                .antMatchers(HttpMethod.GET, "/api/transacao/**").hasAuthority("SCOPE_transacao:read")
//                                .anyRequest().authenticated()
//                )
//                .oauth2ResourceServer(OAuth2ResourceServerConfigurer::jwt);
    }

}