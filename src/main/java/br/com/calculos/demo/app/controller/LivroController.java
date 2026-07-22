package br.com.calculos.demo.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.calculos.demo.app.entity.Livro;
import br.com.calculos.demo.app.service.LivroService;




@RestController
@RequestMapping("/livro")
public class LivroController {

    @Autowired
    private LivroService livroService;


    @PostMapping("/save")
    public ResponseEntity<String> save(@RequestBody Livro livro) {

        try {
            
            String mensagem = this.livroService.save(livro);
            return new ResponseEntity<>(mensagem, HttpStatus.OK);

        } catch (Exception e) {
            return new ResponseEntity<>("Deu red ", HttpStatus.BAD_REQUEST);

        }
    }
}
