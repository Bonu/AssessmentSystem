package edu.mum.cs.waa.fp.as.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name="STUDENT_QUESTION_ANSWER",
	joinColumns={ @JoinColumn(name="QUESTIONID")},
	inverseJoinColumns={ @JoinColumn(name="ANSWERID" ) } )
	private List<StudentAnswer> answers;

	
	
	public StudentQuestion(String description, List<StudentAnswer> answers) {
		super();
		this.description = description;
		this.answers = answers;
	}

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
	 * @return the answers
	 */
	public List<StudentAnswer> getAnswers() {
		return answers;
	}

	/**
	 * @param questionId the questionId to set
	 */
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @param answers the answers to set
	 */
	public void setAnswers(List<StudentAnswer> answers) {
		this.answers = answers;
	}
	
	
}
