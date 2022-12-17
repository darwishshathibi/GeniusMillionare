package org.example;
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
public class Main {
    static ArrayList<String> firstquestion= new ArrayList<String>();
    static ArrayList<String> ans_phy_lvl1_q1 = new ArrayList<String>();
    static ArrayList<String> ans_bio_lvl1_q2 = new ArrayList<String>();
    static ArrayList<String> ans_chem_lvl1_q3 = new ArrayList<String>();
    static ArrayList<String> secondquestion = new ArrayList<>();
    static ArrayList<String> ans_phy_lvl2_q1 = new ArrayList<>();
    static ArrayList<String> ans_bio_lvl2_q2 = new ArrayList<>();
    static ArrayList<String> ans_chem_lvl2_q3 = new ArrayList<>();
    static ArrayList<String> thirdquestion = new ArrayList<>();
    static ArrayList<String> ans_phy_lvl3_q1 =  new ArrayList<>();
    static ArrayList<String> ans_bio_lvl3_q2 =  new ArrayList<>();
    static ArrayList<String> ans_chem_lvl3_q3 =  new ArrayList<>();
    static ArrayList<String> fourthquestion = new ArrayList<>();
    static ArrayList<String> ans_phy_lvl4_q1 =  new ArrayList<>();
    static ArrayList<String> ans_bio_lvl4_q2 =  new ArrayList<>();
    static ArrayList<String> ans_chem_lvl4_q3 =  new ArrayList<>();
    static ArrayList<String> fifthquestion = new ArrayList<>();
    static ArrayList<String> ans_phy_lvl5_q1 =  new ArrayList<>();
    static ArrayList<String> ans_bio_lvl5_q2 =  new ArrayList<>();
    static ArrayList<String> ans_chem_lvl5_q3 =  new ArrayList<>();
    static ArrayList<String> mcqchoices = new ArrayList<String>();
    static boolean check =  true;
    static String name;
    public static void main(String[] args){
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
        Questions();
    }

    static String StudentName(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your nickname: ");
        name = input.nextLine();
        return name;
    }

    static void Questions(){ //try boolean on Questions();
        System.out.println("The question is now begin.");
        for (int i = 1; i <= 5; i++) {
            if(check){
                //System.out.println(check);
                if (i == 1){
                    QuesOne();
                } else if (i == 2) {
                    QueTwo();
                } else if (i == 3) {
                    QueThree();
                } else if (i == 4) {
                    QueFour();
                } else if (i == 5) {
                    QueFive();

                }
            }
            if (!check){
                System.out.println("\nYOU FUCKING FAILED, YOU DAMN SHIT MADAFAKA!!! "+name);
                break;
            }
        }
        StopGame();
    }

    static void QuesOne(){
        firstquestion.add("A vector quantity has:");
        firstquestion.add("Which substance consists of ion?");
        firstquestion.add("Correctly describes how an endotherm would respond to an increase in temperature?");
        Collections.shuffle(firstquestion);
        DisplayQues(firstquestion);
    }
    static void QueTwo(){
        secondquestion.add("Which of the following has the lowest rate of reaction?");
        secondquestion.add("What is the meaning of 800 W?");
        secondquestion.add("Which of the following, A to D, is a similarity in the way ATP is made in respiration and photosynthesis?");
        Collections.shuffle(secondquestion);
        DisplayQues(secondquestion);
    }
    static void QueThree(){
        thirdquestion.add("Which statement is correct about n-type semiconductor?");
        thirdquestion.add("Which of the following, A to D, is not an example of cell signalling?");
        thirdquestion.add("Which of the following is a reduction reaction?");
        Collections.shuffle(thirdquestion);
        DisplayQues(thirdquestion);
    }
    static void QueFour(){
        fourthquestion.add("Which radioactive can be used to determine the age of the fossil?\n");
        fourthquestion.add("Which of the following statements, A to D, is evidence for geotropism?");
        fourthquestion.add("Silicon dioxide is a major component of glass.");
        Collections.shuffle(fourthquestion);
        DisplayQues(fourthquestion);
    }
    static void QueFive(){
        fifthquestion.add("Which value is equal to 3 500 000 W?");
        fifthquestion.add("The hormone hCG can be detected in urine using pregnancy tests.");
        fifthquestion.add("What is the oxidation number of X in XO,\"?");
        Collections.shuffle(fifthquestion);
        DisplayQues(fifthquestion);
    }
    static void DisplayQues(ArrayList<String> question){
        int turn;
        ArrayList<String> mcq = McqChoices();
        if (question.get(0).equals("A vector quantity has:")){
            System.out.println("\n"+question.get(0)); // display phy question 1
            turn = 1;
            ArrayList<String> ans =anslvl1q1();
            DisplayAnswer(turn,ans,mcq);

        } else if (question.get(0).equals("Which substance consists of ion?")) {
            System.out.println("\n"+question.get(0)); // display bio question 1
            turn = 2;
            ArrayList<String> ans =anslvl1q2();
            DisplayAnswer(turn, ans,mcq);

        } else if (question.get(0).equals("Correctly describes how an endotherm would respond to an increase in temperature?")){
            System.out.println("\n"+question.get(0) ); //display chem question 1
            turn = 3;
            ArrayList<String> ans =anslvl1q3();
            DisplayAnswer(turn,ans,mcq);

        } else if (question.get(0).equals("What is the meaning of 800 W?")) {
            System.out.println("\n"+question.get(0) ); //display phy question 2
            turn = 4;
            ArrayList<String> ans =anslvl2q1();
            DisplayAnswer(turn,ans,mcq);

        } else if (question.get(0).equals("Which of the following, A to D, is a similarity in the way ATP is made in respiration and photosynthesis?")) {
            System.out.println("\n"+question.get(0) ); //display bio question 2
            turn = 5;
            ArrayList<String> ans =anslvl2q2();
            DisplayAnswer(turn,ans,mcq);

        } else if (question.get(0).equals("Which of the following has the lowest rate of reaction?")) {
            System.out.println("\n"+question.get(0) ); //display chem question 2
            turn = 6;
            ArrayList<String> ans =anslvl2q3();
            DisplayAnswer(turn,ans,mcq);
            
        } else if (question.get(0).equals("Doped with pentavalent atom")) {
            System.out.println("\n"+question.get(0) ); //display phy question 3
            turn = 7;
            ArrayList<String> ans =anslvl3q1();
            DisplayAnswer(turn,ans,mcq);

        } else if (question.get(0).equals("The hormone insulin being removed from the blood by the glomerulus.")) {
            System.out.println("\n"+question.get(0) ); //display bio question 3
            turn = 8;
            ArrayList<String> ans =anslvl3q2();
            DisplayAnswer(turn,ans,mcq);

        } else if (question.get(0).equals("Bromine molecule gains electron")) {
            System.out.println("\n"+question.get(0) ); //display chem question 3
            turn = 9;
            ArrayList<String> ans =anslvl3q3();
            DisplayAnswer(turn,ans,mcq);

        } else if (question.get(0).equals("Carbon - 14")) {
            System.out.println("\n"+question.get(0) ); //display phy question 4
            turn = 10;
            ArrayList<String> ans =anslvl4q1();
            DisplayAnswer(turn,ans,mcq);
            
        } else if (question.get(0).equals("roots grow downward")) {
            System.out.println("\n"+question.get(0) ); //display bio question 4
            turn = 11;
            ArrayList<String> ans =anslvl4q2();
            DisplayAnswer(turn,ans,mcq);
            
        } else if (question.get(0).equals("Soda lime glass")) {
            System.out.println("\n"+question.get(0) ); //display chem question 4
            turn = 12;
            ArrayList<String> ans =anslvl4q3();
            DisplayAnswer(turn,ans,mcq);
            
        } else if (question.get(0).equals("3.5 MW")) {
            System.out.println("\n"+question.get(0) ); //display phy question 5
            turn = 12;
            ArrayList<String> ans =anslvl5q1();
            DisplayAnswer(turn,ans,mcq);

        } else if (question.get(0).equals("hCG has a molecular mass of less than 69,000")) {
            System.out.println("\n"+question.get(0) ); //display bio question 5
            turn = 12;
            ArrayList<String> ans =anslvl5q2();
            DisplayAnswer(turn,ans,mcq);

        } else if (question.get(0).equals("+7")) {
            System.out.println("\n"+question.get(0) ); //display chem question 5
            turn = 12;
            ArrayList<String> ans =anslvl5q3();
            DisplayAnswer(turn,ans,mcq);
        }
    }

    static void DisplayAnswer(int line, ArrayList<String> ans, ArrayList<String> mcq){
        if (line == 1){
            for (int i = 0; i < 4; i++) { // display ans phy question 1
                System.out.println("\t\t"+mcq.get(i)+" "+ans.get(i));
            }
            String jawapan = InputAnswer();
            String correct_ans = "Magnitude and direction";
            check=CheckAnswer(jawapan, ans, mcq,correct_ans);
            //System.out.println(check);


        } else if (line == 2) {
            for (int j = 0; j < 4; j++) { // display ans bio question 1
                System.out.println("\t\t"+mcq.get(j)+" "+ans.get(j));
            }
            String correct_ans = "Calcium chloride";
            String jawapan = InputAnswer();
            check=CheckAnswer(jawapan,ans, mcq, correct_ans);
            //System.out.println(check);

        }  else if (line == 3){
            for (int c = 0; c < 4; c++) { // display ans chem question 1
                System.out.println("\t\t"+mcq.get(c)+" "+ans.get(c));
            }
            String correct_ans = "dilation of arterioles near the surface of the skin";
            String jawapan = InputAnswer();
            check=CheckAnswer(jawapan,ans, mcq, correct_ans);
            //System.out.println(check);

        } else if (line == 4) {
            for (int i = 0; i < 4; i++) { // dsiplay ans phy question 2
                System.out.println("\t\t"+mcq.get(i)+" "+ans.get(i));
            }
            String correct_ans = "The rate of change of energy is 800 joules";
            String jawapan = InputAnswer();
            check=CheckAnswer(jawapan,ans, mcq, correct_ans);


        } else if (line == 5 ) {
            for (int i = 0; i < 4; i++) { // dsiplay ans bio question 2
                System.out.println("\t\t"+mcq.get(i)+" "+ans.get(i));
            }
            String correct_ans = "both involve proton gradients";
            String jawapan = InputAnswer();
            check=CheckAnswer(jawapan,ans, mcq, correct_ans);


        } else if (line == 6) {
            for (int i = 0; i < 4; i++) { // dsiplay ans chem question 2
                System.out.println("\t\t"+mcq.get(i)+" "+ans.get(i));
            }
            String correct_ans = "Fermentation of glucose";
            String jawapan = InputAnswer();
            check=CheckAnswer(jawapan,ans, mcq, correct_ans);

        } else if (line == 7) {
            for (int i = 0; i < 4; i++) { // dsiplay ans phy question 3
                System.out.println("\t\t"+mcq.get(i)+" "+ans.get(i));
            }
            String correct_ans = "Doped with pentavalent atom";
            String jawapan = InputAnswer();
            check=CheckAnswer(jawapan,ans, mcq, correct_ans);

        } else if (line == 8) {
            for (int i = 0; i < 4; i++) { // dsiplay ans bio question 3
                System.out.println("\t\t"+mcq.get(i)+" "+ans.get(i));
            }
            String correct_ans = "The hormone insulin being removed from the blood by the glomerulus.";
            String jawapan = InputAnswer();
            check=CheckAnswer(jawapan,ans, mcq, correct_ans);

        } else if (line == 9) {
            for (int i = 0; i < 4; i++) { // dsiplay ans chem question 3
                System.out.println("\t\t"+mcq.get(i)+" "+ans.get(i));
            }
            String correct_ans = "Bromine molecule gains electron";
            String jawapan = InputAnswer();
            check=CheckAnswer(jawapan,ans, mcq, correct_ans);

        } else if (line == 10) {
            for (int i = 0; i < 4; i++) { // dsiplay ans phy question 4
                System.out.println("\t\t"+mcq.get(i)+" "+ans.get(i));
            }
            String correct_ans = "Carbon - 14";
            String jawapan = InputAnswer();
            check=CheckAnswer(jawapan,ans, mcq, correct_ans);

        } else if (line == 11) {
            for (int i = 0; i < 4; i++) { // dsiplay ans bio question 4
                System.out.println("\t\t"+mcq.get(i)+" "+ans.get(i));
            }
            String correct_ans = "roots grow downwards";
            String jawapan = InputAnswer();
            check=CheckAnswer(jawapan,ans, mcq, correct_ans);

        } else if (line == 12) {
            for (int i = 0; i < 4; i++) { // dsiplay ans chem question 4
                System.out.println("\t\t"+mcq.get(i)+" "+ans.get(i));
            }
            String correct_ans = "Soda lime glass";
            String jawapan = InputAnswer();
            check=CheckAnswer(jawapan,ans, mcq, correct_ans);

        } else if (line == 13) {
            for (int i = 0; i < 4; i++) { // dsiplay ans phy question 5
                System.out.println("\t\t"+mcq.get(i)+" "+ans.get(i));
            }
            String correct_ans = "3.5 MW";
            String jawapan = InputAnswer();
            check=CheckAnswer(jawapan,ans, mcq, correct_ans);

        } else if (line == 14) {
            for (int i = 0; i < 4; i++) { // dsiplay ans bio question 5
                System.out.println("\t\t"+mcq.get(i)+" "+ans.get(i));
            }
            String correct_ans = "hCG has a molecular mass of less than 69,000";
            String jawapan = InputAnswer();
            check=CheckAnswer(jawapan,ans, mcq, correct_ans);

        } else if (line == 15) {
            for (int i = 0; i < 4; i++) { // dsiplay ans chem question 5
                System.out.println("\t\t"+mcq.get(i)+" "+ans.get(i));
            }
            String correct_ans = "+7";
            String jawapan = InputAnswer();
            check=CheckAnswer(jawapan,ans, mcq, correct_ans);

        }
    }
    static ArrayList<String> anslvl1q1(){ //ans phy question 1
        ans_phy_lvl1_q1.add("Magnitude and direction"); // correct ans
        ans_phy_lvl1_q1.add("Magnitude or direction");
        ans_phy_lvl1_q1.add("Magnitude only");
        ans_phy_lvl1_q1.add("Direction only");
        Collections.shuffle(ans_phy_lvl1_q1); //shuffle the question
        return ans_phy_lvl1_q1;
    }

    static ArrayList<String> anslvl1q2(){ // ans bio question 1
        ans_bio_lvl1_q2.add("Carbon dioxide");
        ans_bio_lvl1_q2.add("Sulphur dioxide");
        ans_bio_lvl1_q2.add("Calcium chloride"); // correct ans
        ans_bio_lvl1_q2.add("Hydrogen chloride");
        Collections.shuffle(ans_bio_lvl1_q2); //shuffle the question
        return ans_bio_lvl1_q2;
    }

    static ArrayList<String> anslvl1q3(){ // ans chem question 1
        ans_chem_lvl1_q3.add("dilation of arterioles near the surface of the skin"); // correct ans
        ans_chem_lvl1_q3.add("erector muscles contract, causing hairs to stand up");
        ans_chem_lvl1_q3.add("rapid contractions of skeletal muscles");
        ans_chem_lvl1_q3.add("sweat glands release less sweat");
        Collections.shuffle(ans_chem_lvl1_q3); //shuffle the question
        return ans_chem_lvl1_q3;
    }
    static ArrayList<String> anslvl2q1(){ //ans phy question 2
        ans_phy_lvl2_q1.add("The rate of change of charge is 800 coulombs in 1 second");
        ans_phy_lvl2_q1.add("The rate of change of power is 800 watts in 1 second");
        ans_phy_lvl2_q1.add("The rate of change of current is 800 amperes.");
        ans_phy_lvl2_q1.add("The rate of change of energy is 800 joules"); //correct ans
        Collections.shuffle(ans_phy_lvl2_q1); //shuffle the question
        return ans_phy_lvl2_q1;
    }

    static ArrayList<String> anslvl2q2(){ //ans bio question 2
        ans_bio_lvl2_q2.add("both involve NAD");
        ans_bio_lvl2_q2.add("both involve substrate level phosphorylation");
        ans_bio_lvl2_q2.add("both involve photons");
        ans_bio_lvl2_q2.add("both involve proton gradients"); //correct ans
        Collections.shuffle(ans_bio_lvl2_q2);
        return ans_bio_lvl2_q2;
    }
    static ArrayList<String> anslvl2q3(){ //ans chem question 2
        ans_chem_lvl2_q3.add("Combustion of ethanol");
        ans_chem_lvl2_q3.add("Fermentation of glucose");//correct ans
        ans_chem_lvl2_q3.add("Oxidation of magnesium");
        ans_chem_lvl2_q3.add("Precipitation of silver chloride");
        Collections.shuffle(ans_chem_lvl2_q3);
        return ans_chem_lvl2_q3;
    }
    static ArrayList<String> anslvl3q1(){ 
        ans_phy_lvl3_q1.add("Doped with pentavalent atom"); //correct ans
        ans_phy_lvl3_q1.add("Doped with trivalent atom");
        ans_phy_lvl3_q1.add("More free electrons than holes");
        ans_phy_lvl3_q1.add("Holes are the majority charge carrier");
        Collections.shuffle(ans_phy_lvl3_q1);
        return ans_phy_lvl3_q1;
    }
    static ArrayList<String> anslvl3q2(){
        ans_bio_lvl3_q2.add("The hormone insulin being removed from the blood by the glomerulus."); // correct ans
        ans_bio_lvl3_q2.add("The neurotransmitter acetylcholine causing depolarisation.");
        ans_bio_lvl3_q2.add("The hormone prolactin binding to a cell receptor in breast tissue.");
        ans_bio_lvl3_q2.add("Epithelial cells releasing cytokines in response to histamine.");
        Collections.shuffle(ans_bio_lvl3_q2);
        return ans_bio_lvl3_q2;
    }
    static ArrayList<String> anslvl3q3(){
        ans_chem_lvl3_q3.add("Carbon gains oxygen");
        ans_chem_lvl3_q3.add("Zinc atom loses electrons");
        ans_chem_lvl3_q3.add("Hydrogen sulfide loses hydrogen");
        ans_chem_lvl3_q3.add("Bromine molecule gains electron");//correct ans
        Collections.shuffle(ans_chem_lvl3_q3);
        return ans_chem_lvl3_q3;
    }
    static ArrayList<String> anslvl4q1(){
        ans_phy_lvl4_q1.add("Iodin - 131");
        ans_phy_lvl4_q1.add("Carbon - 14"); //correct ans
        ans_phy_lvl4_q1.add("Radium - 226");
        ans_phy_lvl4_q1.add("Uranium - 235");
        Collections.shuffle(ans_phy_lvl4_q1);
        return ans_phy_lvl4_q1;
    }
    static ArrayList<String> anslvl4q2(){
        ans_bio_lvl4_q2.add("leaves are shed from deciduous plants in the autumn");
        ans_bio_lvl4_q2.add("roots grow downwards"); //correct ans
        ans_bio_lvl4_q2.add("shoots grow towards the light");
        ans_bio_lvl4_q2.add("flowers can change position throughout the day");
        Collections.shuffle(ans_bio_lvl4_q2);
        return ans_bio_lvl4_q2;
    }
    static ArrayList<String> anslvl4q3(){
        ans_chem_lvl4_q3.add("Fused glass");
        ans_chem_lvl4_q3.add("Borosilicate glass");
        ans_chem_lvl4_q3.add("Lead crystal glass");
        ans_chem_lvl4_q3.add("Soda lime glass"); //correct ans
        Collections.shuffle(ans_chem_lvl4_q3);
        return ans_chem_lvl4_q3;
    }
    static ArrayList<String> anslvl5q1(){
        ans_phy_lvl5_q1.add("3.5 kW");
        ans_phy_lvl5_q1.add("3.5 MW");//correct ans
        ans_phy_lvl5_q1.add("35kw");
        ans_phy_lvl5_q1.add("35MW");
        Collections.shuffle(ans_phy_lvl5_q1);
        return ans_phy_lvl5_q1;
    }
    static ArrayList<String> anslvl5q2(){
        ans_bio_lvl5_q2.add("hCG is a polar molecule");
        ans_bio_lvl5_q2.add("hCG has a molecular mass of less than 69,000");//correct ans
        ans_bio_lvl5_q2.add("hCG is a polypeptide");
        ans_bio_lvl5_q2.add("hCG binds to cells using glycoprotein");
        Collections.shuffle(ans_bio_lvl5_q2);
        return ans_bio_lvl5_q2;
    }

    static ArrayList<String> anslvl5q3(){
        ans_chem_lvl5_q3.add("+4");
        ans_chem_lvl5_q3.add("+5");
        ans_chem_lvl5_q3.add("+7"); //correct ans
        ans_chem_lvl5_q3.add("+8");
        Collections.shuffle(ans_chem_lvl5_q3);
        return ans_chem_lvl5_q3;
    }


    static String InputAnswer(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your answer: ");
        String ans = input.next();
        return ans;
    }

    static boolean CheckAnswer(String input_ans, ArrayList<String> ans_question, ArrayList<String> mcq, String correct_ans){// this method check the answer correct or wrong
        String correct_choices = null;
        for (int i = 0; i < 4; i++) {
            if (ans_question.get(i).contains(correct_ans)){
                //System.out.println(ans_question.get(i).contains(correct_ans));
                correct_choices = mcq.get(i);
                //System.out.println(correct_choices);
                return ans_question.get(i).contains(correct_ans);
            }
        }
        return false;
    }
    static ArrayList<String> McqChoices(){
        mcqchoices.add("A");
        mcqchoices.add("B");
        mcqchoices.add("C");
        mcqchoices.add("D");
        return mcqchoices;
    }
    static void StopGame(){
        System.out.println(name+" IS A GENIUS!");
    }
}