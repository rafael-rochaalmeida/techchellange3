package br.com.reserva.avaliacao.restaurante.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.reserva.avaliacao.restaurante.domain.Restaurante;
import br.com.reserva.avaliacao.restaurante.service.RestauranteService;



@RestController
@RequestMapping("/restaurante")
public class RestauranteController {

    @Autowired
    private RestauranteService restauranteService;

    @PostMapping
    public ResponseEntity<Restaurante> criarRestaurante(@RequestBody Restaurante restaurante){
        return this.restauranteService.criarRestaurante(restaurante);
    }


}
