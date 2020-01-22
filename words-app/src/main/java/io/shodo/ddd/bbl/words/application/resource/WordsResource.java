package io.shodo.ddd.bbl.words.application.resource;

import io.shodo.ddd.bbl.words.domain.services.WordService;
import io.shodo.ddd.bbl.words.infrastructure.dto.CombinationDTO;
import io.shodo.ddd.bbl.words.infrastructure.dto.WordDTO;
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
    private WordService wordService;

    public WordsResource(WordRepository wordRepository, WordService wordService) {
        this.wordRepository = wordRepository;
        this.wordService = wordService;
    }

    @GetMapping("/words")
    public ResponseEntity<List<WordDTO>> findAll() {
        wordService.test();
        return ResponseEntity.ok(wordRepository.findAll());
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
    @GetMapping("/words/random-combination")
    public ResponseEntity<List<CombinationDTO>> generateRandomCombination(@PathParam("words-limit") int limit) {
        return ResponseEntity.notFound().build();
    }

    /**
     * TODO: Except saved CombinationDTO
     */
    @PostMapping("/combination")
    public ResponseEntity<CombinationDTO> saveCombination(@RequestBody CombinationDTO combination) {
        return ResponseEntity.badRequest().build();
    }

    /**
     * TODO: Except saved CombinationDTO
     */
    @PostMapping("/combinations")
    public ResponseEntity<List<CombinationDTO>> saveCombinations(@RequestBody List<CombinationDTO> combinations) {
        return ResponseEntity.badRequest().build();
    }
}
