package br.edu.up.daos;

import br.edu.up.models.Escrita;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public abstract class BaseDao {

    public static void salvar(List<Escrita> dados) throws IOException {

        File arquivo = new File("");

      //  try(FileWriter writer = new FileWriter(arquivo))

           // writer.write(dados.get(0).dadosFormatados());
        
    //} cat


}

}
