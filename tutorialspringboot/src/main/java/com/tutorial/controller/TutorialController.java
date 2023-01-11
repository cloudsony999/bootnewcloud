package com.tutorial.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.tutorial.entity.Tutorial;
import com.tutorial.repository.TutorialRepository;

@RestController
public class TutorialController {

	@Autowired
	private TutorialRepository tutorialRepository;

	@GetMapping("/tutorials/{tid}")
	public ResponseEntity<Tutorial> getTutorialById(@PathVariable("tid") long id) {
		Optional<Tutorial> tutorialData = tutorialRepository.findById(id);
		if (tutorialData.isPresent())
			return new ResponseEntity<>(tutorialData.get(), HttpStatus.OK);
		else
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);

	}

}
