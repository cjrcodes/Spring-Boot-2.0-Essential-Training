package com.cjrcodes.springtutorial.roomwebapp.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cjrcodes.springtutorial.roomwebapp.models.Staff;
import com.cjrcodes.springtutorial.roomwebapp.service.StaffService;

@Controller
@RequestMapping("/staff")
public class StaffController {
	
	
	private final StaffService staffService;
	
	
	
	public StaffController(StaffService staffService) {
		this.staffService = staffService;
	}



	@GetMapping
	public String getAllStaff(Model model) {
		
		//This will link the view and the model. Within rooms.html, there is a "staff" variable to be found (<tr th:each="staff:${staff}">)
		List<Staff> staff = this.staffService.getStaff();
		model.addAttribute("staff", staff);
		
		//"staff" as in staff.html, found under templates in the resources folder, it will look for that file from the string being returned
		return "staff";
	}

}
