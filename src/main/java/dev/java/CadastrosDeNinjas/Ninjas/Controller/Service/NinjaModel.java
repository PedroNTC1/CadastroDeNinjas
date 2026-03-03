package dev.java.CadastrosDeNinjas.Ninjas.Controller.Service;

import dev.java.CadastrosDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

//Transforma uma classe em uma entidade do banco de dados
@Entity
@Table(name = "tb_Cadastro_de_ninjas")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    @Column(unique = true)
    private String email;
    private int idade;


    //Um ninja tem uma unica missao
    @ManyToOne
    @JoinColumn(name = "missoes_id")
    private MissoesModel missoes;


    @Override
    public String toString() {
        return "NinjaModel{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", idade=" + idade +
                '}';
    }

}
