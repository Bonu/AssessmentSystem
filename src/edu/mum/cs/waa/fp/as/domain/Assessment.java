package edu.mum.cs.waa.fp.as.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
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

	private Date date;
	
	@Valid
	@OneToMany
	@JoinTable(name="ASSESSMENT_QUESTION",
			joinColumns={@JoinColumn(name="ASSESSMENTID")},
	inverseJoinColumns={@JoinColumn(name="QUESTIONID", unique=true)})
	public List<Question> question;
	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
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

}
