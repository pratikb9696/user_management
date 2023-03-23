package com.pratik.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsrController {
	@Autowired
	UserRepo uRepo;
	@GetMapping("/test")
	public String test() {
		return "this is testing";
	}
	@PostMapping("/adduser")
	public String addUser(@RequestBody User user) {
		uRepo.save(user);
		return "User added successfully";
	}
	@DeleteMapping("/removeuser/{id}")
	public String deleteUser(@PathVariable int id) {
		uRepo.deleteById(id);
		return "Deleted successfully";
	}
	 @GetMapping("getbyid/{id}")
	public User getById(@PathVariable int id) {
		return uRepo.findById(id).get();
	}
	 @GetMapping("/findall")
	 public List<User> getAll(){
		 List<User> user=uRepo.findAll();
		 return user;	 }
	
	 @GetMapping("/getbyname/{name}")
	 public List<User> getByName(@PathVariable String name){
		List <User> user=uRepo.findByUName(name);
		 return user;
	 }
	
    
}
