package com.example.user;

import java.util.List;

public interface MentorService {
	Mentor create(Mentor mentor);
	Mentor delete(int id);
	  List<Mentor> findAll();
	  Mentor findById(int id);
	  Mentor update (Mentor mentor);
	Mentor findMentor(String email, String password);
	String check(String userName);
}
