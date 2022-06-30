package gos.Andrey1986._course_project.controller;

import gos.Andrey1986._course_project.Question;
import gos.Andrey1986._course_project.service.QuestionService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping ()
public class JavaQuestionController {
    QuestionService questionService;

    public JavaQuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @RequestMapping ("/add")
    public Question addQuestion (@RequestParam(name = "question") String question,
                                 @RequestParam(name = "answer") String answer) {
        return questionService.add(question,answer);
    }
    @RequestMapping ("/remove")
    public Question removeQuestion (@RequestParam(name = "question") String question,
                            @RequestParam(name = "answer") String answer) {
        return questionService.remove(new Question(question, answer));
    }
        @RequestMapping ("/java")
        public Collection <Question> getQuestions (){
            return questionService.getAll();
        }
}
