package joseprimo.CadastroDeNinjas.Ninjas;

import Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name  ="tb_cadastro")

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NinjaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String rank;
    private int idade;
//    @ManyToOne = varios ninjas poderao ter uma missao
    @ManyToOne
    @JoinColumn(name = "missoes_id") //foreign key
    private MissoesModel missoes;
}

