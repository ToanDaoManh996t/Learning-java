package org.o7planning.tutorial.javabasic.array;

public class TwoDimensionalExample2 {
    public static void main(String[] args) {
        String[][] teamAndPlayers = new String[][] {{"Sam","Smith","Robert"},{"Tran","Nguyen"}};
        String[] usPlayers = teamAndPlayers[0];
        String[] vnPlayers = teamAndPlayers[1];

        System.out.println("Team count: " + teamAndPlayers.length);

        System.out.println("Us Players count: " + usPlayers.length);
        System.out.println("Vn Players count: " + vnPlayers.length);

        for (int row = 0; row < teamAndPlayers.length; row++) {
            String[] players = teamAndPlayers[row];
            for (int col = 0; col < players.length; col++) {
                System.out.println("Player at[" + row + "][" + col + "]=" + teamAndPlayers[row][col]);
            }
        }
    }
}
