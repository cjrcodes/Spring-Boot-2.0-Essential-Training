package com.cjrcodes.springtutorial.roomwebapp.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cjrcodes.springtutorial.roomwebapp.models.Room;
import com.cjrcodes.springtutorial.roomwebapp.service.RoomService;

@Controller
@RequestMapping("/rooms")
public class RoomController {

	
	private final RoomService roomService;
	
	public RoomController(RoomService roomService) {
		this.roomService = roomService;
	}

	@GetMapping
	public String getAllRooms(Model model) {
		
		//This will link the view and the model. Within rooms.html, there is a "rooms" variable to be found (<tr th:each="room:${rooms}">)
		List<Room> rooms = this.roomService.getAllRooms();
		model.addAttribute("rooms", rooms);
		
		//"rooms" as in rooms.html, it will look for that file from the string being returned
		return "rooms";
	}
}
