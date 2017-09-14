/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_miguelangelflores;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Miguel Flores
 */
public class AdministracionArchivos {

    private ArrayList<Hadas> ListaHadas = new ArrayList();
    private File archivo = null;

    public AdministracionArchivos() {
    }

    public ArrayList<Hadas> getListaHadas() {
        return ListaHadas;
    }

    public void setListaHadas(ArrayList<Hadas> ListaUsuarios) {
        this.ListaHadas = ListaUsuarios;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    //Extra mutador
    public void addHada(Hadas u) {
        this.ListaHadas.add(u);

    }

    public void CargarArchivo() {
        try {
            ListaHadas = new ArrayList();
            Hadas temp;

            if (archivo.exists()) {
                FileInputStream entrada = null;
                ObjectInputStream objeto = null;

                try {
                    entrada
                            = new FileInputStream(archivo);
                    objeto
                            = new ObjectInputStream(entrada);

                    while ((temp = (Hadas) objeto.readObject()) != null) {
                        ListaHadas.add(temp);

                    }
                } catch (EOFException e) {
                    //Encontro el final del archivo
                }

                objeto.close();
                entrada.close();

            }
        } catch (Exception e) {

        }

    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Hadas h : ListaHadas) {
                bw.writeObject(h);

            }
            bw.flush();
        } catch (IOException e) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (IOException e) {
            }
        }

    }

}
