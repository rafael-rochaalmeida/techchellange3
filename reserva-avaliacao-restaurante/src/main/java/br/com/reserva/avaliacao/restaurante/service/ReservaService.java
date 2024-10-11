package br.com.reserva.avaliacao.restaurante.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.reserva.avaliacao.restaurante.domain.Reserva;
import br.com.reserva.avaliacao.restaurante.repository.ReservaRepository;

@Service
public class ReservaService {

    @Autowired
    private ReservaRepository reservaRepository;

    public ResponseEntity<Reserva> criarReserva(Reserva reserva){
        reservaRepository.save(reserva);
        return ResponseEntity.status(201).build();
    }




}
