package com.cjrcodes.springtutorial.roomwebapp.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjrcodes.springtutorial.roomwebapp.models.Staff;
import com.cjrcodes.springtutorial.roomwebapp.service.StaffService;

@RestController
@RequestMapping("/api/staff")
public class StaffRestController {

	private final StaffService staffService;

	public StaffRestController(StaffService staffService) {
		this.staffService = staffService;
	}
	
	@GetMapping
	public List<Staff> getAllStaff(){
		return this.staffService.getStaff();
	}
	
	
	
}
