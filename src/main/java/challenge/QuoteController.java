package challenge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@RestController
@RequestMapping("/v1")
public class QuoteController {

	@Autowired
	private QuoteService service;

	@JsonDeserialize
	@RequestMapping(value="/quote", method=RequestMethod.GET)
	public Quote getQuote() {
		return service.getQuote();
	}

	@RequestMapping(value="quote/{actor}", method=RequestMethod.GET)
	public Quote getQuoteByActor(@PathVariable("actor") String actor) {
		return service.getQuoteByActor(actor);
	}
	
}
