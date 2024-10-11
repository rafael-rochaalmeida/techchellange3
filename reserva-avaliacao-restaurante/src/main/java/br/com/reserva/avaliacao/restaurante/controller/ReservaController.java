package br.com.reserva.avaliacao.restaurante.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.reserva.avaliacao.restaurante.domain.Reserva;
import br.com.reserva.avaliacao.restaurante.service.ReservaService;

@RestController
@RequestMapping("/reserva")
public class ReservaController {

    @Autowired
    ReservaService reservaService;

    @PostMapping
    public ResponseEntity<Reserva> criarReserva(@RequestBody Reserva reserva){
        return this.reservaService.criarReserva(reserva);
    }
}
