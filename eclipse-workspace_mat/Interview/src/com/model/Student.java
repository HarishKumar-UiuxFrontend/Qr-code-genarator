package com.model;

public class Student {

	private int stuId;
	private String stuName;
	private String password;
	private char gender;
	private float mark;
	public Student() {
		super();
	}
	public Student(int stuId, String stuName, String password, char gender, float mark) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
		this.password = password;
		this.gender = gender;
		this.mark = mark;
	}
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public float getMark() {
		return mark;
	}
	public void setMark(float mark) {
		this.mark = mark;
	}
	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", stuName=" + stuName + ", password=" + password + ", gender=" + gender
				+ ", mark=" + mark + "]";
	}
	
	
}
