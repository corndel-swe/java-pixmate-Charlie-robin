package com.corndel.pixmate.drawings;

public class Rectangle {

    public static void main(String[] args) {
        // *****
        // *****

        // STRINGS ARE IMMUTABLE
        // LITERAL STRING
        String charlie = "Charlie";
        charlie += " Richardson";
        System.out.println(charlie);

        String newName = "Charlie";

        // CLASS TO MAKE STRINGS MUTABLE
        // *****
        // *****
//        StringBuilder rectangle = new StringBuilder();
        StringBuilder rectangle = new StringBuilder();
        int width = 10;
        int height = 5;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                rectangle.append("*");
            }
            rectangle.append("\n");
        }

        System.out.println(rectangle);
        
    }


}
