package com.khalid.question.simple;

import com.khalid.core.BaseEntitiy;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class SingleOptonQue extends BaseEntitiy{

    private String singleOptQue;
    private String singleOptSolution;
    @OneToOne(mappedBy = "singleOptionQue")
    private Question question;

    public SingleOptonQue() {
        super();
    }

    public SingleOptonQue(String singleOptQue, String singleOptSolution) {
        this();
        this.singleOptQue = singleOptQue;
        this.singleOptSolution = singleOptSolution;
    }

    public String getSingleOptQue() {
        return singleOptQue;
    }

    public void setSingleOptQue(String singleOptQue) {
        this.singleOptQue = singleOptQue;
    }

    public String getSingleOptSolution() {
        return singleOptSolution;
    }

    public void setSingleOptSolution(String singleOptSolution) {
        this.singleOptSolution = singleOptSolution;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }
}
