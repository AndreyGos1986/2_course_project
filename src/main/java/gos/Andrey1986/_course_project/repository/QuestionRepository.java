package gos.Andrey1986._course_project.repository;

import gos.Andrey1986._course_project.Question;

import java.util.Collection;

public interface QuestionRepository {

    Question add(Question question);

    Question remove(Question question);

    Collection<Question> getAll();
}
