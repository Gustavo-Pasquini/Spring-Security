package unicesumar.springsecurity.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import unicesumar.springsecurity.models.PessoaModel;

public interface PessoaRepository extends JpaRepository<PessoaModel, Long> {
}
