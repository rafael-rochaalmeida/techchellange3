package br.com.reserva.avaliacao.restaurante.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.reserva.avaliacao.restaurante.domain.Usuario;
import br.com.reserva.avaliacao.restaurante.service.UsuarioService;


@RestController
@RequestMapping("/usuario")
public class UsuarioController {


    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<Usuario> criarUsuario(@RequestBody Usuario usuario){
        return ResponseEntity.ok(this.usuarioService.criarUsuario(usuario)).getBody();
    }

}
