/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cesjf.lpiu.arquivos;

import br.cesjf.lpiu.modelo.Pessoa;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author claud
 */
public class CreatedFile2 {

    /**
     * @param args
     * @throws
     */
    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("informacoes_pessoa.txt");
            try (ObjectOutputStream objOut = new ObjectOutputStream(fout)) {
                Pessoa pes = new Pessoa();
                pes.setNome("Cláudio");
                pes.setCnh("123456");
                pes.setDataNasc("14/07/1995");

                objOut.writeObject(pes);
            }
        } catch (IOException e) {
        }
    }
}
