package com.example.user;

import java.util.Date;
import java.util.List;


public interface TrainingService {

	Training create(Training training);

	Training delete(int id);

	    List<Training> findAll();

	    Training findById(int id);

	    Training update(Training training);
	    
	    List<Training> findTrainingByMentorId(int mentorId);
	    
	    List<Training> findTrainingByUsersId(Integer userId);
	    
	    Training findByIdAndMentorId(int trainingId, int mentorId);
	    
        Training findByIdAndUsersId(int trainingId, int userId);
	    
	    List<Training> findTrainingByStartDateBetween(Date startDate, Date endDate);
	    
	    List<Training> findTrainingByUsersIdAndStatusEquals(int userId,String progress);
	    
}
