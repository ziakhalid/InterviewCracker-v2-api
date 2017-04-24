package com.khalid.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class TopicController {

    @Autowired
    TopicServices topicServices;

    @GetMapping("/topics/{topicType}")
    public List<Topic> getTopicByType(@PathVariable String topicType){
       return topicServices.getTopicByType(topicType);
    }

}
