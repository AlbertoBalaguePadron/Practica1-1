package com.company;
import java.io.File;
import java.io.BufferedReader;
import java.io.Reader;
import java.io.FileReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList nombres = new ArrayList();
        ArrayList nombres_notas = new ArrayList();
        File archivo = null;
        FileReader reader = null;
        BufferedReader buffer = null;

        try {
            archivo = new File("D:/Practica1-1/src/com/company/Listado.csv");

            reader = new FileReader(archivo);
            buffer = new BufferedReader(reader);

            String linea;
            while ((linea = buffer.readLine() ) != null) {
               nombres.add(linea);
            }



            for (int i = 0; i < 4; i++) {
                int index = (int)(Math.random() * nombres.size());

                nombres_notas.add(nombres.get(index));
                    for(int e = 1; e<=4; e++)
                        nombres_notas.add((float)(Math.random()*10 + 1));


            }

                System.out.println(nombres_notas);

/*
            for(int i = 1; i<=4; i++)
                System.out.println((float)(Math.random()*10 + 1));

*/



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
