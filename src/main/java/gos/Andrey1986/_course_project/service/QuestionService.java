package gos.Andrey1986._course_project.service;

import gos.Andrey1986._course_project.Question;

import java.util.Collection;

public interface QuestionService {
    Question add (String question, String answer);
    Question add (Question question);
    Question remove (Question question);
    Collection <Question> getAll();
    Question getRandomQuestion ();
}
