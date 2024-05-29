package br.edu.up.utils;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Util {

    private static final Logger logger = LogManager.getLogger(Util.class);

    public static int lerOpcaoMenu(Scanner sc){
        logger.info("iniciando o processo de leitura");
        try {
            int opcao = sc.nextInt();
            return opcao;
        }catch (InputMismatchException ex){
            logger.error("usuario é burro", ex);
            sc.next();
            return 99;
        } finally {
            sc.nextLine();
        }
    }

}
