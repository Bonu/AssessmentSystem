package edu.mum.cs.waa.fp.as.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.mum.cs.waa.fp.as.domain.Assessment;

@Repository
public interface AssessmentRepository extends CrudRepository<Assessment, Long>{

	
	public Assessment findById(Long id);
	
//	@Query(value="select assessment from Assessment assessment left join fetch assessment.questions where assessment.id= :id")
//	public Assessment findByIdWithQuestion(Long id);
	
//	 @Query("select assessment from Assessment assessment left join fetch assessment.questions where assessment.id= (:id)")
//	 public Assessment findByIdWithQuestion(Long id);
	
}
