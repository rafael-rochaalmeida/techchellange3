package br.com.reserva.avaliacao.restaurante.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import br.com.reserva.avaliacao.restaurante.domain.Restaurante;

public interface RestauranteRepository extends MongoRepository<Restaurante, String>{

}
