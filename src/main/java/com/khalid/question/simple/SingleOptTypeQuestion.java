package com.khalid.question.simple;

import com.khalid.core.BaseEntitiy;
import com.khalid.topic.Topic;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class SingleOptTypeQuestion extends BaseEntitiy{

    private Long questionId;
    private String question;
    private String solution;
    @ManyToOne
    private Topic topic;

    public SingleOptTypeQuestion() {
        super();
    }

    public SingleOptTypeQuestion(String question, String solution) {
        this();
        this.question = question;
        this.solution = solution;
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    public Long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }
}
