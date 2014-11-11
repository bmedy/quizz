package fr.netapsys.bmedy.quizz.rest;

import fr.netapsys.bmedy.quizz.domain.Question;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by medy on 11/11/14.
 */
@RestController
public class QuestionRest {

	@RequestMapping("/questions")
	public Question questions() {
		Question q = new Question();
		q.setTitle("test");
		return q;
	}
}
