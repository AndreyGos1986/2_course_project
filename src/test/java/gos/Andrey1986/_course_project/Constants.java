package gos.Andrey1986._course_project;

import java.util.Collection;
import java.util.List;
import java.util.Set;

public class Constants {
    public static final Question QUESTION_1 = new Question("Q1", "A1");
    public static final Question QUESTION_2 = new Question("Q2", "A2");
    public static final Question QUESTION_3 = new Question("Q3", "A3");
    public static final Question QUESTION_4 = new Question("Q4", "A4");

    public static final Collection<Question> REPOSITORY_LIST = List.of(QUESTION_1, QUESTION_2, QUESTION_3, QUESTION_4);

    public static final Collection<Question> REPOSITORY_SET = Set.of(QUESTION_1, QUESTION_2, QUESTION_3, QUESTION_4);

}
