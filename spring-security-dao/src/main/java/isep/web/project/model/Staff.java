package isep.web.project.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Staff 
{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int staff_id;
	private String email;
	private String password;
	private int first_name;
	private int last_name;
	private int active;
	
	public Staff() {
		
	}

	public Staff(Staff staff) {
		super();
		this.staff_id = staff.staff_id;
		this.email = staff.email;
		this.password = staff.password;
		this.first_name = staff.first_name;
		this.last_name = staff.last_name;
		this.active = staff.active;
	}

	public int getStaff_id() {
		return staff_id;
	}

	public void setStaff_id(int staff_id) {
		this.staff_id = staff_id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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
	
	
	
	
	
}
