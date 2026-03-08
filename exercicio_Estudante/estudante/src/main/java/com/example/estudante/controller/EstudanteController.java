package com.example.estudante.controller;


import com.example.estudante.models.EstudanteModel;
import com.example.estudante.service.EstudanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;


@RestController // receebe requisicoes HTTP e retorna JSON
@RequestMapping(path = "/estudantes")
public class EstudanteController {

    @Autowired
    private EstudanteService estudanteService;

    @PostMapping
    public ResponseEntity<EstudanteModel> criarEstudante(@RequestBody EstudanteModel estudanteModel){

        EstudanteModel request = estudanteService.criarEstudante(estudanteModel);

        URI uri = URI.create("/estudantes/" + request.getId());
        return ResponseEntity.created(uri).body(request);
    }


    @GetMapping
    public ResponseEntity<List<EstudanteModel>> findAll(){
        List<EstudanteModel> request = estudanteService.findAll();
        return ResponseEntity.ok().body(request);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarEstudante(@PathVariable Long id){
        estudanteService.deletarEstudante(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public void buscarPorId(@PathVariable Long id){
        estudanteService.buscarPorId(id);

    }

    @PutMapping("/{id}")
    public EstudanteModel atualizar(@PathVariable Long id, @RequestBody EstudanteModel estudanteModel){
        return estudanteService.atualizar(id, estudanteModel);
    }
}
