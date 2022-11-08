package org.o7planning.tutorial.javabasic.array;

public class TwoDimensionalExample3 {
    public static void main(String[] args) {
        String[][] teamAndPlayers = new String[2][];
        teamAndPlayers[0] = new String[] {"Sam","Smith","Robert"};
        teamAndPlayers[1] = new String[] {"Tran","Nguyen"};

        for (int row = 0; row < teamAndPlayers.length; row++) {
            String[] players = teamAndPlayers[row];
            for (int col = 0; col < players.length; col++) {
                System.out.println("Player at[" + row + "][" + col + "]=" + teamAndPlayers[row][col]);
            }
        }
    }
}
