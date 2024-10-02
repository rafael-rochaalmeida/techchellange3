package br.com.reserva.avaliacao.restaurante;

import java.util.List;

public class RestauranteController {

    private CadastroRestaurante cadastroRestaurante;

    public Restaurante cadastrar(Restaurante restaurante){
        return cadastroRestaurante.executar(restaurante);
    }

    public List<Restaurante> listar(){

    }
}
