package br.com.reserva.avaliacao.restaurante.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import br.com.reserva.avaliacao.restaurante.domain.Usuario;
import br.com.reserva.avaliacao.restaurante.repository.UsuarioRepository;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public ResponseEntity<Usuario> criarUsuario(Usuario usuario) {
        usuarioRepository.save(usuario);
        return ResponseEntity.status(201).build();
    }
}
