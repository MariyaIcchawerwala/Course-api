package io.mariya.springbootstarter.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;

	
	public List<Course> getAllCourses(String topicId){
		List<Course> courses=new ArrayList<>();
		courseRepository.findByTopicId(topicId).forEach(courses::add);
		return courses;
		
	}
	
	public Course getCourse(String id) {
		return courseRepository.findAllById(id);
		
	
  }

	public void addCourse(Course course) {
		courseRepository.save(course);
		
	}

	public void updateCourse(Course course) {
		courseRepository.save(course); // the repository knows enough to see if there is already a row in table with that id if row does not exist it  inserts but if it does exits it will update
		
			}
		
		
	

	public void deleteCourse(String id) {
		courseRepository.deleteById(id);
	}


}