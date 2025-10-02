package com.pluralsight;

import java.util.Arrays;
import java.util.Scanner;

public class HighScoreParser {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the game score.");
        String gameScore = input.nextLine();

        //game score for each team
        String[] game = gameScore.split("|");

        String teams = game[0];
        String scores = game[1];


        //split by ':'

        String[] team = teams.split(":");
        String[] score = scores.split(":");

        String winning = String.valueOf(team[0].equals(score[0]));
        String winner = String.valueOf(team[1].equals(score[1]));

        System.out.println(winning + winner);




        //differential team and score for corresponding









    }
}
