package gos.Andrey1986._course_project.service.impl;

import gos.Andrey1986._course_project.Question;
import gos.Andrey1986._course_project.repository.QuestionRepository;
import gos.Andrey1986._course_project.repository.impl.JQRepository;
import gos.Andrey1986._course_project.service.QuestionService;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Iterator;
import java.util.Random;

@Service
public class JavaQuestionService implements QuestionService {

    private final QuestionRepository repository;

    public JavaQuestionService(QuestionRepository jqRepository) {
        this.repository = jqRepository;
    }

    @Override
    public Question add(String question, String answer) {

        return add(new Question(question, answer));
    }


    @Override
    public Question add(Question question) {
        if (question != null && question.getQuestion().equals(question.getAnswer()))
            throw new RuntimeException("Question == Answer");
        return repository.add(question);
    }

    @Override
    public Question remove(Question question) {
        return repository.remove(question);
    }

    @Override
    public Collection<Question> getAll() {
        return repository.getAll();
    }

    @Override
    public Question getRandomQuestion() {
        Collection<Question> set = repository.getAll();
        final int num = new Random().nextInt(set.size());
        int count = 0;
        Iterator<Question> it = set.iterator();
        while (it.hasNext()) {
            Question question = it.next();
            if ((count++) == num) {
                return question;
            }
        }
        throw new RuntimeException("Что-то пошло не так");
    }
}
