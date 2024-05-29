package br.edu.up.view;

import br.edu.up.controllers.UsuarioController;

public class UsuarioView {

    public static void exibirDadosDoUsuario(){
        var usuarios = UsuarioController.listar();
        System.out.println("========Lista DE Usuarios========");
        usuarios.forEach(usuario -> {
            System.out.println("UUID: " + usuario.getUuid());
            System.out.println("Nome: " + usuario.getNome());
            System.out.println("----------------------------");
        });

        System.out.println("===========================");
    }
}
