package gos.Andrey1986._course_project.services;

import gos.Andrey1986._course_project.data.Question;

import java.util.List;

public interface QuestionService {
    public Question add (String question, String answer);
    public Question add (Question question);
    public Question remove (Question question);
    public List <Question> getAll();
    Question getRandomQuestion ();
}
