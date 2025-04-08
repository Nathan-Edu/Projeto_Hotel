package project.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_funcionario")
public class Funcionario extends GenericModel {

    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private String cpf;
    @Column()
    private String email;
    @Column()
    private String telefone;
    @Column()
    private String endereco;


}
