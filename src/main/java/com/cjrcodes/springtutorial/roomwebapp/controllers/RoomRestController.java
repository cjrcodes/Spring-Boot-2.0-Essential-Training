package com.cjrcodes.springtutorial.roomwebapp.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjrcodes.springtutorial.roomwebapp.models.Room;
import com.cjrcodes.springtutorial.roomwebapp.service.RoomService;

@RestController
@RequestMapping("/api/rooms")
public class RoomRestController {

	private RoomService roomService;

	public RoomRestController(RoomService roomService) {
		this.roomService = roomService;
	}

	@GetMapping
	public List<Room> getAllRooms() {
		return this.roomService.getAllRooms();
	}

}
