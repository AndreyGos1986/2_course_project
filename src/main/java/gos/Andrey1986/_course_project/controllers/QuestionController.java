package gos.Andrey1986._course_project.controllers;

import gos.Andrey1986._course_project.data.Question;
import gos.Andrey1986._course_project.services.QuestionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {
    private final QuestionService questionService;

    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @RequestMapping ("/add")
    public Question addQuestion () {
        return questionService.add();

    @RequestMapping("/remove")


    @RequestMapping("/{}/{}")
    public List<Question> getAllQuestions() {
        return questionService.getAll();
    }


}
}
