package com.corndel.pixmate.drawings;

import com.github.tomaslanger.chalk.Chalk;

public class HollowRectangle {
    public static void main(String[] args) {
        draw(5, 10);
    }

    public static void draw(int width, int height) {

        StringBuilder rectangle = new StringBuilder();
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                if (i == 0 || i == width - 1 || j == 0 || j == height - 1) {
                    rectangle.append(Chalk.on("*").cyan());
                } else {
                    rectangle.append(" ");
                }
            }
            rectangle.append("\n");
        }

        System.out.println(rectangle);
    }
}

