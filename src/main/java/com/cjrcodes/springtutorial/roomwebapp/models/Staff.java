package com.cjrcodes.springtutorial.roomwebapp.models;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;


@Entity
@Table(name="Employee")
public class Staff {

	
	@Id
	@GeneratedValue(generator = "uuid2")
	@Column(name="EMPLOYEE_ID")
	private String staffId;
	
	@Column(name="FIRST_NAME")
	private String firstName;
	
	@Column(name="LAST_NAME")
	private String lastName;
	
	@Column(name="POSITION")
	@Enumerated(EnumType.STRING)
	private Position position;

	public Staff() {
	this.staffId = UUID.randomUUID().toString();
	}

	public Staff(String staffId, String firstName, String lastName, Position position) {
		this.staffId = staffId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.position = position;
	}

	

	public String getId() {
		return staffId;
	}

	public void setId(String staffId) {
		this.staffId = staffId;
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

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

}
