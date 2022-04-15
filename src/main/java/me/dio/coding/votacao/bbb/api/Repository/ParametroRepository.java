package me.dio.coding.votacao.bbb.api.Repository;

import me.dio.coding.votacao.bbb.api.Model.ParametroModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ParametroRepository extends MongoRepository<ParametroModel, String> {

}
