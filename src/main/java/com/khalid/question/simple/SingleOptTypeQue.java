package com.khalid.question.simple;

import com.khalid.core.BaseEntitiy;

import javax.persistence.Entity;

@Entity
public class SingleOptTypeQue extends BaseEntitiy{

    private String question;
    private String solution;

    public SingleOptTypeQue() {
        super();
    }

    public SingleOptTypeQue(String question, String solution) {
        this();
        this.question = question;
        this.solution = solution;
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
