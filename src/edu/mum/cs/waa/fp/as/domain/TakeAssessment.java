package edu.mum.cs.waa.fp.as.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class TakeAssessment {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@OneToMany
	private List<StudentQuestion> squestions;
	
	private int studentId;
	
	private int assessmentId;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
