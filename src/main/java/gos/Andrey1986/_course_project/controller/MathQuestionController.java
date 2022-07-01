package gos.Andrey1986._course_project.controller;

import gos.Andrey1986._course_project.Question;
import gos.Andrey1986._course_project.service.QuestionService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/math/")
public class MathQuestionController {
    @Qualifier("MathService")
    private final QuestionService mQuestionService;
        public MathQuestionController (@Qualifier("mathService") QuestionService mQuestionService) {
        this.mQuestionService = mQuestionService;
    }

    @RequestMapping()
    public Collection<Question> getAllQuestions () {
        return mQuestionService.getAll();
    }

    @RequestMapping("/add")
    public Question addQuestion (@RequestParam("question") String question,
                                 @RequestParam("answer") String answer) {
        return mQuestionService.add(question, answer);
    }

    @RequestMapping("/remove")
    public Question removeQuestion (@RequestParam("question") String question,
                                    @RequestParam("answer") String answer) {
        return mQuestionService.remove(new Question(question, answer));
    }
}
