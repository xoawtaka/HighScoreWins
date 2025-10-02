package com.pluralsight;

import java.util.Arrays;
import java.util.Scanner;

public class HighScoreParser {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the game score.%n" +
                "Utilize this format:%n" +
                "(Team1:Team2|Team1Score:Team2Score)");
        String gameScore = input.nextLine();

        //game score for each team
        String[] game = gameScore.split("\\|");

        //the teams and scores

        /*
        String teams = game[0];
        String scores = game[1];

        //team split by ':'
        String[] team = teams.split(":");

        //score split by ':'
        String[] score = scores.split(":");*/

        String[] team = game[0].split(":"); //home, away
        String[] score = game[1].split(":"); //score1, score2

        //differentiate team and score for corresponding
        String homeTeam = team[0];
        String awayTeam = team[1];

        int homeScore = Integer.parseInt(score[0]);
        int awayScore = Integer.parseInt(score[1]);

        //combine correlating teams and scores
        System.out.println("Home Team: " + homeTeam + " has " + homeScore + " points");
        System.out.println("Away Team: " + awayTeam + " has " + awayScore + " points");

        /*
        String home = "Home: " + team[0] + ", Score: " + score[0];
        String away = "Away: " + team[1] + ", Score: " + score[1];

         */

        if (homeScore > awayScore) {
            System.out.println(homeTeam + " is the WINNER!!!");
            System.out.println(awayTeam + " LOST... womp!!!");
        }
        else if (homeScore < awayScore) {
            System.out.println(awayTeam + " is the WINNER!!!");
            System.out.println(homeTeam + " LOST... womp!!!");
        }
        else {
            System.out.println("OVERTIME!!!!");
        }


    }
}
