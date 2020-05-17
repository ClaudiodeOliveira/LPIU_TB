/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cesjf.lpiu.arquivos;

import br.cesjf.lpiu.modelo.Relatorio;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author claud
 */
public class CreatedFile1 {

    /**
     * @param args
     * @throws
     */
    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("informacoes_relatorio.txt");
            try (ObjectOutputStream objOut = new ObjectOutputStream(fout)) {
                Relatorio rela = new Relatorio();
                rela.setNome("Cláudio");
                rela.setModelo("Uno");
                rela.setPlaca("ppp-2200");

                objOut.writeObject(rela);
            }
        } catch (IOException e) {
        }
    }
}
