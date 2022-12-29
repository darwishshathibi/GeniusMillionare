package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class LoopQuestionTest {
    static Scanner input = new Scanner(System.in);
    static boolean yess;
    public static void main(String[] args) {
        boolean check = true;
        for (int i = 1; i <= 5; i++) {
            System.out.println("123  "+check);
            check=rounq(i);
            System.out.println(check);
            if (!check)
                break;
        }
        if (!check)
            System.out.println("you failed");
    }
    static boolean rounq(int i){
        if (i == 1){
            yess =q1();
            if (yess)
                return true;
        }
        if (i == 2){
            yess =q2();
            if (yess)
                return true;
        }
        if (i == 3){
            yess =q3();
            if (yess)
                return true;
        }
        if (i == 4){
            yess =q4();
            if (yess)
                return true;
        }
        if (i == 5){
            yess =q5();
            if (yess)
                return true;
        }
        return false;
    }
    static boolean q1(){
        System.out.print("1. enter: ");// display question
        int num = input.nextInt();
        if (num == 1)  //this part will go to special method to check the answer true or not, will return boolean
            return true;
        return false;
    }
    static boolean q2(){
        System.out.print("2. enter: ");
        int num = input.nextInt();
        if (num == 1)
            return true;
        return false;
    }
    static boolean q3(){
        System.out.print("3. enter: ");
        int num = input.nextInt();
        if (num == 1)
            return true;
        return false;
    }
    static boolean q4(){
        System.out.print("4. enter: ");
        int num = input.nextInt();
        if (num == 1)
            return true;
        return false;
    }
    static boolean q5(){
        System.out.print("5. enter: ");
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
