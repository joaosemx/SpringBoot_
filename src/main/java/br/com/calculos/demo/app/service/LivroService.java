package br.com.calculos.demo.app.service;

import org.springframework.stereotype.Service;

import br.com.calculos.demo.app.entity.Livro;


@Service
public class LivroService {

    public String save(Livro livro) {

        return "Livro salvo com sucesso!";
    }

}
