package com.tutorial.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Tutorial {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "tutorial_id")
	private Long id;
	@Column(name = "tutorial_title")
	@Size(max = 20)
	private String title;
	@Column(name = "tutorial_description")
	@Size(max = 120)
	private String description;
	@Column(name = "tutorial_published")
	private boolean published;

}
