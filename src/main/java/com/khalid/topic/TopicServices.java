package com.khalid.topic;

import com.khalid.core.TopicType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class TopicServices {

    @Autowired
    TopicRepository topics;

    public Collection<Topic> getTopicByType(String topicType){

        if(topicType.equalsIgnoreCase("JAVA")){
           return topics.findByTopicType(TopicType.JAVA);
        }

        if(topicType.equalsIgnoreCase("ANDROID")){
            return topics.findByTopicType(TopicType.ANDROID);
        }

        return null;
    }


}



