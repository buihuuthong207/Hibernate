package com.thong.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) //for autonumber
	@Column
	private int studentId;
	@Column
	private String firstname;
	@Column
	private String lastname;
	@Column
	private int yearLevel;
	@Column
	private String address;
	@Column
	private double avgScore;
	
	public Student(){}
	
	public Student(int studentId, String firstname, String lastname, int yearLevel, String address, double avgScore) {
		super();
		this.studentId = studentId;
		this.firstname = firstname;
		this.lastname = lastname;
		this.yearLevel = yearLevel;
		this.address = address;
		this.avgScore = avgScore;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getAvgScore() {
		return avgScore;
	}

	public void setAvgScore(double avgScore) {
		this.avgScore = avgScore;
	}

	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
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
	public int getYearLevel() {
		return yearLevel;
	}
	public void setYearLevel(int yearLevel) {
		this.yearLevel = yearLevel;
	}
	
	
}
