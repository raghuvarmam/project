package com.bringboard.dao;

import java.util.List;

import com.bringboard.model.Trainer;

public interface TrainerDAO {
	public void saveTrainer(Trainer t);
	public void deleteTrainer(String tname);
	public void updateTrainer(Trainer t);
	public List<Trainer> allTrainers();
	public List<Trainer> fetchTrainer(String tname);


}
