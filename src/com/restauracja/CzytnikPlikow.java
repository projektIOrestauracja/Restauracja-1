package com.restauracja;

import java.io.*;
import java.util.Scanner;

/**
 * Created by dw on 25.03.17.
 */

public class CzytnikPlikow {

    public String czytajPlik() {
        String everything = "";
        try (BufferedReader br = new BufferedReader(new FileReader("menu.txt"))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            everything = sb.toString();
        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }
        return everything;
    }

    public void zapiszPlik() {

    }
}



