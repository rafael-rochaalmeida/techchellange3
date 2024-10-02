package br.com.reserva.avaliacao.restaurante.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.reserva.avaliacao.restaurante.domain.Restaurante;
import br.com.reserva.avaliacao.restaurante.repository.RestauranteRepository;

@Service
public class RestauranteService {

    @Autowired
    private RestauranteRepository restauranteRepositori;

    public Restaurante cadastrarRestaurante(Restaurante restaurante) {
        restauranteRepositori.save(restaurante);
        return restaurante;
    }


}
