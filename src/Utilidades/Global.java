/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;

/**
 *
 * @author Martin
 */
public class Global {

    public static Map<String, Float> mapa = getValoresUSA();
    public static String pais;
    public static String[] notasUsa = {"A+", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "F"};
    public static final String rutaEq = "equivalencias";

    public static Map<String, Float> getValoresUSA() {
        try {
            Map<String, Float> mapa = new HashMap<>(); //almaceno los valores de USA
            Properties prop = new Properties();
            InputStream input = null;
            try {
                input = new FileInputStream(rutaEq + "/" + "USA.properties");
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Global.class.getName()).log(Level.SEVERE, null, ex);
            }
           prop.load(input);
            mapa.put("A+", Float.valueOf(prop.getProperty("A+")));
            mapa.put("A", Float.valueOf(prop.getProperty("A")));
            mapa.put("A-", Float.valueOf(prop.getProperty("A-")));
            mapa.put("B+", Float.valueOf(prop.getProperty("B+")));
            mapa.put("B", Float.valueOf(prop.getProperty("B")));
            mapa.put("B-", Float.valueOf(prop.getProperty("B-")));
            mapa.put("C+", Float.valueOf(prop.getProperty("C+")));
            mapa.put("C", Float.valueOf(prop.getProperty("C")));
            mapa.put("C-", Float.valueOf(prop.getProperty("C-")));
            mapa.put("D+", Float.valueOf(prop.getProperty("D+")));
            mapa.put("D", Float.valueOf(prop.getProperty("D")));
            mapa.put("F", Float.valueOf(prop.getProperty("F")));
            return mapa;
        } catch (IOException ex) {
            Logger.getLogger(Global.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static void setValorPais(String pais1) {
        pais = pais1;
    }

    public static String getRango(String pais) {
        Properties prop = new Properties();
        InputStream input = null;
        String filename = rutaEq + "/" + pais + ".properties";
        try {
            input = new FileInputStream(filename);
            prop.load(input);
            return prop.getProperty("rango");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Global.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Global.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static Float getValor(Float nota) {

        Properties prop = new Properties();
        InputStream input = null;
        String filename = rutaEq + "/" + pais + ".properties";
        try {
            input = new FileInputStream(filename);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Global.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            prop.load(input);

            for (int i = 0; i < notasUsa.length; i++) {
                String notaA = prop.getProperty(notasUsa[i]);
                String[] notaA1 = notaA.split("-"); // en notaA1[0] y notaA1[1] tengo el rango de valores 9-10
                Float valorMin = Float.valueOf(notaA1[0]);
                Float valorMax = Float.valueOf(notaA1[1]);
                if (valorMin <= nota && nota <= valorMax) {
                    return mapa.get(notasUsa[i]);
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(Global.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException ex) {
                    Logger.getLogger(Global.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return 0.0f;
    }

    public static String[] getListaPaises() {
        File lista = new File(rutaEq);
        String[] p = lista.list();
        for (int i = 0; i < p.length; i++) {
            p[i] = p[i].replace(".properties", "");
        }
        return p;
    }

    public static void clearTabla(JTable tablaMaterias) {
        for (int j = 0; j < tablaMaterias.getRowCount(); j++) {
            for (int k = 0; k < tablaMaterias.getColumnCount(); k++) {
                tablaMaterias.setValueAt(null, j, k);
            }
        }
    }
}
