package gos.Andrey1986._course_project.config;

import gos.Andrey1986._course_project.repository.QuestionRepository;
import gos.Andrey1986._course_project.repository.impl.JQRepository;
import gos.Andrey1986._course_project.service.QuestionService;
import gos.Andrey1986._course_project.service.impl.JavaQuestionService;
import gos.Andrey1986._course_project.service.impl.MathService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QuestionConfig {
    @Bean
    public QuestionService javaService(JQRepository javaRepository) {
        return new JavaQuestionService(javaRepository);
    }

    @Bean
    public QuestionService mathService() {
        return new MathService();
    }
}
