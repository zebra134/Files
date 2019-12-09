package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {

    private static Scanner scan;
    private static PrintWriter pw;
    public static void main(String[] args) {
        int i=0;
        File file = new File("C:/Users/Student/Desktop/test/test465.txt");
        try {
            boolean flag = file.createNewFile();
            pw = new PrintWriter(new FileWriter(file));
            pw.write("Gfrt ghe gefgnfg rj55 5jr y6r yj");
        } catch (IOException e) {
            System.out.println("Что-то случилось:"+e.toString());
        } finally {
            pw.close();
        }

        try {
            scan = new Scanner(file);
            while (scan.hasNext()) {
                System.out.println(scan.next());
                i++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            scan.close();
        }
        System.out.println(i);

    }
}