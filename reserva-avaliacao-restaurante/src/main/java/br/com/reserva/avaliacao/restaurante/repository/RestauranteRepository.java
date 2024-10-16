package br.com.reserva.avaliacao.restaurante.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.reserva.avaliacao.restaurante.domain.Restaurante;

@Repository
public interface RestauranteRepository extends MongoRepository<Restaurante, String>{

}
