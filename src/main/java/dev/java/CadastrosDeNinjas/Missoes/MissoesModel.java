package dev.java.CadastrosDeNinjas.Missoes;

import dev.java.CadastrosDeNinjas.Ninjas.Controller.Service.NinjaModel;
import jakarta.persistence.*;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String dificuldade;

    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninja;



}
