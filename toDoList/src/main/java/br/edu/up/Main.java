package br.edu.up;

import br.edu.up.utils.Util;
import br.edu.up.view.ToDoView;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        int op;
        Scanner sc = new Scanner(System.in);
        logger.info("hello world");

        do {
            System.out.println("################");
            System.out.println("##   MENU   ##");
            System.out.println("################");
            System.out.println("0- sair");
            System.out.println("1- to te list");

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
                    ToDoView.iniciar(sc);
                    break;
                case 99:
                    System.out.println("ta de sacanagem né ");
                    break;
                default:
                    System.out.println("n sabe ler?");
                    break;
            }
        }


    }
