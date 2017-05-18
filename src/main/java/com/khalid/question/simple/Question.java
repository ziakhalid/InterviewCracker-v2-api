package com.khalid.question.simple;

import com.khalid.core.BaseEntitiy;
import com.khalid.core.QuestionType;
import com.khalid.topic.Topic;

import javax.persistence.*;

@Entity
public class Question extends BaseEntitiy {

    private QuestionType questionType;
    @OneToOne(cascade = CascadeType.ALL)
    private SingleOptonQue singleOptionQue;
    private String note;
    @ManyToOne
    private Topic topic;

    public Question() {
        super();
    }

    public Question(QuestionType questionType, String note) {
        this();
        this.questionType = questionType;
        this.note = note;
    }

    public Question(QuestionType questionType, SingleOptonQue singleOptionQue) {
        this();
        this.questionType = questionType;
        this.singleOptionQue = singleOptionQue;
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
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


    public SingleOptonQue getSingleOptonQue() {
        return singleOptionQue;
    }

    public void setSingleOptonQue(SingleOptonQue singleOptonQue) {
        this.singleOptionQue = singleOptonQue;
    }

}
