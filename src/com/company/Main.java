package com.company;
import java.io.File;
import java.io.BufferedReader;
import java.io.Reader;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) {

        File archivo = null;
        FileReader reader = null;
        BufferedReader buffer = null;

        try {
            archivo = new File("D:/Practica1-1/src/com/company/Listado.csv");

            reader = new FileReader(archivo);
            buffer = new BufferedReader(reader);

            String linea;
            while ((linea = buffer.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
                if (buffer != null) {
                    buffer.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

    }
}
