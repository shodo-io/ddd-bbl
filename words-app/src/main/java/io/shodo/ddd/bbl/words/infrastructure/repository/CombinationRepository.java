package io.shodo.ddd.bbl.words.infrastructure.repository;

import io.shodo.ddd.bbl.words.infrastructure.dto.CombinationDTO;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CombinationRepository extends MongoRepository<CombinationDTO, String> {

}
