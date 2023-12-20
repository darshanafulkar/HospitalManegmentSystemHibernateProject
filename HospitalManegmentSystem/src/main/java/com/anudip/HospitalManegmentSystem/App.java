package com.anudip.HospitalManegmentSystem;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.anudip.HospitalManegmentSystem.Entity.Appointement;
import com.anudip.HospitalManegmentSystem.Entity.Doctor;
import com.anudip.HospitalManegmentSystem.Entity.Patient;




/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Configuration conf = new Configuration().configure().addAnnotatedClass(Doctor.class).addAnnotatedClass(Appointement.class).addAnnotatedClass(Patient.class);
    	SessionFactory sf = conf.buildSessionFactory();
    	Session s = sf.openSession();
    	Transaction t = s.beginTransaction();
    	
    	//Doctor
    	Doctor d1 = new Doctor("Ram","ram@gmail.com","Ram@100","Nurology","MBBS",3000,"8921178999");
    	Doctor d2 = new Doctor("Sham","sham@gmail.com","sham@856","Cardiology","MBBS",3000,"7654899989");
    	
    	//Patient
   
    	Patient p1 = new Patient();
    	p1.setFirstName("Aparna");
    	p1.setLastName("Patel");
    	p1.setAddress("Ring Road,Delhi");
    	p1.setContact("55555");
    	p1.setEmail("aparna@gmail.com");
    	p1.setGender("Female");
    	p1.setPassword("Apn456");
    	
    	Patient p2 = new Patient();
    	p2.setFirstName("Mahima");
    	p2.setLastName("Khurana");
    	p2.setAddress("Delhi");
    	p2.setContact("88888");
    	p2.setEmail("mahima@gmail.com");
    	p2.setGender("Female");
    	p2.setPassword("mahi556");
    	
    	
    
    	// patient 1 having 2 Appointments
    	Appointement ap11 = new Appointement();
    	ap11.setPname("Aparna");
    	ap11.setPemail("aparna@gmail.com");
    	ap11.setPcontact("55555");
    	ap11.setDoctorSpecialization("Nurologist");
    	ap11.setDoctor(d1);//doctor 1
    	ap11.setPatient(p1);
    	
    	Appointement ap12 = new Appointement();
    	ap12.setPname("Aparna");
    	ap12.setPemail("aparna@gmail.com");
    	ap12.setPcontact("55555");
    	ap12.setDoctorSpecialization("Cardiology");
    	ap12.setDoctor(d2);//doctor 2
    	ap12.setPatient(p1);
    	
    	
    	//patient 2 having 1 Appointment
    	Appointement ap21 = new Appointement();
    	ap21.setPname("Mahima");
    	ap21.setPemail("mahima@gmail.com");
    	ap21.setPcontact("88888");
    	ap21.setDoctorSpecialization("Nurologist");
    	ap21.setDoctor(d1);//doctor 1
    	ap21.setPatient(p2);
    	
    	//List for doctor 1 Appointments
    	List<Appointement> list1 = new ArrayList<Appointement>();
    	list1.add(ap11);
    	list1.add(ap21);
    	
    	//Saving doctor 1 Appointments list
    	d1.setAppointments(list1);
    	
    	
    	//List for doctor 2 Appointments
    	List<Appointement> list2 = new ArrayList<Appointement>();
    	list2.add(ap12);
     	
    	//Saving doctor 2 Appointments list
    	d2.setAppointments(list2);
    	
    	
    	//patient 1 have 2 appointments with doctor 1 and doctor 2
    	List<Appointement> list3 = new ArrayList<Appointement>();
    	list3.add(ap11);
    	list3.add(ap12);
    	
    	p1.setAppointments(list3);
    	
    	//patient 2 have 1 appointments with doctor 1 
    	List<Appointement> list4 = new ArrayList<Appointement>();
    	list4.add(ap21);
    	
    	
    	p2.setAppointments(list4);
    	
    	s.persist(d1);
    	s.persist(d2);
    	s.persist(p1);
    	s.persist(p2);
    	
    	

//    	s.save(ap11);
//    	s.save(ap12);
//    	s.save(ap21);
    	
    	
    	
    	t.commit();
    	
    	s.close();
    	sf.close();
    	
        System.out.println( "Hello World!" );
    }
}
