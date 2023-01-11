package com.tutorial.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tutorial.entity.Tutorial;

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {

}
