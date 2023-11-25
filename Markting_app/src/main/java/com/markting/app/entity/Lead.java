package com.markting.app.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "lead")
public class Lead  {
       @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "first_name", nullable = false, length = 55)
	private String firstName;
	@Column(name = "last_name", nullable = false, length = 45)
	private String lastName;
	
	@Column(name = "email", nullable = false, length = 128, unique = false)
	private String email;
	@Column(name = "mobile", nullable = false,length = 20, unique = false)
	private long mobile;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	/*
	 * public Lead(long id, String firstName, String lastName, String email, long
	 * mobile) { super(); this.id = id; this.firstName = firstName; this.lastName =
	 * lastName; this.email = email; this.mobile = mobile; }
	 * 
	 * public Lead() { super(); // TODO Auto-generated constructor stub }
	 */


}
