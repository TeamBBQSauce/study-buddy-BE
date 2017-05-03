package com.StudyBuddy.repo;

import com.StudyBuddy.Domain.Feedback;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "feedback", path="/feedback")
public interface FeedbackRepository extends CrudRepository<Feedback, String> {

}
