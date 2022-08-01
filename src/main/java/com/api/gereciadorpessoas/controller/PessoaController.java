package com.api.gereciadorpessoas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.api.gereciadorpessoas.model.Pessoa;
import com.api.gereciadorpessoas.repository.PessoaRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping
public class PessoaController {
    
    @Autowired
    private PessoaRepository pessoaRepository;

    @GetMapping(value = ("/pessoas"))
    public List<Pessoa> lista(){
        return pessoaRepository.findAll();

    }

    @GetMapping(value = ("/pessoa/{id}"))
    public Optional<Pessoa> listarPorId(@PathVariable(value = "id") long id){
        return pessoaRepository.findById(id);
    }

    @PostMapping(value = ("/pessoa/cadastrar"))
    @ResponseStatus(HttpStatus.CREATED)
    public Pessoa cadastrar(@RequestBody Pessoa pessoa){
        return pessoaRepository.save(pessoa);
    }
    @PutMapping(value = ("/pessoa/{id}"))
    public Pessoa atualizaCadastro(@RequestBody Pessoa pessoa){
        return pessoaRepository.save(pessoa);
    }


    @DeleteMapping(value = ("/pessoa/{id}"))
    public void deletaPessoa(@RequestBody Pessoa pessoa){
        pessoaRepository.delete(pessoa);
    }




}
