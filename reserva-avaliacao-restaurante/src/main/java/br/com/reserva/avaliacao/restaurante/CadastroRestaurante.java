package br.com.reserva.avaliacao.restaurante;

//lógica do negocio
public class CadastroRestaurante {
    private final RestauranteRepositorio restauranteRepositorio;

    public CadastroRestaurante(RestauranteRepositorio restauranteRepositorio){

        this.restauranteRepositorio = restauranteRepositorio;
    }

    public Restaurante executar(Restaurante restaurante){

        return restauranteRepositorio.save(restaurante);
    }
}
