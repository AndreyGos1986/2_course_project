package gos.Andrey1986._course_project.service;

import gos.Andrey1986._course_project.Question;

import java.util.Collection;

public interface ExamService {
    Collection <Question> getQuestions (int amount);
}
