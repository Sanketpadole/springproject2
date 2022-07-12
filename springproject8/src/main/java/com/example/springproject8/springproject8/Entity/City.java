package com.example.springproject8.springproject8.Entity;

public class City {
	private long id;
	private String Name;
	private String LastName;
	public City(long id, String name, String lastName) {
		super();
		this.id = id;
		Name = name;
		LastName = lastName;
	}
	public City() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	@Override
	public String toString() {
		return "City [id=" + id + ", Name=" + Name + ", LastName=" + LastName + "]";
	}

}
