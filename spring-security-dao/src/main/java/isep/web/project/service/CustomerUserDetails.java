package isep.web.project.service;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;


import isep.web.project.model.Staff;

public class CustomerUserDetails extends Staff implements UserDetails
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public  CustomerUserDetails(final Staff staff)
	{
		super(staff);
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities()
	{
		
		return null;
	}

	@Override
	public String getPassword()
	{
		return super.getPassword();
	}

	@Override
	public String getUsername() 
	{
	
		return super.getEmail();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	

}
