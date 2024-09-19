package com.corndel.pixmate.drawings;

public class Checkerboard {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();

        int rows = 5;
        int columns = 5;

        for (int i = 0; i < rows ; i++) {
            for (int j = 0; j < columns * 2; j++) {
                if ((i + j) % 2 == 0 && !(j == columns * 2 -1)) {
                    stringBuilder.append("*");
                } else {
                    stringBuilder.append(" ");
                }
            }
            stringBuilder.append("\n");
        }

        System.out.println(stringBuilder);
    }
}
