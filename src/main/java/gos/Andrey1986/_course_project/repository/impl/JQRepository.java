package gos.Andrey1986._course_project.repository.impl;

import gos.Andrey1986._course_project.Question;
import gos.Andrey1986._course_project.repository.QuestionRepository;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@Repository
public class JQRepository implements QuestionRepository {

    private final Set<Question> questionSet;

    public JQRepository(Set<Question> questionSet) {
        this.questionSet = new HashSet<>();
    }
   @PostConstruct
    public void toSet () {
        add(new Question("Question1", "Answer1"));
        add(new Question("Question2", "Answer2"));
        add(new Question("Question3", "Answer3"));
        add(new Question("Question4", "Answer4"));
    }
    @Override
    public Question add(Question question) {
        if (question==null) {
            throw new IllegalArgumentException("Пытаетесь ввести недопустимое значение," +
                                                " вопрос не может быть пустым");
        }
        if (!questionSet.add(question)) {
            throw new IllegalArgumentException("Такой вопрос уже есть в списке");

        }
        return  question;


    }

    @Override
    public Question remove(Question question) {
        if (question==null) {
            throw new IllegalArgumentException("Пытаетесь ввести недопустимое значение,"+
                                                "вопрос не может быть пустым");
        } if(!questionSet.remove(question)) {
            throw new RuntimeException("The question isn't found");
        }
        return question;
    }

    @Override
    public Collection<Question> getAll() {
        return Collections.unmodifiableCollection(questionSet);
    }
}
