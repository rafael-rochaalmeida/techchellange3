package br.com.reserva.avaliacao.restaurante.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.reserva.avaliacao.restaurante.domain.Reserva;

@Repository
public interface ReservaRepository extends MongoRepository<Reserva, String>{

}
