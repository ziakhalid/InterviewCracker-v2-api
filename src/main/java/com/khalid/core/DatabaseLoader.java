package com.khalid.core;

import com.khalid.question.simple.Question;
import com.khalid.question.simple.SingleOptTypeQue;
import com.khalid.topic.Topic;
import com.khalid.topic.TopicRepository;
import com.khalid.user.User;
import com.khalid.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class DatabaseLoader implements ApplicationRunner{

    private TopicRepository topics;
    private UserRepository users;

    @Autowired
    public DatabaseLoader(TopicRepository topics, UserRepository users) {
        this.topics = topics;
        this.users = users;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

        List<User> students = Arrays.asList(
                new User("jacobproffer", "Jacob",  "Proffer", "password", new String[] {"ROLE_USER"}),
                new User("mlnorman", "Mike",  "Norman", "password", new String[] {"ROLE_USER"}),
                new User("k_freemansmith", "Karen",  "Freeman-Smith", "password", new String[] {"ROLE_USER"}),
                new User("seth_lk", "Seth",  "Kroger", "password", new String[] {"ROLE_USER"}),
                new User("mrstreetgrid", "Java",  "Vince", "password", new String[] {"ROLE_USER"}),
                new User("anthonymikhail", "Tony",  "Mikhail", "password", new String[] {"ROLE_USER"}),
                new User("boog690", "AJ",  "Teacher", "password", new String[] {"ROLE_USER"}),
                new User("faelor", "Erik",  "Faelor Shafer", "password", new String[] {"ROLE_USER"}),
                new User("christophernowack", "Christopher",  "Nowack", "password", new String[] {"ROLE_USER"}),
                new User("calebkleveter", "Caleb",  "Kleveter", "password", new String[] {"ROLE_USER"}),
                new User("richdonellan", "Rich",  "Donnellan", "password", new String[] {"ROLE_USER"}),
                new User("albertqerimi", "Albert",  "Qerimi", "password", new String[] {"ROLE_USER"})
        );
        users.save(students);
        users.save(new User("zia", "khalid", "zia566", "123456", new String[] {"ROLE_USER", "ROLE_ADMIN"}));

        ArrayList<Topic> bunchOfTopic = new ArrayList<Topic>();

        String[] javaBuzzWords = {"Inner Class", "Exception handling", "Collection", "Generics", "Development", "JVM"};
        String[] androidBuzzWords = {"Activity", "Content Provider", "Services", "Braodcase Reciver", "Fragment"};


        String[] queBuzzWords = {"What is inner class", "What is Generics", "What is volatile KeyWord"};
        String[] ansBuzzWords = {"This  is inner class", "This is Generics", "This is volatile KeyWord"};

        List<Question> questions = new ArrayList<>();

        Topic topic1 = new Topic(TopicType.JAVA, "Colletion", 56);
        Question question = new Question(QuestionType.NOTE, "Here is the note sir");
        SingleOptTypeQue singleOptTypeQue = new SingleOptTypeQue("Single Opton question ?", "Single Opt Solution");
        Question question1 = new Question(QuestionType.SINGLE, singleOptTypeQue);

        topic1.addQuestions(question);
        topic1.addQuestions(question1);
        bunchOfTopic.add(topic1);

        topics.save(bunchOfTopic);
    }
}
