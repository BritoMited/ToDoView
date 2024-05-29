package br.edu.up.controllers;

import br.edu.up.models.Usuario;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class UsuarioController {

    private static List<Usuario> usuarios = List.of(
            new Usuario(UUID.fromString("1cde881a-1e0e-4699-a1f0-ffdf9ec1933e"), "João"),
            new Usuario(UUID.fromString("4638ee99-9946-45e4-9d57-8014da7be3cf"), "Maria")
    );

    public static List<Usuario> listar(){
        return usuarios;
    }

    public static Usuario buscarUsuarioForUUID(UUID uuid){
       Optional<Usuario> usuario = usuarios.stream()
                                  .filter(u -> u.getUuid().equals(uuid))
                                  .findFirst();

        return usuario.isPresent() ? usuario.get() : null;
    }

    public static Usuario buscarUsuarioForNome(String nome){
        Optional<Usuario> usuario  = usuarios.stream()
                                      .filter(u -> u.getUuid().equals(nome))
                                       .findFirst();

        return usuario.isPresent() ? usuario.get() : null;
    }

}
