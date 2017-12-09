package isep.web.project.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import isep.web.project.model.Staff;
import isep.web.project.repository.CustomerRepository;

public class CustomerUserDetailsService implements UserDetailsService
{

	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException 
	{
		Optional<Staff> Optionalcustomer = customerRepository.findByEmail(userName);
		
		Optionalcustomer
				.orElseThrow(() -> new UsernameNotFoundException("Username not Found"));
		
		return Optionalcustomer
				.map(CustomerUserDetails::new).get();
	}
}
