package edu.mum.cs.waa.fp.as.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * The TakeAssessment object is a result object created after assessment
 * is done by the student.
 * 
 * @author janardhanbonu
 *
 */
@Entity
public class TakeAssessment  implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7385855769223267233L;

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="takeAssessmentId")
	private int id;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<StudentQuestion> squestions = new ArrayList<StudentQuestion>();

	@Column(name="StudentName")
	private String studentName;
	
	@Column(name="AssessmentName")
	private String assessmentName;

	@Column(name="result")
	private int result;
	
	
	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	public List<StudentQuestion> getSquestions() {
		return squestions;
	}

	public void setSquestions(List<StudentQuestion> squestions) {
		this.squestions = squestions;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getAssessmentName() {
		return assessmentName;
	}

	public void setAssessmentName(String assessmentName) {
		this.assessmentName = assessmentName;
	}

	public int getId() {
		return id;
	}
	
	public void addStudentQuestion(StudentQuestion studentQuestion){
		squestions.add(studentQuestion);
	}
	
	public void addStudentQuestions(List<StudentQuestion> studentQuestions){
		squestions.addAll(studentQuestions);
	}

	@Override
	public String toString() {
		return "TakeAssessment [id=" + id + ", squestions=" + squestions
				+ ", studentId=" + studentName + ", assessmentName=" + assessmentName
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((assessmentName == null) ? 0 : assessmentName.hashCode());
		result = prime * result + id;
		result = prime * result + this.result;
		result = prime * result
				+ ((squestions == null) ? 0 : squestions.hashCode());
		result = prime * result
				+ ((studentName == null) ? 0 : studentName.hashCode());
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
		TakeAssessment other = (TakeAssessment) obj;
		if (assessmentName == null) {
			if (other.assessmentName != null)
				return false;
		} else if (!assessmentName.equals(other.assessmentName))
			return false;
		if (id != other.id)
			return false;
		if (result != other.result)
			return false;
		if (squestions == null) {
			if (other.squestions != null)
				return false;
		} else if (!squestions.equals(other.squestions))
			return false;
		if (studentName == null) {
			if (other.studentName != null)
				return false;
		} else if (!studentName.equals(other.studentName))
			return false;
		return true;
	}
	
	
	
}
