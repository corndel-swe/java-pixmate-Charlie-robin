package com.corndel.pixmate.drawings;

import com.github.tomaslanger.chalk.Chalk;

import java.util.Random;

public class DiscoNecklace {

    public static void main(String[] args) {

        StringBuilder line = new StringBuilder();

        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                line.append(getRandomColourBead("O"));
            } else {
                line.append("--");
            }
        }

        line.append(Chalk.on("O").green());

        System.out.println(line.toString());

    }

    public static String getRandomColourBead(String bead){
        Random random = new Random();
        int randomNumber = random.nextInt(0, 6);
        return switch (randomNumber) {
            case 0 -> Chalk.on(bead).green().toString();
            case 1 -> Chalk.on(bead).yellow().toString();
            case 2 -> Chalk.on(bead).red().toString();
            case 3 -> Chalk.on(bead).magenta().toString();
            case 4 -> Chalk.on(bead).cyan().toString();
            default -> Chalk.on(bead).black().toString();
        };
    }
}
