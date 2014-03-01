/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Utilidades.Global;
import gpatest.errorDialog;
import gpatest.mainForm;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JTable;

/**
 *
 * @author Martin
 */
public class ArchivoController {

    public static final String rutaArchivo = "save/file.csv";

    public static boolean LoadFile(JTable tabla) {
        FileReader fr = null;
        try {
            File archivo = new File(rutaArchivo);
            fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            String linea = br.readLine();
            int i = 0;
            Global.clearTabla(tabla);
            while (linea != null) {
                String[] datos;
                datos = linea.split(";");
                tabla.setValueAt(datos[0], i, 0);
                tabla.setValueAt(Integer.valueOf(datos[1]), i, 1);
                tabla.setValueAt(Integer.valueOf(datos[2]), i, 2);
                tabla.setValueAt(Float.valueOf(datos[3]), i, 3);
                i++;
                linea = br.readLine();
            }
            return true;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(mainForm.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } catch (IOException ex) {
            Logger.getLogger(mainForm.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } finally {
            try {
                fr.close();
            } catch (IOException ex) {
                Logger.getLogger(mainForm.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
        }
    }

    public static boolean SaveFile(JTable tabla) {

        try {
            File archivo = new File(rutaArchivo);
            try (FileWriter fw = new FileWriter(archivo)) {
                //archivo.delete();
                for (int i = 0; i < tabla.getRowCount(); i++) {
                    String filaAEscribir = "";
                    //for (int j = 0; j < this.tablaMaterias.getColumnCount(); j++) {
                    Integer hora = (Integer) tabla.getValueAt(i, 1);
                    Integer credito = (Integer) tabla.getValueAt(i, 2);
                    Float nota = (Float) tabla.getValueAt(i, 3);
                    String fila = (String) tabla.getValueAt(i, 0);
                    if (fila != null && !fila.equals("")) {
                        if (fila.startsWith(" ")) {
                            fila = fila.substring(1);
                        }
                        filaAEscribir = filaAEscribir.concat(fila + ";");
                    } else {
                        filaAEscribir = filaAEscribir.concat("0;");
                    }
                    if (hora != null) {
                        filaAEscribir = filaAEscribir.concat(hora + ";");
                    } else {
                        filaAEscribir = filaAEscribir.concat("0;");
                    }
                    if (credito != null) {
                        filaAEscribir = filaAEscribir.concat(credito + ";");
                    } else {
                        filaAEscribir = filaAEscribir.concat("0;");
                    }
                    if (nota != null) {
                        filaAEscribir = filaAEscribir.concat(nota + ";");
                    } else {
                        filaAEscribir = filaAEscribir.concat("0;");
                    }
                    if (!filaAEscribir.equals("0;0;0;0;")) {
                        fw.write(filaAEscribir);
                        fw.write("\n");
                    }
                }
                return true;
            }
        } catch (IOException ex) {
            Logger.getLogger(mainForm.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}
