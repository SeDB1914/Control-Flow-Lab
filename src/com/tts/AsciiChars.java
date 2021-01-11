package com.tts;

public class AsciiChars {
    public static void printNumbers() {
        int num;

        for (num = 48; num<=57; num++) {
            System.out.print((char)num );
        }
    }

    public static void printLowerCase() {
        int lCase;

        for (lCase = 65; lCase<=90; lCase++) {
            System.out.print( (char)lCase );
        }
    }

    public static void printUpperCase() {
        int uCase;

        for (uCase = 97; uCase<=122; uCase++) {
            System.out.print( (char)uCase );
        }
    }
}