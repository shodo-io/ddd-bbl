package io.shodo.ddd.bbl.shop.infrastructure.repository;

import io.shodo.ddd.bbl.shop.infrastructure.dto.WordDTO;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface WordRepository extends MongoRepository<WordDTO, String> {

}
