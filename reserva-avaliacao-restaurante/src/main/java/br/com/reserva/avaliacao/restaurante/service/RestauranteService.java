package br.com.reserva.avaliacao.restaurante.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.reserva.avaliacao.restaurante.domain.Restaurante;
import br.com.reserva.avaliacao.restaurante.repository.RestauranteRepository;

@Service
public class RestauranteService {

    @Autowired
    private RestauranteRepository restauranteRepository;

    public ResponseEntity<Restaurante> criarRestaurante(Restaurante restaurante) {
        restauranteRepository.save(restaurante);
        return ResponseEntity.status(201).build();
    }


}
