package com.elias.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elias.course.entities.User;

@RestController
@RequestMapping(value = "/Users")
public class UserResource {
      @GetMapping
	  public ResponseEntity<User> findAll(){
		  User u = new User(1L, "Maria", "Eliasmadrid@gmail.com", "9999999", "12333");
	      return ResponseEntity.ok().body(u);
	  }
}
