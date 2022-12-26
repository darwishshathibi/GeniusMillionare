package org.example;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NewGeniusQuiz {
    static Scanner input = new Scanner(System.in);
    static String name;
    static ArrayList<String> mcq = new ArrayList<>();
    static boolean validate;
    static ArrayList<String> firstquestion = new ArrayList<>();
    static ArrayList<String> ansphyq1 = new ArrayList<>();
    static ArrayList<String> ansbioq1 = new ArrayList<>();
    static ArrayList<String> anschemq1 = new ArrayList<>();
    static ArrayList<String> secondquestion =  new ArrayList<>();
    static ArrayList<String> ansphyq2 = new ArrayList<>();
    static ArrayList<String> ansbioq2 = new ArrayList<>();
    static ArrayList<String> anschemq2 = new ArrayList<>();
    static ArrayList<String> thirdquestion =  new ArrayList<>();
    static ArrayList<String> ansphyq3 = new ArrayList<>();
    static ArrayList<String> ansbioq3 = new ArrayList<>();
    static ArrayList<String> anschemq3 = new ArrayList<>();
    static ArrayList<String> fourthquestion =  new ArrayList<>();
    static ArrayList<String> ansphyq4 = new ArrayList<>();
    static ArrayList<String> ansbioq4 = new ArrayList<>();
    static ArrayList<String> anschemq4 = new ArrayList<>();
    static ArrayList<String> fifthquestion =  new ArrayList<>();
    static ArrayList<String> ansphyq5 = new ArrayList<>();
    static ArrayList<String> anschemq5 = new ArrayList<>();
    static ArrayList<String> ansbioq5 = new ArrayList<>();
    public static void main(String[] args) {
        gamerules();
        studentname();
        System.out.println();
        boolean check = validate;
        for (int i = 1; i <= 5; i++) {
            check = displayquestion(i);
            System.out.println("123 "+check);
            if (!check)
                break;
        }
        if (!check)
            System.out.println(name+", You failed");
        else
            endquiz();
    }
    static void gamerules(){
        System.out.println("WELCOME TO QUIZ");
        System.out.println("This question consist of 3 subjects which was Physics, Biology and Chemistry");
        System.out.println("There will be 5 questions, if you answer all questions without any failure, you will gain title 'GENIUS'.\n");
    }
    static String studentname(){
        System.out.print("Enter your name: ");
        name = input.nextLine();
        return name;
    }
    static boolean displayquestion(int turn){
        boolean check = validate;
        switch (turn){
            case 1:
                check = q1();
                if (check){
                    //System.out.println("456 "+check);
                    return true;
                }break;
            case 2:
                check = q2();
                if (check)
                    return true; break;
            case 3:
                check = q3();
                if (check)
                    return true; break;
            case 4:
                check = q4();
                if (check)
                    return true; break;
            case 5:
                check = q5();
                if (check)
                    return true; break;
        }
        return false;
    }
    static boolean q1(){ //later change to boolean
        ArrayList<String> ques = questioncollectionq1();
        displayquestion(ques);
        System.out.println(validate);
        return validate;
    }
    static boolean q2(){
        ArrayList<String> ques = questioncollectionq2();
        displayquestion(ques);
        return validate;
    }
    static boolean q3(){
        ArrayList<String> ques = questioncollectionq3();
        displayquestion(ques);
        return validate;
    }
    static boolean q4(){
        ArrayList<String> ques = questioncollectionq4();
        displayquestion(ques);
        return validate;
    }
    static boolean q5(){
        ArrayList<String> ques = questioncollectionq5();
        displayquestion(ques);
        return validate;
    }
    static ArrayList<String> questioncollectionq1(){
        firstquestion.add("A vector quantity has");
        firstquestion.add("Which substance consists of ion?");
        firstquestion.add("Correctly describes how an endotherm would respond to an increase in temperature?");
        Collections.shuffle(firstquestion);
        return firstquestion;
    }
    static ArrayList<String> questioncollectionq2(){
        secondquestion.add("What is the meaning of 800 W?");
        secondquestion.add("Which of the following, A to D, is a similarity in the way ATP is made in respiration and photosynthesis?");
        secondquestion.add("Which of the following has the lowest rate ofreaction?");
        Collections.shuffle(secondquestion);
        return secondquestion;
    }
    static ArrayList<String> questioncollectionq3(){
        thirdquestion.add("Which statement is correct about n-type semiconductor?");
        thirdquestion.add("Which of the following, A to D, is not an example of cell signalling?");
        thirdquestion.add(" Which of the following is a reduction reaction:");
        Collections.shuffle(thirdquestion);
        return thirdquestion;
    }
    static ArrayList<String> questioncollectionq4(){
        fourthquestion.add("Which radioactive can be used to determine the age of the fossil?");
        fourthquestion.add("Which of the following statements, A to D, is evidence for geotropism?");
        fourthquestion.add("What type of glass is formed when calcium carbonate is heated with silicon dioxide?");
        Collections.shuffle(fourthquestion);
        return fourthquestion;
    }
    static ArrayList<String> questioncollectionq5(){
        fifthquestion.add("Which value is equal to 3 500 000 W?");
        fifthquestion.add("The hormone hCG can be detected in urine using pregnancy tests.");
        fifthquestion.add("What is the oxidation number of X in XO ?");
        Collections.shuffle(fifthquestion);
        return fifthquestion;
    }
    static void displayquestion(ArrayList<String> question){
        int turn;
        if(question.get(0).equals("A vector quantity has")){
            System.out.println("1. "+question.get(0));
            turn = 1;
            displayanswer(turn);
        } else if (question.get(0).equals("Which substance consists of ion?")) {
            System.out.println("1. "+question.get(0));
            turn = 2;
            displayanswer(turn);
        } else if (question.get(0).equals("Correctly describes how an endotherm would respond to an increase in temperature?")) {
            System.out.println("1. "+question.get(0));
            turn = 3;
            displayanswer(turn);
        } else if (question.get(0).equals("What is the meaning of 800 W?")) {
            System.out.println("2. "+question.get(0));
            turn = 4;
            displayanswer(turn);
        } else if (question.get(0).equals("Which of the following, A to D, is a similarity in the way ATP is made in respiration and photosynthesis?")) {
            System.out.println("2. "+question.get(0));
            turn = 5;
            displayanswer(turn);
        } else if (question.get(0).equals("Which of the following has the lowest rate of reaction?")) {
            System.out.println("2. "+question.get(0));
            turn = 6;
            displayanswer(turn);
        } else if (question.get(0).equals("Which statement is correct about n-type semiconductor?")) {
            System.out.println("3. "+question.get(0));
            turn = 7;
            displayanswer(turn);
        } else if (question.get(0).equals("Which of the following, A to D, is not an example of cell signalling?")) {
            System.out.println("3. "+question.get(0));
            turn = 8;
            displayanswer(turn);
        } else if (question.get(0).equals("Which of the following is a reduction reaction:")) {
            System.out.println("3. "+question.get(0));
            turn = 9;
            displayanswer(turn);
        } else if (question.get(0).equals("Which radioactive can be used to determine the age of the fossil?")) {
            System.out.println("4. "+question.get(0));
            turn = 10;
            displayanswer(turn);
        } else if (question.get(0).equals("Which of the following statements, A to D, is evidence for geotropism?")) {
            System.out.println("4. "+question.get(0));
            turn = 11;
            displayanswer(turn);
        } else if (question.get(0).equals("What type of glass is formed when calcium")) {
            System.out.println("4. "+question.get(0));
            turn = 12;
            displayanswer(turn);
        } else if (question.get(0).equals("Which value is equal to 3 500 000 W?")) {
            System.out.println("5. "+question.get(0));
            turn = 13;
            displayanswer(turn);
        } else if (question.get(0).equals("The hormone hCG can be detected in urine using pregnancy tests.")) {
            System.out.println("5. "+question.get(0));
            turn = 14;
            displayanswer(turn);
        } else if (question.get(0).equals("What is the oxidation number of X in XO,?")) {
            System.out.println("5. "+question.get(0));
            turn = 15;
            displayanswer(turn);
        }
    }
    static void displayanswer(int turn){
        String correct_ans, jawapan;
        ArrayList<String> ans,mcq;
        mcq = mcqchoices();
        if(turn == 1){
            ans = ansq1phy();
            correct_ans = "Magnitude and direction";
            for (int i = 0; i < 4; i++) {
                System.out.println("\t\t"+mcq.get(i)+" "+ans.get(i));
                System.out.println(ans.get(i).contains(correct_ans));
            }
            jawapan = inputanswer();
            validate = checkanswer(jawapan, correct_ans, ans, mcq);
            System.out.println(validate);
        } else if (turn == 2) {
            correct_ans = "Calcium chloride";
            ans = ansq1chem();
            for (int i = 0; i < 4; i++) {
                System.out.println("\t\t"+mcq.get(i)+" "+ans.get(i));
                System.out.println(ans.get(i).contains(correct_ans));
            }
            jawapan = inputanswer();
            validate = checkanswer(jawapan, correct_ans, ans, mcq);
            System.out.println(validate);
        }else if (turn == 3) {
            ans = ansq1bio();
            correct_ans = "Dilation of arterioles near the surface of the skin";
            for (int i = 0; i < 4; i++) {
                System.out.println("\t\t"+mcq.get(i)+" "+ans.get(i));
                System.out.println(ans.get(i).contains(correct_ans));
            }
            jawapan = inputanswer();
            validate = checkanswer(jawapan, correct_ans, ans, mcq);
            System.out.println(validate);
        } else if (turn == 4) {
            correct_ans = "The rate of change of energy 800 joules.";
            ans = ansq2phy();
            for (int i = 0; i < 4; i++) {
                System.out.println("\t\t"+mcq.get(i)+" "+ans.get(i));
            }
            jawapan = inputanswer();
            validate = checkanswer(jawapan, correct_ans, ans, mcq);
        } else if (turn == 5) {
            correct_ans = "both involve proton gradients";
            ans = ansq2bio();
            for (int i = 0; i < 4; i++) {
                System.out.println("\t\t"+mcq.get(i)+" "+ans.get(i));
            }
            jawapan = inputanswer();
            validate = checkanswer(jawapan, correct_ans, ans, mcq);
        } else if (turn == 6) {
            correct_ans = "Fermentation of glucose";
            ans = ansq2chem();
            for (int i = 0; i < 4; i++) {
                System.out.println("\t\t"+mcq.get(i)+" "+ans.get(i));
            }
            jawapan = inputanswer();
            validate = checkanswer(jawapan, correct_ans, ans, mcq);
        } else if (turn == 7) {
            correct_ans = "Doped with pentavalent atom";
            ans = ansq3phy();
            for (int i = 0; i < 4; i++) {
                System.out.println("\t\t"+mcq.get(i)+" "+ans.get(i));
                System.out.println(ans.get(i).contains(correct_ans));
            }
            jawapan = inputanswer();
            validate = checkanswer(jawapan, correct_ans, ans, mcq);
            System.out.println(validate);
        } else if (turn == 8) {
            correct_ans = "The hormone insulin being removed from the blood by the glomerulus.";
            ans = ansq3bio();
            for (int i = 0; i < 4; i++) {
                System.out.println("\t\t"+mcq.get(i)+" "+ans.get(i));
                System.out.println(ans.get(i).contains(correct_ans));
            }
            jawapan = inputanswer();
            validate = checkanswer(jawapan, correct_ans, ans, mcq);
            System.out.println(validate);
        } else if (turn == 9) {
            correct_ans = "Bromine molecule gains electron";
            ans = ansq3chem();
            for (int i = 0; i < 4; i++) {
                System.out.println("\t\t"+mcq.get(i)+" "+ans.get(i));
                System.out.println(ans.get(i).contains(correct_ans));
            }
            jawapan = inputanswer();
            validate = checkanswer(jawapan, correct_ans, ans, mcq);
            System.out.println(validate);
        } else if (turn == 10) {
            correct_ans = "Carbon - 14";
            ans = ansq4phy();
            for (int i = 0; i < 4; i++) {
                System.out.println("\t\t"+mcq.get(i)+" "+ans.get(i));
                System.out.println(ans.get(i).contains(correct_ans));
            }
            jawapan = inputanswer();
            validate = checkanswer(jawapan, correct_ans, ans, mcq);
            System.out.println(validate);
        } else if (turn == 11) {
            correct_ans = "Roots grow downwards";
            ans = ansq4bio();
            for (int i = 0; i < 4; i++) {
                System.out.println("\t\t"+mcq.get(i)+" "+ans.get(i));
                System.out.println(ans.get(i).contains(correct_ans));
            }
            jawapan = inputanswer();
            validate = checkanswer(jawapan, correct_ans, ans, mcq);
            System.out.println(validate);
        } else if (turn == 12) {
            correct_ans = "Soda lime glass";
            ans = ansq4chem();
            for (int i = 0; i < 4; i++) {
                System.out.println("\t\t"+mcq.get(i)+" "+ans.get(i));
                System.out.println(ans.get(i).contains(correct_ans));
            }
            jawapan = inputanswer();
            validate = checkanswer(jawapan, correct_ans, ans, mcq);
            System.out.println(validate);
        } else if (turn == 13) {
            correct_ans = "3.5 MW";
            ans = ansq5phy();
            for (int i = 0; i < 4; i++) {
                System.out.println("\t\t"+mcq.get(i)+" "+ans.get(i));
                System.out.println(ans.get(i).contains(correct_ans));
            }
            jawapan = inputanswer();
            validate = checkanswer(jawapan, correct_ans, ans, mcq);
            System.out.println(validate);
        } else if (turn == 14) {
            correct_ans = "hCG has a molecular mass of less than 69,000";
            ans = ansq5bio();
            for (int i = 0; i < 4; i++) {
                System.out.println("\t\t"+mcq.get(i)+" "+ans.get(i));
                System.out.println(ans.get(i).contains(correct_ans));
            }
            jawapan = inputanswer();
            validate = checkanswer(jawapan, correct_ans, ans, mcq);
            System.out.println(validate);
        } else if (turn == 15) {
            correct_ans = "+7";
            ans = ansq5chem();
            for (int i = 0; i < 4; i++) {
                System.out.println("\t\t"+mcq.get(i)+" "+ans.get(i));
                System.out.println(ans.get(i).contains(correct_ans));
            }
            jawapan = inputanswer();
            validate = checkanswer(jawapan, correct_ans, ans, mcq);
            System.out.println(validate);
        }
    }
    static String inputanswer(){
        System.out.print("Enter answer: ");
        return input.next();
    }
    static boolean checkanswer(String input_jawapan, String correct_ans, ArrayList<String> ans, ArrayList<String> mcq){
        String correct_choices = null;
        for (int i = 0; i < 4; i++) {
            if (ans.get(i).contains(correct_ans)){
                correct_choices = mcq.get(i);
                System.out.println(correct_choices);
            }
        }
        if(input_jawapan.equals(correct_choices)){
            return true;
        } else
            return false;
    }
    static ArrayList<String> ansq1phy(){
        ansphyq1.add("Magnitude and direction"); //correct
        ansphyq1.add("Magnitude or direction");
        ansphyq1.add("Magnitude only");
        ansphyq1.add("Direction only");
        Collections.shuffle(ansphyq1);
        return ansphyq1;
    }
    static ArrayList<String> ansq1bio(){
        ansbioq1.add("Dilation of arterioles near the surface of the skin");  //correct
        ansbioq1.add("Erector muscles contract, causing hairs to stand up");
        ansbioq1.add("Rapid contractions of skeletal muscles");
        ansbioq1.add("Sweat glands release less sweat");
        Collections.shuffle(ansbioq1);
        return ansbioq1;
    }
    static ArrayList<String> ansq1chem(){
        anschemq1.add("Carbon dioxide");
        anschemq1.add("Sulphur dioxide");
        anschemq1.add("Calcium chloride"); //correct
        anschemq1.add("Hydrogen chloride");
        Collections.shuffle(anschemq1);
        return anschemq1;
    }
    static ArrayList<String> ansq2phy(){
        ansphyq2.add("The rate of change of charge is 800 coulombs in 1 second");
        ansphyq2.add("The rate of change of power is 800 watts in 1 second");
        ansphyq2.add("The rate of change of current is 800 amperes.");
        ansphyq2.add("The rate of change of energy 800 joules."); //correct
        Collections.shuffle(ansphyq2);
        return ansphyq2;
    }
    static ArrayList<String> ansq2bio(){
        ansbioq2.add("both involve NAD");
        ansbioq2.add("both involve substrate level phosphorylation");
        ansbioq2.add("both involve photons");
        ansbioq2.add("both involve proton gradients"); //correct
        Collections.shuffle(ansbioq2);
        return ansbioq2;
    }
    static ArrayList<String> ansq2chem(){
        anschemq2.add("Combustion of ethanol");
        anschemq2.add("Fermentation of glucose"); //correct
        anschemq2.add("Oxidation of magnesium");
        anschemq2.add("Precipitation of silver chloride");
        Collections.shuffle(anschemq2);
        return anschemq2;
    }
    static ArrayList<String> ansq3phy(){
        ansphyq3.add("Doped with pentavalent atom"); //correct
        ansphyq3.add("Doped with trivalent atom");
        ansphyq3.add("More free electrons than holes");
        ansphyq3.add("Holes are the majority charge carrier");
        Collections.shuffle(ansphyq3);
        return ansphyq3;
    }
    static ArrayList<String> ansq3bio(){
        ansbioq3.add("The hormone insulin being removed from the blood by the glomerulus."); //correct
        ansbioq3.add("The neurotransmitter acetylcholine causing depolarisation.");
        ansbioq3.add("The hormone prolactin binding to a cell receptor in breast tissue.");
        ansbioq3.add("Epithelial cells releasing cytokines in response to histamine.");
        Collections.shuffle(ansbioq3);
        return ansbioq3;
    }
    static ArrayList<String> ansq3chem(){
        anschemq3.add("Carbon gains oxygen");
        anschemq3.add("Zinc atom loses electrons");
        anschemq3.add("Hydrogen sulfide loses hydrogen");
        anschemq3.add("Bromine molecule gains electron"); //correct
        Collections.shuffle(anschemq3);
        return anschemq3;
    }
    static ArrayList<String> ansq4phy(){
        ansphyq4.add("Iodin - 131");
        ansphyq4.add("Carbon - 14"); //correct
        ansphyq4.add("Radium - 226");
        ansphyq4.add("Uranium - 235");
        Collections.shuffle(ansphyq4);
        return ansphyq4;
    }
    static ArrayList<String> ansq4bio(){
        ansbioq4.add("Leaves are shed from deciduous plants in the autumn");
        ansbioq4.add("Roots grow downwards"); //correct
        ansbioq4.add("Shoots grow towards the light");
        ansbioq4.add("Flowers can change position throughout the day");
        Collections.shuffle(ansbioq4);
        return ansbioq4;
    }
    static ArrayList<String> ansq4chem(){
        anschemq4.add("Fused glass");
        anschemq4.add("Borosilicate glass");
        anschemq4.add("Lead crystal glass");
        anschemq4.add("Soda lime glass"); //correct
        Collections.shuffle(anschemq4);
        return anschemq4;
    }
    static ArrayList<String> ansq5phy(){
        ansphyq5.add("3.5 kW");
        ansphyq5.add("3.5 MW"); //correct
        ansphyq5.add("35kw");
        ansphyq5.add("35MW");
        Collections.shuffle(ansphyq5);
        return ansphyq5;
    }
    static ArrayList<String> ansq5bio(){
        ansbioq5.add("hCG is a polar molecule");
        ansbioq5.add("hCG has a molecular mass of less than 69,000"); //correct
        ansbioq5.add("hCG is a polypeptide");
        ansbioq5.add("hCG binds to cells using glycoproteins");
        Collections.shuffle(ansbioq5);
        return ansbioq5;
    }
    static ArrayList<String> ansq5chem(){
        anschemq5.add("+4");
        anschemq5.add("+5");
        anschemq5.add("+7"); //correct
        anschemq5.add("+8");
        Collections.shuffle(anschemq5);
        return anschemq5;
    }

    static ArrayList<String> mcqchoices(){
        mcq.add("A");
        mcq.add("B");
        mcq.add("C");
        mcq.add("D");
        return mcq;
    }
    static void endquiz(){
        System.out.println(name+" is a genuis");
    }
}
