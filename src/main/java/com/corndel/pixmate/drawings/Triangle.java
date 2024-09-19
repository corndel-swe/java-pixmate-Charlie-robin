package com.corndel.pixmate.drawings;

public class Triangle {


    public static void main(String[] args) {
        int height = 5;
        for (int i = height; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }


//        StringBuilder sandwich = new StringBuilder();
//        int height = 9;
//        int width = 1;
//
//        for (int i = 0; i < height; i++) {
//
//            for (int j = 0; j < width; j++) {
//                sandwich.append('*');
//            }
//
//            width += i < height / 2 ? 1 : -1;
//            System.out.println("Width is now :" + width);
//            sandwich.append('\n');
//        }
//        System.out.println(sandwich);

    }



//    public static void main(String[] args) {
//        System.out.println("-".repeat(10));
//        System.out.println("Triangle");
//        draw(5);
//        System.out.println("-".repeat(10));
//        System.out.println("Invert");
//        invert(5);
//        System.out.println("-".repeat(10));
//        System.out.println("Sandwich");
//        sandwich(5);
//    }

    public static void draw(int rows) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                stringBuilder.append("*");
            }
            if (i != rows - 1) {
                stringBuilder.append("\n");
            }
        }
        System.out.println(stringBuilder);
    }

    public static void invert(int rows) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = rows; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                stringBuilder.append("*");
            }
            stringBuilder.append("\n");
        }
        System.out.println(stringBuilder);
    }

    public static void sandwich(int rows) {
        draw(rows);
        invert(rows - 1);
    }
}
