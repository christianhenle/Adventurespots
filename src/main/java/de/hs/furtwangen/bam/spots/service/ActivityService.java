package de.hs.furtwangen.bam.spots.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.hs.furtwangen.bam.spots.model.Activity;
import de.hs.furtwangen.bam.spots.repository.ActivityRepository;

@Service
public class ActivityService {
	
	@Autowired
	private ActivityRepository activityRepository;
	
	public Iterable<Activity> findBySpotId(Integer id){
		System.out.println("SpotId "+id);
		return activityRepository.findBySpotId(id);
	}

}
