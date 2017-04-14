package com.khalid.core;

import com.khalid.topic.Topic;
import com.khalid.topic.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

import java.util.ArrayList;
import java.util.stream.IntStream;


public class DatabaseLoader implements ApplicationRunner{

    private TopicRepository topics;

    @Autowired
    public DatabaseLoader(TopicRepository topics) {
        this.topics = topics;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

        ArrayList<Topic> bunchOfTopic = new ArrayList<Topic>();

        String[] buzzTopic = {"Inner Class", "Exception handling", "Collection", "Generics", "Development", "JVM"};

        IntStream.range(0,10).forEach(it -> {
            Topic topic = new Topic(buzzTopic[it % bunchOfTopic.size()], (it % bunchOfTopic.size()));
            bunchOfTopic.add(topic);
        });

        topics.save(bunchOfTopic);
    }
}
