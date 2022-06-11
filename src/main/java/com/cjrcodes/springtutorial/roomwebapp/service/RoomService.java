package com.cjrcodes.springtutorial.roomwebapp.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cjrcodes.springtutorial.roomwebapp.models.Room;
import com.cjrcodes.springtutorial.roomwebapp.models.RoomRepository;
import com.cjrcodes.springtutorial.roomwebapp.models.Room;

@Service
public class RoomService {
	
	private RoomRepository roomRepository;
	
	
	
	
	
	public RoomService(RoomRepository roomRepository) {
		this.roomRepository = roomRepository;
	}





	public List<Room> getAllRooms() {
		Iterable<Room> room = this.roomRepository.findAll();
		List<Room> roomList = new ArrayList<>();
		room.forEach(roomList::add);
		
		roomList.sort(new Comparator<Room>() {
			@Override
			public int compare(Room o1, Room o2) {
				
				
				return o1.getNumber().compareTo(o2.getNumber());
			}
		});
		
		return roomList;
	}

}
