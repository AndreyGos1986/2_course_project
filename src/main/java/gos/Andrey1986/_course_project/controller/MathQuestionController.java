package gos.Andrey1986._course_project.controller;

import gos.Andrey1986._course_project.service.QuestionService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math/")
public class MathQuestionController extends JavaQuestionController {

    public MathQuestionController(QuestionService mQuestionService) {
        super(mQuestionService);
    }
}
