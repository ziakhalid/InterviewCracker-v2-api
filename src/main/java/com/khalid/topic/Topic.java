package com.khalid.topic;

import com.khalid.core.BaseEntitiy;
import com.khalid.core.TopicType;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
public class Topic extends BaseEntitiy{
    @Enumerated(EnumType.STRING)
    private TopicType topicType;
    private String name;
    private int questionCount;

    protected Topic() {
        super();
    }

    public Topic(TopicType topicType, String name, int questionCount) {
        this();
        this.topicType = topicType;
        this.name = name;
        this.questionCount = questionCount;
    }

    public TopicType getTopicType() {
        return topicType;
    }

    public void setTopicType(TopicType topicType) {
        this.topicType = topicType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuestionCount() {
        return questionCount;
    }

    public void setQuestionCount(int questionCount) {
        this.questionCount = questionCount;
    }
}
