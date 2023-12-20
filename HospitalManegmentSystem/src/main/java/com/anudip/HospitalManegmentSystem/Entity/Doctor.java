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
public class Doctor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Did;
	
	@Column(name="DoctorName",length=30)
	private String Dname;
	
	@Column(name="DoctorEmail",length=30)
	private String Demail;
	
	@Column(name="Passward",length=30)
	private String password;
	
	@Column(name="DoctorSpecialization",length=30)
	private String doctorSpecialization;
	
	@Column(name="DoctorDegree",length=30)
	private String Ddegree;
	
	@Column(name="Fess")
	private int Dfees;
	
	@Column(name="DoctorsContact",length=10)
	private String Dcontact;
	
	
	@OneToMany(mappedBy ="doctor",cascade = CascadeType.ALL)
	private List<Appointement> appointments = new ArrayList<Appointement>();
	
	
	public List<Appointement> getAppointments() {
		return appointments;
	}
	public void setAppointments(List<Appointement> appointments) {
		this.appointments = appointments;
	}
	public String getDname() {
		return Dname;
	}
	public void setDname(String dname) {
		Dname = dname;
	}
	public String getDemail() {
		return Demail;
	}
	public void setDemail(String demail) {
		Demail = demail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDoctorSpecialization() {
		return this.doctorSpecialization;
	}
	public void setDoctorSpecialization(String doctorSpecialization) {
		this.doctorSpecialization = doctorSpecialization;
	}
	public String getDdegree() {
		return Ddegree;
	}
	public void setDdegree(String ddegree) {
		Ddegree = ddegree;
	}
	public int getDfees() {
		return Dfees;
	}
	public void setDfees(int dfees) {
		Dfees = dfees;
	}
	public String getDcontact() {
		return Dcontact;
	}
	public void setDcontact(String dcontact) {
		Dcontact = dcontact;
	}
	public Doctor(String dname, String demail, String password, String doctorSpecialization, String ddegree,
			int dfees, String dcontact) {
		super();
		
		Dname = dname;
		Demail = demail;
		this.password = password;
		this.doctorSpecialization = doctorSpecialization;
		Ddegree = ddegree;
		Dfees = dfees;
		Dcontact = dcontact;
	}
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
