package com.anudip.HospitalManegmentSystem.Entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Appointement {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Aid;
	
	@Column(name="PatientName",length=30)
	private String Pname;
	
	@Column(name="PatientContact",length=10)
	private String Pcontact;
	
	@Column(name="PatientEmail" ,length=50)
	private String Pemail;
	
	//private datetime Adate;
	
	@Column(name="AppointmentTime")
	private int Atime;
	
	@Column(name="DoctorSpecialization")
	private String doctorSpecialization;
	
	
	
	@ManyToOne
	private Doctor doctor;
	
	@ManyToOne
	private Patient patient;
	
	/////////////////////////////////
//	@ManyToOne
//  @JoinColumn(name = "Did")
//	private Doctor doctor;
//	
//	@ManyToOne
//    @JoinColumn(name = "patientId")
//	private Patient patient;
	//////////////////////////////
	
	
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	public String getPname() {
		return Pname;
	}
	public void setPname(String pname) {
		Pname = pname;
	}
	public String getPcontact() {
		return Pcontact;
	}
	public void setPcontact(String pcontact) {
		Pcontact = pcontact;
	}
	public String getPemail() {
		return Pemail;
	}
	public void setPemail(String pemail) {
		Pemail = pemail;
	}

	public String getDoctorSpecialization() {
		return doctorSpecialization;
	}
	public void setDoctorSpecialization(String doctorSpecialization) {
		this.doctorSpecialization = doctorSpecialization;
	}
	
	public Appointement() {
		
	}
	public Appointement(String pname, String pcontact, String pemail,String doctorSpecialization) {
		super();
		Pname = pname;
		Pcontact = pcontact;
		Pemail = pemail;
		this.doctorSpecialization = doctorSpecialization;
		
	}
	
	
	
}
