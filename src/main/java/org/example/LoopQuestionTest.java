package org.example;
import java.util.Scanner;

public class LoopQuestionTest {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        boolean check = true;
        for (int i = 1; i <= 5; i++) {
            check=rounq(i);
            if (!check)
                break;
        }
        if (!check)
            System.out.println("you failed");
    }
    static boolean rounq(int i){
        boolean yes;
        if (i == 1){
            yes=q1();
            if (yes)
                return true;
        }
        if (i == 2){
            yes=q2();
            if (yes)
                return true;
        }
        if (i == 3){
            yes=q3();
            if (yes)
                return true;
        }
        if (i == 4){
            yes=q4();
            if (yes)
                return true;
        }
        if (i == 5){
            yes=q5();
            if (yes)
                return true;
        }
        return false;
    }
    static boolean q1(){
        System.out.println("1. enter: ");
        int num = input.nextInt();
        if (num == 1)  //this part will go to special method to check the answer true or not, will return boolean
            return true;
        return false;
    }
    static boolean q2(){
        System.out.println("2. enter: ");
        int num = input.nextInt();
        if (num == 1)
            return true;
        return false;
    }
    static boolean q3(){
        System.out.println("3.enter: ");
        int num = input.nextInt();
        if (num == 1)
            return true;
        return false;
    }
    static boolean q4(){
        System.out.println("4. enter: ");
        int num = input.nextInt();
        if (num == 1)
            return true;
        return false;
    }
    static boolean q5(){
        System.out.println("5. enter: ");
        int num = input.nextInt();
        if (num == 1){
            end();
            return true;
        }
        return false;
    }
    static void end(){
        System.out.println("genius");

    }
}
