package com.khalid.topic;

import com.khalid.core.TopicType;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TopicRepository extends CrudRepository<Topic, Long>{

    List<Topic> findByTopicType(TopicType topicType);

}
