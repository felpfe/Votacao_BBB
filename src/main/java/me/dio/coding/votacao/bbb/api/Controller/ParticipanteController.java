package me.dio.coding.votacao.bbb.api.Controller;

import lombok.AllArgsConstructor;
import me.dio.coding.votacao.bbb.api.Model.ParametroModel;
import me.dio.coding.votacao.bbb.api.Model.ParticipanteModel;
import me.dio.coding.votacao.bbb.api.Repository.ParametroRepository;
import me.dio.coding.votacao.bbb.api.Repository.ParticipanteRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/participantes")
@AllArgsConstructor
public class ParticipanteController {

    private final ParticipanteRepository repository;

    @PostMapping("/salvar")
    public ResponseEntity<ParticipanteModel> salvar(@RequestBody ParticipanteModel participante){
        ParticipanteModel entidade = repository.save(participante);
        return ResponseEntity.ok(entidade);
    }

    @GetMapping("/consulta")
    public ResponseEntity<ParticipanteModel> consulta(@RequestParam String id){
        Optional<ParticipanteModel> opt = repository.findById(id);
        if(opt.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(opt.get());
    }
}
