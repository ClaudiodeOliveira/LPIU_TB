/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cesjf.lpiu.arquivos;

import br.cesjf.lpiu.modelo.Relatorio;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author morae
 */
public class ArquivoInRelatorio {
    private FileInputStream fin = null;
    private ObjectInputStream objIn = null;

    public void abrir() throws FileNotFoundException, IOException {
        fin = new FileInputStream("informacoes_relatorio.txt");
        objIn = new ObjectInputStream(fin);
    }

    public void fechar() {
        try {
            objIn.close();
            fin.close();
        } catch (IOException ex) {
            Logger.getLogger(ArquivoInRelatorio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Relatorio getrelatorio() throws IOException, ClassNotFoundException {
        Relatorio rela = null;

        try {
            rela = (Relatorio) objIn.readObject();
        } catch (EOFException ex) {
            rela = null;
        }
        return rela;
    }

    public List getTodasRelatorio() {
        List<Relatorio> lista = new ArrayList<Relatorio>();

        try {
            this.abrir();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ArquivoInRelatorio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ArquivoInRelatorio.class.getName()).log(Level.SEVERE, null, ex);
        }

        boolean continua = true;
        Relatorio rela = null;
        while (continua) {
            try {
                rela = (Relatorio) objIn.readObject();
                lista.add(rela);
            } catch (EOFException ex) {
                continua = false;
            } catch (IOException ex) {
                continua = false;
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ArquivoInRelatorio.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        fechar();
        return lista;
    }
}
