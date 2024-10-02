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
public class CadastroRestaurante {

    @Autowired
    private RestauranteService restauranteService;

    @PostMapping
    public ResponseEntity<Restaurante> CadastroRestaurante(@RequestBody Restaurante restaurante){
        return ResponseEntity.ok(this.restauranteService.cadastrarRestaurante(restaurante));
    }


}
