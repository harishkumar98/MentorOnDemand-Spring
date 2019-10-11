package com.example.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping({"/mentors"})
public class MentorController {

	@Autowired
	private MentorService mentorService;
	
    
	@PostMapping
    public Mentor create(@RequestBody Mentor mentor){
        return mentorService.create(mentor);
    }

    @GetMapping(path = {"/{id}"})
    public Mentor findOne(@PathVariable("id") int id){
        return mentorService.findById(id);
    }
    
    @GetMapping(path = {"/{email}/{password}"})
    public Mentor findMentor(@PathVariable("email") String email, @PathVariable("password") String password){
        return mentorService.findMentor(email,password);
    }
    
    @GetMapping(path= {"/check/{userName}"})
   	public boolean check(@PathVariable("userName") String userName) {
       	String mentorId;
   		mentorId=mentorService.check(userName);
   		System.out.println(mentorId);
   		if(mentorId==null)
   			return true;
   		else
   			return false;
   	}


    @PutMapping(path = {"/{id}"})
    public Mentor update(@PathVariable("id") int id, @RequestBody Mentor mentor){
        mentor.setId(id);
        return mentorService.update(mentor);
    }

    @DeleteMapping(path ={"/{id}"})
    public Mentor delete(@PathVariable("id") int id) {
        return mentorService.delete(id);
    }

    @GetMapping
    public List<Mentor> findAll(){
        return mentorService.findAll();
    }
}
