package edu.mum.cs.waa.fp.as.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


/**
 * The StudentAnswer hold the answers provided the Student in assessment.
 * This answer is further compared to actual answers for validation.
 * 
 * @see StudentQuestion
 * @see TakeAssessment
 * 
 * @author janardhanbonu
 *
 */

@Entity(name = "STUDENT_ANSWER")
public class StudentAnswer implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5564898731799682640L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ANSWERID")
	private int answerId;
	@Column(name = "DESCRIPTION")
	private String description;
	@Column(name = "ISCORRECT")
	private boolean isCorrect;
	
	
	
	public StudentAnswer(String description, boolean isCorrect) {
		super();
		this.description = description;
		this.isCorrect = isCorrect;
	}
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + answerId;
		result = prime * result
				+ ((description == null) ? 0 : description.hashCode());
		result = prime * result + (isCorrect ? 1231 : 1237);
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
		StudentAnswer other = (StudentAnswer) obj;
		if (answerId != other.answerId)
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (isCorrect != other.isCorrect)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "StudentAnswer [answerId=" + answerId + ", description="
				+ description + ", isCorrect=" + isCorrect + "]";
	}
	
	
}
