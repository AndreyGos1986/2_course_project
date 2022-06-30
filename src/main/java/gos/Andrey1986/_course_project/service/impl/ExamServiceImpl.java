package gos.Andrey1986._course_project.service.impl;


import gos.Andrey1986._course_project.Question;
import gos.Andrey1986._course_project.service.ExamService;
import gos.Andrey1986._course_project.service.QuestionService;
import org.springframework.stereotype.Service;



import java.util.*;

@Service
public class ExamServiceImpl implements ExamService {
    private final List<QuestionService> services;
    private final Random random;

    public ExamServiceImpl(QuestionService... service) {
        this.services = new ArrayList<>(List.of(service));
        this.random = new Random();
    }
    @Override
    public Collection<Question> getQuestions(int amount) {
        Set<Question> collection = new HashSet<>();
        while (collection.size() < amount) {
            final int num = random.nextInt(services.size());
            QuestionService service = services.get(num);

            collection.add(service.getRandomQuestion());
        }
        return collection;
    }
}
