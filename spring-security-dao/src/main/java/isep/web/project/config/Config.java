package isep.web.project.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.PasswordEncoder;

import isep.web.project.repository.CustomerRepository;
import isep.web.project.service.CustomerUserDetailsService;

@EnableWebSecurity
@EnableJpaRepositories(basePackageClasses = CustomerRepository.class)
@Configuration
public class Config extends WebSecurityConfigurerAdapter
{

	@Autowired
	private CustomerUserDetailsService userDetailsService;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception 
	{
	
		auth
		.userDetailsService(userDetailsService)
		.passwordEncoder(new PasswordEncoder() {

			@Override
			public String encode(CharSequence str) {
				return str.toString();
			}

			@Override
			public boolean matches(CharSequence arg0, String arg1) {
				return true;
			}
			
		});
	} 
	
	@Override
	protected void configure(HttpSecurity http) throws Exception
	{
		 http
         .authorizeRequests()
             .antMatchers("/", "/home").permitAll()
             .anyRequest().authenticated()
             .and()
         .formLogin()
             .loginPage("/login")
             .permitAll()
             .and()
         .logout()
             .permitAll();
		
	}
}
