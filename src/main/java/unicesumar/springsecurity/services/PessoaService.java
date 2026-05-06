package unicesumar.springsecurity.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import unicesumar.springsecurity.models.PessoaModel;
import unicesumar.springsecurity.repositories.PessoaRepository;

import java.util.List;

@Service
public class PessoaService {

    @Autowired
    PessoaRepository pessoaRepository;

    public List<PessoaModel> findAll() {
        return pessoaRepository.findAll();
    }

    public PessoaModel criarPessoa(PessoaModel pessoaModel) {
        return pessoaRepository.save(pessoaModel);
    }
}
