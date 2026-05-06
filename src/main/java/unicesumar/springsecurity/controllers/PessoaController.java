package unicesumar.springsecurity.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import unicesumar.springsecurity.models.PessoaModel;
import unicesumar.springsecurity.services.PessoaService;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(path = "/pessoas")
public class PessoaController {

    @Autowired
    PessoaService pessoaService;

    @GetMapping
    public ResponseEntity<List<PessoaModel>> listarPessoas() {
        List<PessoaModel> request = pessoaService.findAll();
        return ResponseEntity.ok(request);
    }

    @PostMapping
    public ResponseEntity<PessoaModel> criarPessoa(@RequestBody PessoaModel pessoaModel) {
        PessoaModel request = pessoaService.criarPessoa(pessoaModel);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(request.getId()).toUri();
        return ResponseEntity.created(uri).body(request);
    }
}
