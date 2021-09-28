package com.company;
import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Formatter;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> nombres = new ArrayList<String>();
        double[] nota = new double[6];
        File archivos = null;
        FileReader reader = null;
        BufferedReader buffer = null;
        File archivo = null;
        FileWriter writer = null;
        PrintWriter pw = null;
        try {
            double media = 0.0;
            float medialist[] = new float[0];
            // Archivo de entrada
            archivos = new File("D:/Practica1-1/src/com/company/Listado.csv");
            reader = new FileReader(archivos);
            buffer = new BufferedReader(reader);
            // Archivo de Salida
            archivo = new File("D:/Practica1-1/src/com/company/Notas.txt");
            writer = new FileWriter(archivo);
            pw = new PrintWriter(writer);
            //Leer nombres
            String linea;
            while ((linea = buffer.readLine() ) != null) {
                nombres.add(linea);
            }
            String nombre_alumno = "";
            String aArchivo = "";
            for (int h = 0; h < 10;h++){
                double alumnoSorteado = Math.random() * (nombres.size() + 0) + 1;
                nombre_alumno = nombres.get((int) alumnoSorteado);

            double mediaFinal = 0;

            for(int y = 1; y < 5; y++){
                 double numRam = (Math.random() * (10 - 1 ) + 1);
                 double redondeo = Math.round((numRam * 100.0)/100.0);
                 nota[y] = redondeo ;
                 mediaFinal =+ redondeo;
            }

                mediaFinal = (nota[1] + nota[2] + nota[3] + nota[4])/4;
                nota[5] = mediaFinal;


                String aluMedia = "El alumno " + nombre_alumno + " ha sacado las siguientes notas: Nota 1: " +
                        nota[1] + "| Nota 2: " + nota[2] + " |Nota 3: " + nota[3] + " | Nota 4: " + nota[4] +
                        "   | Nota media: " + mediaFinal + "\n";
                aArchivo += aluMedia;
            }

             System.out.println(aArchivo);
             pw.println(aArchivo);

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
                if (buffer != null) {
                    buffer.close();
                }
                if (writer != null) {
                    writer.close();
                }
                if (pw != null) {
                    pw.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

    }
}
