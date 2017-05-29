package com.khalid.question.simple;

import com.khalid.core.BaseEntitiy;
import com.khalid.core.QuestionType;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Question extends BaseEntitiy {

    private QuestionType questionType;
    private String note;
    @OneToOne
    @Cascade(CascadeType.ALL)
    private SingleOptTypeQue singleOptTypeQue;

    public Question() {
        super();
    }

    public Question(QuestionType questionType, String note) {
        this();
        this.questionType = questionType;
        this.note = note;
    }

    public Question(QuestionType questionType, SingleOptTypeQue singleOptTypeQue) {
        this();
        this.questionType = questionType;
        this.singleOptTypeQue = singleOptTypeQue;
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

    public SingleOptTypeQue getSingleOptTypeQue() {
        return singleOptTypeQue;
    }

    public void setSingleOptTypeQue(SingleOptTypeQue singleOptTypeQue) {
        this.singleOptTypeQue = singleOptTypeQue;
    }
}
