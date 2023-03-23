package com.pratik.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserPersonalController {
	@Autowired
	UserPersonalRepo uPRepo;
	@GetMapping("/testing")
	public String testing() {
		return "this is userpersonal";
	}
	
	@PostMapping("/addup")
	public String addUserP(@RequestBody UserPersonal userPersonal) {
		uPRepo.save(userPersonal);
		return "userpersonal added successfully";
	}

}
