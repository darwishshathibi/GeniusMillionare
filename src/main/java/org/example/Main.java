package org.example;
import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        GameBegins();
    }

    static void GameRules(){
        int k = 0;
        String[] rank = {"CHILD","TEEN","COLLEGE STUDENT","GRAD STUDENT","EXPERT"};
        System.out.println("ARE YOU A GENIUS?\n");
        System.out.println("This game consists of 5 questions.");
        System.out.println("Which every questions have different level, which are:\n");
        for (int i = 0; i < rank.length; i++) {
            k++;
            System.out.println("\t"+k+". "+rank[i]);
        }
        System.out.println("\nThere are 3 subjects which are Physics, Chemistry, Biology and will shuffle among them.");
        System.out.println("If your answer is correct, the difficulty will increased.");
        System.out.println("You have to answer 5 question in a row to earn the title 'GENIUS'.");
        System.out.println("Otherwise, you need to retake the quiz.\n");
        System.out.println("Goodluck!\n");
    }

    static void GameBegins(){
        GameRules();
        String inputname = StudentName();
        System.out.println(inputname);

    }

    static String StudentName(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your nickname: ");
        String name = input.nextLine();
        return name;
    }
}