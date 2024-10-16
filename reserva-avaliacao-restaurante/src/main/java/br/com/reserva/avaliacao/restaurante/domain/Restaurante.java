package br.com.reserva.avaliacao.restaurante.domain;
import org.springframework.data.mongodb.core.index.Indexed;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Restaurante {

    @Id
    @Indexed(unique=true)
    private String idRestaurante;
    
    private String nomeRestaurante;
    private String localizacaoRestaurante;
    private String tipoCozinhaRestaurante;
    private String horariosFuncionamentoRestaurante;
    private int capacidadeRestaurante;
}
