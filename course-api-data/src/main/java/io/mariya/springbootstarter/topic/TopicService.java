package io.mariya.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepository;

	
	public List<Topic> getAllTopics(){
		List<Topic> topics=new ArrayList<>();
		topicRepository.findAll().forEach(topics::add);
		return topics;
		
	}
	
	public Topic getTopic(String id) {
	return topicRepository.findAllById(id);
  }

	public void addTopic(Topic topic) {
		topicRepository.save(topic);
		
	}

	public void updateTopic(Topic topic, String id) {
		topicRepository.save(topic); // the repository knows enough to see if there is already a row in table with that id if row does not exist it  inserts but if it does exits it will update
		
			}
		
		
	

	public void deleteTopic(String id) {
		topicRepository.deleteById(id);
	}


}