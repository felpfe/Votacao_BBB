package me.dio.coding.votacao.bbb.api.Repository;

import me.dio.coding.votacao.bbb.api.Model.ParticipanteModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ParticipanteRepository extends MongoRepository<ParticipanteModel, String> {

}
