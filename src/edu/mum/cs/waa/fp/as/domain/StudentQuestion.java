package edu.mum.cs.waa.fp.as.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

@Entity(name = "STUDENT_QUESTION")
public class StudentQuestion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "QUESTIONID")
	private int questionId;
	
	@Column(name = "DESCRIPTION")
	private String description;
	
	@OneToMany
	@JoinTable(name="S_QUESTION_ANSWER",
	joinColumns={ @JoinColumn(name="QUESTIONID")},
	inverseJoinColumns={ @JoinColumn(name="ANSWERID" ) } )
	private List<StudentAnswer> studentanswers;

	
	/**
	 * @return the questionId
	 */
	public int getQuestionId() {
		return questionId;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	
	/**
	 * @param questionId the questionId to set
	 */
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	/**
	 * @return the answers
	 */
	
	public List<StudentAnswer> getStudentanswers() {
		return studentanswers;
	}

	/**
	 * @param answers the answers to set
	 */
	public void setStudentanswers(List<StudentAnswer> studentanswers) {
		this.studentanswers = studentanswers;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	
}
