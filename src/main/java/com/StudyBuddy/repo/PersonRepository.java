package com.StudyBuddy.repo;

import com.StudyBuddy.Domain.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person,Long> {
}
