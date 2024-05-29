package br.edu.up.view;

import br.edu.up.controllers.TarefaController;
import br.edu.up.controllers.UsuarioController;
import br.edu.up.models.Tarefa;
import br.edu.up.utils.Util;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;
import java.util.UUID;



public class ToDoView {

    private static final Logger logger = LogManager.getLogger(ToDoView.class);
    public static void iniciar(Scanner sc) {
        int op;

        do {
            System.out.println("################");
            System.out.println("##   TO DO LIST   ##");
            System.out.println("################");
            System.out.println("0- sair");
            System.out.println("1- cadastrar");
            System.out.println("2- alterar");
            System.out.println("3- remover");
            System.out.println("4- listar");

            op = Util.lerOpcaoMenu(sc);
            exibirView(sc, op);
        } while (op != 0);

    }

    private static void exibirView(Scanner sc,int op){
        switch (op){
            case 0:
                System.out.println("falou");
                break;
            case 1:
                cadastrar(sc);
                break;
            case 99:
                System.out.println("ta de sacanagem né ");
                break;
            default:
                System.out.println("n sabe ler?");
                break;
        }
    }
    /*
    * Metodo responsavel pelo input do usuario
    * chamar o controller
    * @param scanner
     */
    private static void cadastrar(Scanner sc){

        try {
            System.out.println("Informe o Titulo: ");
            var titulo = sc.nextLine();

            System.out.println("Informe o Descrição: ");
            var descricao = sc.nextLine();

            System.out.println("Informe o Prioridade: ");
            var prioridade = sc.nextLine();


            UsuarioView.exibirDadosDoUsuario();
            System.out.println("Informe o Usuario por UUID: ");
            var uuid = sc.nextLine();

            //BUSCANDO DADOS DO USU
            var usuario = UsuarioController.buscarUsuarioForUUID(UUID.fromString(uuid));

            //CRIANDO OBJ TAREFA
            Tarefa t = new Tarefa(titulo, descricao, prioridade, usuario);

            TarefaController.cadastrar(t);
        }catch (Exception e){
            logger.error("erro ao criar tarefa");
        }
    }

    private static void atualizar(){

    }

    private static void remover(){

    }

    private static void listar(){

    }

}
