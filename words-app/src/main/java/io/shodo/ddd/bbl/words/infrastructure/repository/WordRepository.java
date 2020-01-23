package io.shodo.ddd.bbl.words.infrastructure.repository;

import io.shodo.ddd.bbl.words.application.dto.WordDTO;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface WordRepository extends MongoRepository<WordDTO, String> {

}
