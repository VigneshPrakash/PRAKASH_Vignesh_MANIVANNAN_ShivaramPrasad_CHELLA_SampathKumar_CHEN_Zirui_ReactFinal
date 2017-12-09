package isep.web.project.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Customers 
{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int customer_id;
	private String email;
	
	private String password;
	private int first_name;
	private int last_name;
	private int active;
	

	
	public Customers() {
	}
	

	public Customers(Customers customer) {
		super();
		this.customer_id = customer.customer_id;
		this.email = customer.email;
		this.password = customer.password;
		this.first_name = customer.first_name;
		this.last_name = customer.last_name;
		this.active = customer.active;
	}



	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getFirst_name() {
		return first_name;
	}

	public void setFirst_name(int first_name) {
		this.first_name = first_name;
	}

	public int getLast_name() {
		return last_name;
	}

	public void setLast_name(int last_name) {
		this.last_name = last_name;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	public String getPassword()
	{
		return password;
		
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	

	
}
