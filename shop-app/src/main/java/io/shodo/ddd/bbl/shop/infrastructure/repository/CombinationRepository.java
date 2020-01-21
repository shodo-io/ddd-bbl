package io.shodo.ddd.bbl.shop.infrastructure.repository;

import io.shodo.ddd.bbl.shop.infrastructure.dto.CombinationDTO;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CombinationRepository extends MongoRepository<CombinationDTO, String> {

}
