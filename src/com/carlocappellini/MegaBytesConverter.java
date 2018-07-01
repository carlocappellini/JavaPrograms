package com.carlocappellini;

public class MegaBytesConverter {
    public static void main(String[] args) {

        printMegaBytesAndKiloBytes(4506);

    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        if (kiloBytes <= 0) {

            System.out.println("Invalid Values");
        } else {


            int megaByte = 1024;

            int megaBytes = kiloBytes / megaByte;

            int remainder = megaBytes % kiloBytes;


            System.out.println(kiloBytes + " KB " + " = " + megaBytes + " MB " + " and " + remainder + " KB ");
        }
    }

}
