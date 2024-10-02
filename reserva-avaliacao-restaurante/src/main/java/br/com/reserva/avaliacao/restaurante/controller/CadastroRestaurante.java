package br.com.reserva.avaliacao.restaurante.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import br.com.reserva.avaliacao.restaurante.domain.Restaurante;
import br.com.reserva.avaliacao.restaurante.service.RestauranteService;

public class CadastroRestaurante {

    @Autowired
    private RestauranteService restauranteService;

    public ResponseEntity<Restaurante> CadastroRestaurante(@RequestBody Restaurante restaurante){
        return ResponseEntity.ok(this.restauranteService.cadastrarRestaurante(restaurante));
    }



    //    private CadastroRestaurante cadastroRestaurante;

    // public Restaurante cadastrar(Restaurante restaurante){
    //     return cadastroRestaurante.executar(restaurante);
    // }

    // public List<Restaurante> listar(){

    // }

}
