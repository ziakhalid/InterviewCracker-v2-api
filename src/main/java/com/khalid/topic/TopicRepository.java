package com.khalid.topic;

import com.khalid.core.TopicType;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

public interface TopicRepository extends CrudRepository<Topic, Long>{

//    List<Topic> findByTopicType(TopicType topicType);

    //select a from Topic a where a.topicname = :topicname
    Collection<Topic> findByTopicName(String topicName);

    //select a from Topic a where a.topicType = :topicType
    Collection<Topic> findByTopicType(TopicType topicType);

}
