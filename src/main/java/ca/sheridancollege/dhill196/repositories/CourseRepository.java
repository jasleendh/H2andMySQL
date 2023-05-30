package ca.sheridancollege.dhill196.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ca.sheridancollege.dhill196.beans.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
