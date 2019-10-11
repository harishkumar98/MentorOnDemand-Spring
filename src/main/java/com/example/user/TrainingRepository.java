package com.example.user;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;


public interface TrainingRepository extends Repository<Training, Integer>{
	
	void delete(Training training);
	
	List<Training> findAll();
	
	Training findOne(int id);
	
	Training save(Training training);
	
	@Query("select training from Training training where training.mentor.id=?")
	List<Training> findTrainingByMentorId(int mentorId);
	
	@Query("select training from Training training where training.id=? and training.mentor.id=?")
	Training findByIdAndMentorId(int trainingid, int mentorId);
	
	  List<Training> findTrainingByUsersId(Integer userId);
	  
	  List<Training> findTrainingByUsersIdAndStatusEquals(int userId,String Progress);
	  
	  Training findByIdAndUsersId(int trainingId, int userId);
	 

	@Query("select training from Training training where training.startDate between ? and ?")
	List<Training> findTrainingByStartDateBetween(Date startDate, Date endDate);
    
	
}
