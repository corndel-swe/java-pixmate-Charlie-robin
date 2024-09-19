package com.corndel.pixmate.drawings;



public class Necklace {
  public static void main(String[] args) {
    StringBuilder line = new StringBuilder();

    // Use a loop to add beads and spacers to the line
    for (int i = 0; i < 10; i++) {
      if (i % 2 == 0) {
        // Use Chalk to color the 'O' bead green
        line.append("O");
      } else {
        line.append("--");
      }
    }

    // Add one more green bead at the end
    line.append("O");

    // Output the necklace
    System.out.println(line.toString());
  }
}