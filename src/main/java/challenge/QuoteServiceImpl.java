package challenge;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuoteServiceImpl implements QuoteService {

	@Autowired
	private QuoteRepository repository;

	@Override
	public Quote getQuote() {
		List<Quote> list = this.repository.findAll();
		Quote findOne = list.stream().findAny().get();
		return findOne;
	}

	@Override
	public Quote getQuoteByActor(String actor) {
		List<Quote> listActor = repository.findByActor(actor);
		
		Quote quote = listActor.stream().findAny().get();
		return quote;
	}

}
