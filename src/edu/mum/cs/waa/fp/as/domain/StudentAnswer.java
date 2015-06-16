package edu.mum.cs.waa.fp.as.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "STUDENT_ANSWER")
public class StudentAnswer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ANSWERID")
	private int answerId;
	
	@Column(name = "DESCRIPTION")
	private String description;
	
	@Column(name = "ISCORRECT")
	private boolean isCorrect;
	/**
	 * @return the answerId
	 */
	public int getAnswerId() {
		return answerId;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @return the isCorrect
	 */
	public boolean isCorrect() {
		return isCorrect;
	}
	/**
	 * @param answerId the answerId to set
	 */
	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @param isCorrect the isCorrect to set
	 */
	public void setCorrect(boolean isCorrect) {
		this.isCorrect = isCorrect;
	}
}
