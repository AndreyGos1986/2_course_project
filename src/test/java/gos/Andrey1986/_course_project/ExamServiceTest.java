package gos.Andrey1986._course_project;


import gos.Andrey1986._course_project.service.impl.ExamServiceImpl;
import gos.Andrey1986._course_project.service.impl.JavaQuestionService;
import gos.Andrey1986._course_project.service.impl.MathService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.web.server.MethodNotAllowedException;

import java.util.Collection;

import static gos.Andrey1986._course_project.Constants.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class ExamServiceTest {

    @Mock
    private JavaQuestionService javaTestService;
    @Mock
    private MathService mathTestService;
    private ExamServiceImpl out;

    @Test
    public void shouldEqualsRepositorySet() {
        out = new ExamServiceImpl(javaTestService);

        when(javaTestService.getRandomQuestion()).thenReturn(QUESTION_1, QUESTION_2, QUESTION_3, QUESTION_3, QUESTION_3, QUESTION_4);
        assertEquals(REPOSITORY_SET, out.getQuestions(4));

        verify(javaTestService, times(6)).getRandomQuestion();
    }

    @Test
    public void shouldContainsBothQuestions() {
        out = new ExamServiceImpl(javaTestService, mathTestService);

        when(javaTestService.getRandomQuestion()).thenReturn(QUESTION_1);
        when(mathTestService.getRandomQuestion()).thenReturn(QUESTION_2);

        Collection<Question> ret = out.getQuestions(2);

        assertTrue(ret.contains(QUESTION_1));
        assertTrue(ret.contains(QUESTION_2));
    }

    @Test
    public void shouldThrowException() {
        MathService out = new MathService();
        assertThrows(MethodNotAllowedException.class, () -> out.add("", ""));
    }
}
