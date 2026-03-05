package com.example.estudante.service;


import com.example.estudante.models.EstudanteModel;
import com.example.estudante.repository.EstudanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstudanteService {

    @Autowired
    private EstudanteRepository estudanteRepository;


    public EstudanteModel criarEstudante(EstudanteModel estudanteModel){
        return estudanteRepository.save(estudanteModel);
    }

    public List<EstudanteModel> findAll(){
        return estudanteRepository.findAll();
    }

    public void deletarEstudante(Long id){
        estudanteRepository.deleteById(id);
    }

    public EstudanteModel buscarPorId(Long id){

        return estudanteRepository.findById(id).get();
    }

    public EstudanteModel atualizar(Long id, EstudanteModel estudanteModel){
        EstudanteModel model = estudanteRepository.findById(id).get();
        model.setNome(estudanteModel.getNome());
        model.setIdade(estudanteModel.getIdade());
        model.setEmail(estudanteModel.getEmail());
        return estudanteRepository.save(model);
    }
}
