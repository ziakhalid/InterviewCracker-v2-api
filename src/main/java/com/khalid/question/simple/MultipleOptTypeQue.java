package com.khalid.question.simple;

import com.khalid.core.BaseEntitiy;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.Collection;

@Entity
public class MultipleOptTypeQue extends BaseEntitiy{

    private String question;
    @ElementCollection
    private Collection<String> options = new ArrayList<>();

    public MultipleOptTypeQue() {
        super();
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Collection<String> getOptions() {
        return options;
    }

    public void addOptions(String option) {
        this.options.add(option);
    }
}
