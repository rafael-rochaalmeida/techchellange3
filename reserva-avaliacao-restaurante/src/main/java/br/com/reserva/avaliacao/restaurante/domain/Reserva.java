package br.com.reserva.avaliacao.restaurante.domain;
import java.time.LocalDateTime;
import org.springframework.data.mongodb.core.index.Indexed;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Reserva {


    @Id
    @Indexed(unique=true)
    private String idReserva;


    private String idUsuario;
    private String idRestaurante;
    private LocalDateTime dataHoraReserva;
    private Integer qtdPessoasNaReserva;




}
