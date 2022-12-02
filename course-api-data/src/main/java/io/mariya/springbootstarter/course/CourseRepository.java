package io.mariya.springbootstarter.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course,String> {

	public List<Course> findByTopicId(String topicId);

	public Course findAllById(String id);
}
