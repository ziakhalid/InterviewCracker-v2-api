package com.khalid.topic;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.khalid.core.BaseEntitiy;
import com.khalid.core.TopicType;
import com.khalid.question.simple.SingleTypeQuestion;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Topic extends BaseEntitiy{
    @Enumerated(EnumType.STRING)
    private TopicType topicType;
    private String topicName;
    private int questionCount;
    @JsonIgnore
    @OneToMany(mappedBy = "topic", cascade = CascadeType.ALL)
    private List<SingleTypeQuestion> singleTypeQuestions;

    protected Topic() {
        super();
        singleTypeQuestions = new ArrayList<>();
    }

    public Topic(TopicType topicType, String topicName, int questionCount) {
        this();
        this.topicType = topicType;
        this.topicName = topicName;
        this.questionCount = questionCount;
    }

    public TopicType getTopicType() {
        return topicType;
    }

    public void setTopicType(TopicType topicType) {
        this.topicType = topicType;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public int getQuestionCount() {
        return questionCount;
    }

    public void setQuestionCount(int questionCount) {
        this.questionCount = questionCount;
    }

    public List<SingleTypeQuestion> getSingleTypeQuestions() {
        return singleTypeQuestions;
    }


    public void addSingleTypeQuestions(SingleTypeQuestion singleTypeQuestion) {
        singleTypeQuestion.setTopic(this);
        singleTypeQuestions.add(singleTypeQuestion);

    }


}
