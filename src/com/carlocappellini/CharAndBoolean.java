package com.carlocappellini;

public class CharAndBoolean {
    public static void main(String[] args) {
        // width of 16 (2 bytes)
        ///https://unicode-table.com/en/#control-character
        char myChar = '\u03A9';

        char aries = '\u2648';



        System.out.println(myChar + " & " + aries );

        String myString = "this is a String ";
        System.out.println(myString);
        myString = myString + " this more";
        System.out.println(myString);
        System.out.println(myString + '\u03A9');

    }
}


