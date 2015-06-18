package edu.mum.cs.waa.fp.as.domain;

import java.io.Serializable;
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

/**
 * The StudentQuestion is stored in TakeAssessment object.
 * It holds the question answered by the student.
 * 
 * @see TakeAssessment
 * 
 * @author janardhanbonu
 *
 */
@Entity(name = "STUDENT_QUESTION")
public class StudentQuestion implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4525276069664717397L;

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((answers == null) ? 0 : answers.hashCode());
		result = prime * result
				+ ((description == null) ? 0 : description.hashCode());
		result = prime * result + questionId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentQuestion other = (StudentQuestion) obj;
		if (answers == null) {
			if (other.answers != null)
				return false;
		} else if (!answers.equals(other.answers))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (questionId != other.questionId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "StudentQuestion [questionId=" + questionId + ", description="
				+ description + ", answers=" + answers + "]";
	}
	
	
	
}
