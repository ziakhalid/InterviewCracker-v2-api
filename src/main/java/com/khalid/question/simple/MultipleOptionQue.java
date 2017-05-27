package com.khalid.question.simple;

import com.khalid.core.BaseEntitiy;

import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.List;

public class MultipleOptionQue extends BaseEntitiy{

    private String question;
//    private List<String> options;

    public MultipleOptionQue() {
        super();
//        options = new ArrayList<>();
    }

    public MultipleOptionQue(String question, List<String> options) {
        this();
        this.question = question;
//        this.options = options;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

/*
    public List<String> getOptions() {
        return options;
    }

    public void setOption(String option) {
        this.options.add(option);
    }
*/
}
