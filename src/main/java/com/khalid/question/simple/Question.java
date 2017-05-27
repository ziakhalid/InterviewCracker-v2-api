package com.khalid.question.simple;

import com.khalid.core.BaseEntitiy;
import com.khalid.core.QuestionType;

import javax.persistence.Entity;

@Entity
public class Question extends BaseEntitiy {

    private QuestionType questionType;
    private String note;

    public Question() {
        super();
    }

    public Question(QuestionType questionType, String note) {
        this();
        this.questionType = questionType;
        this.note = note;
    }


    public QuestionType getQuestionType() {
        return questionType;
    }

    public void setQuestionType(QuestionType questionType) {
        this.questionType = questionType;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

}
