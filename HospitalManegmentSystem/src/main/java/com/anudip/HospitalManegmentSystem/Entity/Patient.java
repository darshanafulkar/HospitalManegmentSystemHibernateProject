package com.anudip.HospitalManegmentSystem.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Patient {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int patientId;
	
	@Column(name="FirstName",length=30)
	private String firstName;
	
	@Column(name="LastName",length=30)
	private String lastName;
	
	@Column(name="Email",length=30)
	private String email;
	
	@Column(name="Password",length=30)
	private String Password;
	
	@Column(name="Address",length=30)
	private String address;
	
	@Column(name="Gender",length=10)
	private String gender;
	
	@Column(name="Contact",length=30)
	private String contact;
	
	@OneToMany(mappedBy ="patient",cascade = CascadeType.ALL)//Patient_Appointment nhi banega
	private List<Appointement> appointments = new ArrayList<Appointement>();
	
	
	public List<Appointement> getAppointments() {
		return appointments;
	}
	public void setAppointments(List<Appointement> appointments) {
		this.appointments = appointments;
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
	
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Patient(String firstName, String lastName, String email, String address, String gender, String contact) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.address = address;
		this.gender = gender;
		this.contact = contact;
	}
	
	
	
}
