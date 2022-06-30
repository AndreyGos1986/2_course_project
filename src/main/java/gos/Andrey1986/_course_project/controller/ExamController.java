package gos.Andrey1986._course_project.controller;

import gos.Andrey1986._course_project.Question;
import gos.Andrey1986._course_project.service.ExamService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
@RestController
public class ExamController {
    private final ExamService exService;

    public ExamController(ExamService service) {
        this.exService = service;
    }

    @GetMapping("get/{amount}")
    public Collection<Question> getQuestions(@PathVariable int amount) {
        return exService.getQuestions(amount);
    }
}
