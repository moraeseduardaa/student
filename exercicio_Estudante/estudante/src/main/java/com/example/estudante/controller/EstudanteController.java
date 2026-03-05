package com.example.estudante.controller;


import com.example.estudante.models.EstudanteModel;
import com.example.estudante.service.EstudanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController // receebe requisicoes HTTP e retorna JSON
@RequestMapping(path = "/estudantes")
public class EstudanteController {

    @Autowired
    private EstudanteService estudanteService;

    @PostMapping
    public EstudanteModel criarEstudante(@RequestBody EstudanteModel estudanteModel){
        return estudanteService.criarEstudante(estudanteModel);
    }


    @GetMapping
    public List<EstudanteModel> buscarTodosEstudantes(){
        return estudanteService.findAll();
    }


    @DeleteMapping("/{id}")
    public void deletarEstudante(@PathVariable Long id){
        estudanteService.deletarEstudante(id);
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
