package com.khalid.question.simple;

import com.khalid.core.BaseEntitiy;

import javax.persistence.Entity;

@Entity
public class SingleOptTypeQue extends BaseEntitiy{

    private String singleOptQue;
    private String singleOptSolution;

    public SingleOptTypeQue() {
        super();
    }

    public SingleOptTypeQue(String singleOptQue, String singleOptSolution) {
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
}
