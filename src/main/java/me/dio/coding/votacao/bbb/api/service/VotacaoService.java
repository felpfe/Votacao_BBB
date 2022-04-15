package me.dio.coding.votacao.bbb.api.service;

import lombok.AllArgsConstructor;
import me.dio.coding.votacao.bbb.api.Model.ParticipanteModel;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class VotacaoService {

    public static final String TOPICO_VOTACAO = "votacao";

    private final KafkaTemplate<Object, Object> template;

    public void adicionarEvento(ParticipanteModel participante){
        template.send(TOPICO_VOTACAO, participante);
    }
}
