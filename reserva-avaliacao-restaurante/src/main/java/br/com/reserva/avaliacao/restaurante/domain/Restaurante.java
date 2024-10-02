package br.com.reserva.avaliacao.restaurante.domain;
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Restaurante {
    private Integer id;
    private String nome;
    private String localizacao;
    private String tipoCozinha;
    private String horariosFuncionamento;
    private int capacidade;
}
