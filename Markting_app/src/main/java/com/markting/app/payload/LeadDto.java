package com.markting.app.payload;


public class LeadDto {
    private long id;
    private String firstName;
    private String lastName;
	private String email;
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
	 * public LeadDto(long id, String firstName, String lastName, String email, long
	 * mobile) { super(); this.id = id; this.firstName = firstName; this.lastName =
	 * lastName; this.email = email; this.mobile = mobile; }
	 * 
	 * public LeadDto() { super(); // TODO Auto-generated constructor stub }
	 */

	
	
}
