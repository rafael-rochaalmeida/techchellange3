package br.com.reserva.avaliacao.restaurante.domain;

import org.springframework.data.mongodb.core.index.Indexed;

import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Usuario {


    @Id
    @Indexed(unique=true)
    private String idUsuario;

    private String nomeUsuario;
    private String emailUsuario;
    private String telefoneUsuario;


}
