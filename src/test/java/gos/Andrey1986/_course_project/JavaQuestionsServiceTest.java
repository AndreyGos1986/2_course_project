package gos.Andrey1986._course_project;

import gos.Andrey1986._course_project.repository.QuestionRepository;
import gos.Andrey1986._course_project.repository.impl.JQRepository;
import gos.Andrey1986._course_project.service.impl.JavaQuestionService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static gos.Andrey1986._course_project.Constants.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class JavaQuestionsServiceTest {
    @Mock
    private QuestionRepository testRepository;
    private JavaQuestionService out;

    @BeforeEach
    public void init() {
        out = new JavaQuestionService(testRepository);
    }

    @Test
    public void shouldReturnRuntimeExceptionWhenQuestionEqualsAnswer() {
        assertThrows(RuntimeException.class, () -> {
            out.add("Question", "Question");
        });
    }

    @Test
    public void shouldReturnQuestion1WhenAddQuestion1String() {
        when( testRepository.add(QUESTION_1)).thenReturn(QUESTION_1);

        assertEquals(QUESTION_1, out.add("Q1", "A1"));
    }

    @Test
    public void shouldReturnQuestion1WhenAddQuestion1() {
        when( testRepository.add(QUESTION_1)).thenReturn(QUESTION_1);

        assertEquals(QUESTION_1, out.add(QUESTION_1));
    }

    @Test
    public void shouldReturnQuestion1WhenRemoveQuestion1() {
        when( testRepository.remove(QUESTION_1)).thenReturn(QUESTION_1);

        assertEquals(QUESTION_1, out.remove(QUESTION_1));
    }

    @Test
    public void shouldReturnCollectionWhenCallingGetAll() {
        when(testRepository.getAll()).thenReturn(REPOSITORY_LIST);

        assertEquals(REPOSITORY_LIST, out.getAll());
    }

    @Test
    public void shouldReturnSomethingRandomInRangeRepository() {
        when(testRepository.getAll()).thenReturn(REPOSITORY_LIST);

        assertTrue(REPOSITORY_LIST.contains(out.getRandomQuestion()));

        verify(testRepository, times(1)).getAll();
    }
}
