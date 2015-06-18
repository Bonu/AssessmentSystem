package edu.mum.cs.waa.fp.as.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
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
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author Bharat
 *
 */
@Entity(name="ASSESSMENT")
public class Assessment implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ASSESSMENTID")
	private Long id;

	@NotEmpty
	private String nameAssessment;

	private String descriptionAssessment;

	@NotNull(message="dateAssessment")
	private Date dateAssessment;
	
	@Valid
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name="ASSESSMENT_QUESTION",
			joinColumns={@JoinColumn(name="ASSESSMENTID")},
	inverseJoinColumns={@JoinColumn(name="QUESTIONID", unique=true)})
	public List<Question> question = new ArrayList<Question>();
	
	
	
	public Date getDateAssessment() {
		return dateAssessment;
	}

	public void setDateAssessment(Date dateAssessment) {
		this.dateAssessment = dateAssessment;
	}

	public List<Question> getQuestion() {
		return question;
	}

	public void setQuestion(List<Question> question) {
		this.question = question;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNameAssessment() {
		return nameAssessment;
	}

	public void setNameAssessment(String nameAssessment) {
		this.nameAssessment = nameAssessment;
	}

	public String getDescriptionAssessment() {
		return descriptionAssessment;
	}

	public void setDescriptionAssessment(String descriptionAssessment) {
		this.descriptionAssessment = descriptionAssessment;
	}
	
	public void addQuestion(Question qtn){
		question.add(qtn);
	}
	
	public List<Question> getQuestions(){
		return question;
	}

	@Override
	public String toString() {
		return "Assessment [id=" + id + ", nameAssessment=" + nameAssessment
				+ ", descriptionAssessment=" + descriptionAssessment
				+ ", dateAssessment=" + dateAssessment + ", question="
				+ question + ", getDateAssessment()=" + getDateAssessment()
				+ ", getQuestion()=" + getQuestion() + ", getId()=" + getId()
				+ ", getNameAssessment()=" + getNameAssessment()
				+ ", getDescriptionAssessment()=" + getDescriptionAssessment()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((dateAssessment == null) ? 0 : dateAssessment.hashCode());
		result = prime
				* result
				+ ((descriptionAssessment == null) ? 0 : descriptionAssessment
						.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((nameAssessment == null) ? 0 : nameAssessment.hashCode());
		result = prime * result
				+ ((question == null) ? 0 : question.hashCode());
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
		Assessment other = (Assessment) obj;
		if (dateAssessment == null) {
			if (other.dateAssessment != null)
				return false;
		} else if (!dateAssessment.equals(other.dateAssessment))
			return false;
		if (descriptionAssessment == null) {
			if (other.descriptionAssessment != null)
				return false;
		} else if (!descriptionAssessment.equals(other.descriptionAssessment))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nameAssessment == null) {
			if (other.nameAssessment != null)
				return false;
		} else if (!nameAssessment.equals(other.nameAssessment))
			return false;
		if (question == null) {
			if (other.question != null)
				return false;
		} else if (!question.equals(other.question))
			return false;
		return true;
	}

	
}
