package challenge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/v1")
public class QuoteController {

	@Autowired
	private QuoteService service;

	public Quote getQuote() {
		return service.getQuote();
	}

	@RequestMapping(value="quote/{actor}")
	public Quote getQuoteByActor(String actor) {
		return service.getQuoteByActor(actor);
	}

}
