package guru.springframework.chucknorriswebapp.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeService {
    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeService() {
        chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    public String getNextRandomJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
