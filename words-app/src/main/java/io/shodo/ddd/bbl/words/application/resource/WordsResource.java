package io.shodo.ddd.bbl.words.application.resource;

import io.shodo.ddd.bbl.words.application.dto.MongoCombination;
import io.shodo.ddd.bbl.words.application.dto.MongoSentence;
import io.shodo.ddd.bbl.words.application.dto.MongoWord;
import io.shodo.ddd.bbl.words.infrastructure.repository.WordRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
public class WordsResource {

    private WordRepository wordRepository;

    public WordsResource(WordRepository wordRepository) {
        this.wordRepository = wordRepository;
    }

    @GetMapping("/words")
    public ResponseEntity<List<MongoWord>> findAll() {
        return ResponseEntity.ok(wordRepository.findAll());
    }

    @GetMapping("/words")
    public ResponseEntity<List<MongoWord>> findByWordTitle(@PathParam("word") String word) {
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/words/starts-with")
    public ResponseEntity<List<MongoWord>> findAllStartsWith(@PathParam("starts") String letter) {
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/words/contains-letter")
    public ResponseEntity<List<MongoWord>> findAllContainsLetter(@PathParam("contains") String letter) {
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/words/contains-letters")
    public ResponseEntity<List<MongoWord>> findAllContainsLetters(@PathParam("contains") List<String> letters) {
        return ResponseEntity.notFound().build();
    }

    /**
     * TODO: Except saved CombinationDTO
     */
    @GetMapping("/words/random-combinations")
    public ResponseEntity<List<MongoCombination>> generateRandomCombinations(@PathParam("combinations-limit") int limit) {
        return ResponseEntity.notFound().build();
    }

    /**
     * TODO: Except saved CombinationDTO
     */
    @GetMapping("/words/random-combinations-containing-word")
    public ResponseEntity<List<MongoCombination>> generateRandomCombinationsContainingFirstWord(@PathParam("combinations-limit") int limit,
                                                                                                @PathParam("first-word") String firstWord) {
        return ResponseEntity.notFound().build();
    }

    /**
     * TODO: Except saved CombinationDTO
     */
    @GetMapping("/words/random-combination")
    public ResponseEntity<List<MongoCombination>> generateRandomCombination(@PathParam("words-limit") int limit) {
        return ResponseEntity.notFound().build();
    }

    /**
     * TODO: Except saved CombinationDTO
     */
    @GetMapping("/words/random-combination")
    public ResponseEntity<List<MongoCombination>> generateRandomCombinationsContainingWord(@PathParam("words-limit") int limit,
                                                                                           @PathParam("first-word") String firstWord) {
        return ResponseEntity.notFound().build();
    }

    /**
     * TODO: Except saved CombinationDTO
     */
    @PostMapping("/combination")
    public ResponseEntity<MongoCombination> saveCombination(@RequestBody MongoCombination combination) {
        return ResponseEntity.notFound().build();
    }

    /**
     * TODO: Except saved CombinationDTO
     */
    @PostMapping("/combinations")
    public ResponseEntity<List<MongoCombination>> saveCombinations(@RequestBody List<MongoCombination> combinations) {
        return ResponseEntity.notFound().build();
    }

    @PostMapping("/sentence")
    public ResponseEntity<MongoSentence> saveSentence(@RequestBody MongoSentence sentence) {
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/sentences")
    public ResponseEntity<List<MongoSentence>> findAllSentences() {
        return ResponseEntity.notFound().build();
    }


}
