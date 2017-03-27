package com.restauracja;

import java.io.*;
import java.util.Scanner;

/**
 * Created by dw on 25.03.17.
 */

public class CzytnikPlikow {

    public String czytajPlik(String fileName) {
        String everything = "";
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            everything = sb.toString();
        } catch (IOException e) {
            System.err.println("Blad odczytu pliku!");
            System.err.format("IOException: %s%n", e);
        }
        return everything;
    }

    public void zapiszPlik(String filename, String line) {
        try (FileWriter fileWriter = new FileWriter(filename, true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
             PrintWriter out = new PrintWriter(bufferedWriter)) {
            out.println(line);

        } catch (IOException e) {
            System.err.println("Blad zapisu pliku!");
            System.err.format("IOException: %s%n", e);
        }
    }
}



