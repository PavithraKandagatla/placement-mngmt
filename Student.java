package com;
import javax.persistence.*;

@Entity
@Table(name = "student")

public class Student {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String firstname;
	private String lastname;
	private String email;
	@Column(nullable = false, length = 64)
	private String password;
	private int phone_number;
	private int tenth_marks;
	private int twelth_marks;
	private String degree;
	private String college_name;
	private int degree_marks;
	private int passoutyear;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
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
	public int getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(int phone_number) {
		this.phone_number = phone_number;
	}
	public int getTenth_marks() {
		return tenth_marks;
	}
	public void setTenth_marks(int tenth_marks) {
		this.tenth_marks = tenth_marks;
	}
	public int getTwelth_marks() {
		return twelth_marks;
	}
	public void setTwelth_marks(int twelth_marks) {
		this.twelth_marks = twelth_marks;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getCollege_name() {
		return college_name;
	}
	public void setCollege_name(String college_name) {
		this.college_name = college_name;
	}
	public int getDegree_marks() {
		return degree_marks;
	}
	public void setDegree_marks(int degree_marks) {
		this.degree_marks = degree_marks;
	}
	public int getPassoutyear() {
		return passoutyear;
	}
	public void setPassoutyear(int passoutyear) {
		this.passoutyear = passoutyear;
	}
	
	
	
}
