package com.cjrcodes.springtutorial.roomwebapp.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cjrcodes.springtutorial.roomwebapp.models.Staff;
import com.cjrcodes.springtutorial.roomwebapp.models.StaffRepository;

@Service
public class StaffService {
	
private StaffRepository staffRepository;

public StaffService(StaffRepository staffRepository) {
this.staffRepository = staffRepository;
}


public List<Staff> getStaff(){
	Iterable<Staff> staff = this.staffRepository.findAll();
	List<Staff> staffList = new ArrayList<>();
	staff.forEach(staffList::add);
	
	staffList.sort(new Comparator<Staff>() {
		@Override
		public int compare(Staff o1, Staff o2) {
			if(o1.getLastName().equals(o2.getLastName())) {
				return o1.getFirstName().compareTo(o2.getFirstName());
			}
			
			return o1.getLastName().compareTo(o2.getLastName());
		}
	});
	
	return staffList;
}

}
