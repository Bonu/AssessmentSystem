package edu.mum.cs.waa.fp.as.domain;

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

@Entity
public class TakeAssessment {

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
	
	
	
}
