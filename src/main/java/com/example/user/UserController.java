package com.example.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin
//@RequestMapping({"/api"})
@RequestMapping({"/users"})
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public User create(@RequestBody User user){
        return userService.create(user);
    }

    @GetMapping(path = {"/{id}"})
    public User findOne(@PathVariable("id") int id){
        return userService.findById(id);
    }
    
    @GetMapping(path = {"/{email}/{password}"})
    public User findUser(@PathVariable("email") String email, @PathVariable("password") String password){
        return userService.findUser(email,password);
    }

    
    @GetMapping(path= {"/check/{userName}"})
	public boolean check(@PathVariable("userName") String userName) {
    	String userId;
		userId=userService.check(userName);
		System.out.println(userId);
		if(userId==null)
			return true;
		else
			return false;
	}

    @PutMapping(path = {"/{id}"})
    public User update(@PathVariable("id") int id, @RequestBody User user){
        user.setId(id);
        return userService.update(user);
    }

    @DeleteMapping(path ={"/{id}"})
    public User delete(@PathVariable("id") int id) {
        return userService.delete(id);
    }

    @GetMapping
    public List<User> findAll(){
        return userService.findAll();
    }
}
