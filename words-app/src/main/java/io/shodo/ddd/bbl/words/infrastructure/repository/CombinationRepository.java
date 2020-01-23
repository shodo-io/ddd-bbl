package io.shodo.ddd.bbl.words.infrastructure.repository;

import io.shodo.ddd.bbl.words.application.dto.MongoCombination;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CombinationRepository extends MongoRepository<MongoCombination, String> {

}
