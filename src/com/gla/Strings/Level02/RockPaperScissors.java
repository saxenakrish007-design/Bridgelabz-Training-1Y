package com.gla.Strings.Level02;
import java.util.Scanner;
    public class RockPaperScissors {
        static String getComputerChoice() {
            int choice = (int)(Math.random() * 3);
            if (choice == 0)
                return "rock";
            else if (choice == 1)
                return "paper";
            else
                return "scissors";
        }
        static String findWinner(String user, String computer) {
            if (user.equals(computer))
                return "Draw";
            if (user.equals("rock") && computer.equals("scissors") ||
                    user.equals("paper") && computer.equals("rock") ||
                    user.equals("scissors") && computer.equals("paper")) {
                return "User";
            } else {
                return "Computer";
            }
        }
        static String[][] calculateStats(int userWins, int compWins, int games) {
            String[][] stats = new String[2][3];
            double userPercent = (userWins * 100.0) / games;
            double compPercent = (compWins * 100.0) / games;
            stats[0][0] = "User";
            stats[0][1] = String.valueOf(userWins);
            stats[0][2] = String.valueOf(userPercent);
            stats[1][0] = "Computer";
            stats[1][1] = String.valueOf(compWins);
            stats[1][2] = String.valueOf(compPercent);
            return stats;
        }
        static void displayResults(String[][] games, String[][] stats) {
            System.out.println("\nGame Results");
            System.out.println("Game\tUser\tComputer\tWinner");
            System.out.println("-----------------------------------");
            for (int i = 0; i < games.length; i++) {
                System.out.println((i + 1) + "\t" +
                        games[i][0] + "\t" +
                        games[i][1] + "\t\t" +
                        games[i][2]);
            }
            System.out.println("\nStatistics");
            System.out.println("Player\tWins\tWin %");
            System.out.println("----------------------");
            for (int i = 0; i < stats.length; i++) {
                System.out.println(stats[i][0] + "\t" +
                        stats[i][1] + "\t" +
                        stats[i][2]);
            }
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number of games: ");
            int n = sc.nextInt();
            String[][] gameResults = new String[n][3];
            int userWins = 0, compWins = 0;
            for (int i = 0; i < n; i++) {
                System.out.print("Enter choice (rock/paper/scissors): ");
                String userChoice = sc.next().toLowerCase();
                String computerChoice = getComputerChoice();
                String winner = findWinner(userChoice, computerChoice);
                if (winner.equals("User")) userWins++;
                if (winner.equals("Computer")) compWins++;
                gameResults[i][0] = userChoice;
                gameResults[i][1] = computerChoice;
                gameResults[i][2] = winner;
            }
            String[][] stats = calculateStats(userWins, compWins, n);
            displayResults(gameResults, stats);
        }
    }
