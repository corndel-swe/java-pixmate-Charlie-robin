package com.corndel.pixmate.drawings;

public class Diagonal {
    public static void main(String[] args) {
    line(5);
    invert(5);
    }

    public static void line(int rows){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i <= rows; i++) {
            for (int j = 0; j <= i; j++) {
               if(j == i -1){
                   stringBuilder.append("*");
               } else {
                   stringBuilder.append(" ");
               }
            }
            stringBuilder.append("\n");
        }
        System.out.println(stringBuilder);
    }

    public static void invert(int rows){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = rows; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                if(j == 1){
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
