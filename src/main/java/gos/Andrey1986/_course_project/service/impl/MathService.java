package gos.Andrey1986._course_project.service.impl;

import gos.Andrey1986._course_project.Question;
import gos.Andrey1986._course_project.service.QuestionService;
import org.springframework.web.server.MethodNotAllowedException;

import java.util.Collection;
import java.util.Random;

public class MathService implements QuestionService {
    @Override
    public Question add(String question, String answer) {
        throw new MethodNotAllowedException("add", null);
    }

    @Override
    public Question add(Question question) {
        throw new MethodNotAllowedException("add", null);
    }

    @Override
    public Question remove(Question question) {
        throw new MethodNotAllowedException("remove", null);
    }

    @Override
    public Collection<Question> getAll() {
        throw new MethodNotAllowedException("getAll", null);
    }

    @Override
    public Question getRandomQuestion() {
        Random random = new Random();
        int num1 = random.nextInt(Short.MAX_VALUE);
        int num2 = random.nextInt(Short.MAX_VALUE);
        int operator = random.nextInt(6);
        switch (operator) {
            case 1:
                return new Question(num1 + " - " + num2 + " = ?", Integer.toString(num1 - num2));
            case 2:
                return new Question(num1 + " * " + num2 + " = ?", Integer.toString(num1 * num2));
            case 3:
                if(num2 == 0) {
                    num2 = 1;
                }
                return new Question(num1 + " / " + num2 + " = ?", Integer.toString(num1 / num2));
        }


        return new Question(num1 + " + " + num2 + " = ?", Integer.toString(num1 + num2));
    }
}
