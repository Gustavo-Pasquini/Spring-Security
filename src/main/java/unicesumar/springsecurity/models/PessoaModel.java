package unicesumar.springsecurity.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name="TBL_PESSOAS")
@Data
public class PessoaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<JobModel> job;
}
