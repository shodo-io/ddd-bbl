package io.shodo.ddd.bbl.words.application.resource;

import io.shodo.ddd.bbl.words.application.dto.CombinationDTO;
import io.shodo.ddd.bbl.words.application.dto.SentenceDTO;
import io.shodo.ddd.bbl.words.application.dto.WordDTO;
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
    public ResponseEntity<List<WordDTO>> findAll() {
        return ResponseEntity.ok(wordRepository.findAll());
    }

    @GetMapping("/words")
    public ResponseEntity<List<WordDTO>> findByWordTitle(@PathParam("word") String word) {
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/words/starts-with")
    public ResponseEntity<List<WordDTO>> findAllStartsWith(@PathParam("starts") String letter) {
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/words/contains-letter")
    public ResponseEntity<List<WordDTO>> findAllContainsLetter(@PathParam("contains") String letter) {
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/words/contains-letters")
    public ResponseEntity<List<WordDTO>> findAllContainsLetters(@PathParam("contains") List<String> letters) {
        return ResponseEntity.notFound().build();
    }

    /**
     * TODO: Except saved CombinationDTO
     */
    @GetMapping("/words/random-combinations")
    public ResponseEntity<List<CombinationDTO>> generateRandomCombinations(@PathParam("combinations-limit") int limit) {
        return ResponseEntity.notFound().build();
    }

    /**
     * TODO: Except saved CombinationDTO
     */
    @GetMapping("/words/random-combinations-containing-word")
    public ResponseEntity<List<CombinationDTO>> generateRandomCombinationsContainingFirstWord(@PathParam("combinations-limit") int limit,
                                                                           @PathParam("first-word") String firstWord) {
        return ResponseEntity.notFound().build();
    }

    /**
     * TODO: Except saved CombinationDTO
     */
    @GetMapping("/words/random-combination")
    public ResponseEntity<List<CombinationDTO>> generateRandomCombination(@PathParam("words-limit") int limit) {
        return ResponseEntity.notFound().build();
    }

    /**
     * TODO: Except saved CombinationDTO
     */
    @GetMapping("/words/random-combination")
    public ResponseEntity<List<CombinationDTO>> generateRandomCombinationsContainingWord(@PathParam("words-limit") int limit,
                                                                                         @PathParam("first-word") String firstWord) {
        return ResponseEntity.notFound().build();
    }

    /**
     * TODO: Except saved CombinationDTO
     */
    @PostMapping("/combination")
    public ResponseEntity<CombinationDTO> saveCombination(@RequestBody CombinationDTO combination) {
        return ResponseEntity.notFound().build();
    }

    /**
     * TODO: Except saved CombinationDTO
     */
    @PostMapping("/combinations")
    public ResponseEntity<List<CombinationDTO>> saveCombinations(@RequestBody List<CombinationDTO> combinations) {
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/sentences")
    public ResponseEntity<List<SentenceDTO>> findAllSentences() {
        return ResponseEntity.notFound().build();
    }
}
