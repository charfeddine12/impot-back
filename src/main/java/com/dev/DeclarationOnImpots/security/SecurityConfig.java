package com.dev.DeclarationOnImpots.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
//@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter{

	@Autowired
	private UserDetailsService userDetailsService;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	/*@Autowired
    private JwtAuthenticationEntryPoint unauthorizedHandler;*/
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth)throws Exception{
		auth.userDetailsService(userDetailsService)
		.passwordEncoder(bCryptPasswordEncoder);
	}
	
	/*@Bean
	public BCryptPasswordEncoder passwordEncoder() {
	    BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
	    return bCryptPasswordEncoder;
	}*/
	
	
	
	@Override
	protected void configure(HttpSecurity http)throws Exception{
		http.csrf().disable().authorizeRequests();
		http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
		http.authorizeRequests().antMatchers("/login/**").permitAll();
		//http.authorizeRequests().antMatchers(HttpMethod.OPTIONS,"/login").permitAll();
		//http.authorizeRequests().antMatchers(HttpMethod.POST,"/login").permitAll();
		http.authorizeRequests().antMatchers(HttpMethod.DELETE,"/impotsSocietes/**").permitAll();
		http.authorizeRequests().antMatchers(HttpMethod.POST,"/impotsSocietes/**").permitAll();
		http.authorizeRequests().antMatchers(HttpMethod.GET,"/impotsSocietes/**").permitAll();
		http.authorizeRequests().antMatchers(HttpMethod.OPTIONS,"/impotsSocietes/**").permitAll();
		http.authorizeRequests().antMatchers(HttpMethod.PUT,"/impotsSocietes/**").permitAll();
		http.authorizeRequests().antMatchers(HttpMethod.POST,"/loyers/**").permitAll();
		http.authorizeRequests().antMatchers(HttpMethod.GET,"/loyers/**").permitAll();
		http.authorizeRequests().antMatchers(HttpMethod.DELETE,"/loyers/**").permitAll();
		http.authorizeRequests().antMatchers(HttpMethod.OPTIONS,"/loyers/**").permitAll();
		http.authorizeRequests().antMatchers(HttpMethod.PUT,"/loyers/**").permitAll();
		http.authorizeRequests().antMatchers(HttpMethod.DELETE,"/impotsRPPs/**").permitAll();
		http.authorizeRequests().antMatchers(HttpMethod.GET,"/impotsRPPs/**").permitAll();
		http.authorizeRequests().antMatchers(HttpMethod.POST,"/impotsRPPs/**").permitAll();
		http.authorizeRequests().antMatchers(HttpMethod.OPTIONS,"/impotsRPPs/**").permitAll();
		http.authorizeRequests().antMatchers(HttpMethod.PUT,"/impotsRPPs/**").permitAll();
		http.authorizeRequests().antMatchers(HttpMethod.POST,"/exercices/**").permitAll();
		http.authorizeRequests().antMatchers(HttpMethod.GET,"/exercices/**").permitAll();
		http.authorizeRequests().antMatchers(HttpMethod.DELETE,"/exercices/**").permitAll();
		http.authorizeRequests().antMatchers(HttpMethod.OPTIONS,"/exercices/**").permitAll();
		http.authorizeRequests().antMatchers(HttpMethod.PUT,"/exercices/**").permitAll();
		http.authorizeRequests().antMatchers(HttpMethod.GET,"/declarationImpotss/**").permitAll();
		http.authorizeRequests().antMatchers(HttpMethod.POST,"/declarationImpotss/**").permitAll();
		http.authorizeRequests().antMatchers(HttpMethod.DELETE,"/declarationImpotss/**").permitAll();
		http.authorizeRequests().antMatchers(HttpMethod.OPTIONS,"/declarationImpotss/**").permitAll();
		http.authorizeRequests().antMatchers(HttpMethod.PUT,"/declarationImpotss/**").permitAll();
		http.authorizeRequests().antMatchers(HttpMethod.GET,"/declarationExistences/**").permitAll();
		http.authorizeRequests().antMatchers(HttpMethod.POST,"/declarationExistences/**").permitAll();
		http.authorizeRequests().antMatchers(HttpMethod.DELETE,"/declarationExistences/**").permitAll();
		http.authorizeRequests().antMatchers(HttpMethod.OPTIONS,"/declarationExistences/**").permitAll();
		http.authorizeRequests().antMatchers(HttpMethod.PUT,"/declarationExistences/**").permitAll();
		http.authorizeRequests().antMatchers(HttpMethod.GET,"/employees/**").permitAll();
		http.authorizeRequests().antMatchers(HttpMethod.POST,"/employees/**").permitAll();
		http.authorizeRequests().antMatchers(HttpMethod.DELETE,"/employees/**").permitAll();
		http.authorizeRequests().antMatchers(HttpMethod.OPTIONS,"/employees/**").permitAll();
		http.authorizeRequests().antMatchers(HttpMethod.PUT,"/employees/**").permitAll();
		http.authorizeRequests().antMatchers(HttpMethod.GET,"/administrateurs/**").permitAll();
		http.authorizeRequests().antMatchers(HttpMethod.POST,"/administrateurs/**").permitAll();
		http.authorizeRequests().antMatchers(HttpMethod.DELETE,"/administrateurs/**").permitAll();
		http.authorizeRequests().antMatchers(HttpMethod.OPTIONS,"/administrateurs/**").permitAll();
		http.authorizeRequests().antMatchers(HttpMethod.PUT,"/administrateurs/**").permitAll();
		http.authorizeRequests().antMatchers(HttpMethod.GET,"/contribuables/**").permitAll();
		http.authorizeRequests().antMatchers(HttpMethod.POST,"/contribuables/**").permitAll();
		http.authorizeRequests().antMatchers(HttpMethod.DELETE,"/contribuables/**").permitAll();
		http.authorizeRequests().antMatchers(HttpMethod.OPTIONS,"/contribuables/**").permitAll();
		http.authorizeRequests().antMatchers(HttpMethod.PUT,"/contribuables/**").permitAll();
		http.authorizeRequests().antMatchers(HttpMethod.GET,"/personneMorls/**").permitAll();
		http.authorizeRequests().antMatchers(HttpMethod.POST,"/personneMorls/**").permitAll();
		http.authorizeRequests().antMatchers(HttpMethod.DELETE,"/personneMorls/**").permitAll();
		http.authorizeRequests().antMatchers(HttpMethod.OPTIONS,"/personneMorls/**").permitAll();
		http.authorizeRequests().antMatchers(HttpMethod.PUT,"/personneMorls/**").permitAll();
		http.authorizeRequests().antMatchers(HttpMethod.GET,"/personnePhyzs/**").permitAll();
		http.authorizeRequests().antMatchers(HttpMethod.POST,"/personnePhyzs/**").permitAll();
		http.authorizeRequests().antMatchers(HttpMethod.DELETE,"/personnePhyzs/**").permitAll();
		http.authorizeRequests().antMatchers(HttpMethod.OPTIONS,"/personnePhyzs/**").permitAll();
		http.authorizeRequests().antMatchers(HttpMethod.PUT,"/personnePhyzs/**").permitAll();

		http.authorizeRequests().anyRequest().authenticated();
		http.addFilter(new JWTAuthenticationFilter(authenticationManager()));
		http.addFilterBefore(new JWTAuthorizationFilter(), UsernamePasswordAuthenticationFilter.class);
	}
	
	/*@Override
	protected void configure(HttpSecurity http) throws Exception {
	/*http.csrf().disable()
	// don't create session
	.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
	.and()
	.authorizeRequests()
	//.antMatchers(HttpMethod.OPTIONS,"/login/**", "/impotsSocietes/**", "/contribuables/**")
	.antMatchers(HttpMethod.POST,"/login/**", "/impotsSocietes/**", "/contribuables/**")
	.permitAll()
	//.antMatchers(HttpMethod.POST,"/tasks/**").hasAuthority("ADMIN")
	//.anyRequest().authenticated()
	.and()
	.addFilter(new JWTAuthenticationFilter(authenticationManager()))
	.addFilterBefore(new JWTAuthorizationFilter(),
	UsernamePasswordAuthenticationFilter.class);*/
	
	
	/*http.csrf().disable().authorizeRequests()
   
    .antMatchers("/login/**").permitAll()
    .anyRequest().authenticated()
    .and()
    .addFilter(new JWTAuthenticationFilter(authenticationManager()))
    .addFilterBefore(new JWTAuthorizationFilter(),
    		UsernamePasswordAuthenticationFilter.class)
    // this disables session creation on Spring Security
    .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
    .and().formLogin().disable();
	}*/
}