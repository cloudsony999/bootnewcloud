package com.tutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tutorial.entity.Tutorial;
import com.tutorial.repository.TutorialRepository;

@SpringBootApplication
public class TutorialspringbootApplication implements CommandLineRunner {

	@Autowired
	private TutorialRepository tutorialRepository;

	public static void main(String[] args) {
		SpringApplication.run(TutorialspringbootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Tutorial t1 = Tutorial.builder().title("java").description("core java").published(true).build();
		Tutorial t2 = Tutorial.builder().title("python").description("core python").published(true).build();
		Tutorial t3 = Tutorial.builder().title("sql").description("basic sql").published(true).build();
		Tutorial t4 = Tutorial.builder().title("web").description("html5").published(true).build();

		tutorialRepository.save(t1);
		tutorialRepository.save(t2);
		tutorialRepository.save(t3);
		tutorialRepository.save(t4);
		System.out.println("----------------------all saved----------------------");

	}

}
