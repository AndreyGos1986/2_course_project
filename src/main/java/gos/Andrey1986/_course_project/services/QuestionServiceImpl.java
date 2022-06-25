package gos.Andrey1986._course_project.services;

import gos.Andrey1986._course_project.data.Question;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService{

//    protected final QuestionRepository questionRepository;
//
//
//    public QuestionServiceImpl(QuestionRepository questionRepository) {
//        this.questionRepository = questionRepository;
//    }
    @Override
    public Question add(String question, String answer) {
        return null;
    }

    @Override
    public Question add(Question question) {
        return null;
    }

    @Override
    public Question remove(Question question) {
        return null;
    }

    @Override
    public List<Question> getAll() {
        return null;
    }

    @Override
    public Question getRandomQuestion() {
        return null;
    }
}
