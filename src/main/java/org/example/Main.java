package org.example;
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
public class Main {
    /*static char[] Choices = {'A','B','C','D'};
    static String[] ansq1 ={"Magnitude and direction","dilation of arterioles near the surface of the skin","Calcium chloride"};
    static String[] level1q1 = {"Direction only","Magnitude only","Magnitude or direction","Magnitude and direction"};
    static String[] level1q2 = {"dilation of arterioles near the surface of the skin","erector muscles contract, causing hairs to stand up","rapid contractions of skeletal muscles","sweat glands release less sweat"};
    static String[] level1q3 = {"Carbon dioxide","Sulphur dioxide","Calcium chloride","Hydrogen chloride"};*/
    static ArrayList<String> firstquestion= new ArrayList<String>();
    static ArrayList<String> ans_phy_lvl1_q1 = new ArrayList<String>();
    static ArrayList<String> ans_bio_lvl1_q2 = new ArrayList<String>();
    static ArrayList<String> ans_chem_lvl1_q3 = new ArrayList<String>();
    static ArrayList<String> mcqchoices = new ArrayList<String>();
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
        String name = input.nextLine();
        return name;
    }

    static void Questions(){
        System.out.println("The question is now begin.");
        String[] LevelOne = {"A vector quantity has:","Which substance consists of ion?","Correctly describes how an endotherm would respond to an increase in temperature?"};
        String[] LevelTwo = {"Which of the following has the lowest rate of reaction?","What is the meaning of 800 W?",".Which of the following, A to D, is a similarity in the way ATP is made in respiration and photosynthesis?"};
        String[] LevelThree = {"Which of the following is a reduction reaction:","Which statement is correct about n-type semiconductor?","Which of the following, A to D, is not an example of cell signalling?"};
        String[] LevelFour = {"Which radioactive can be used to determine the age of the fossil?","Which of the following statements, A to D, is evidence for geotropism?","What type of glass is formed when calcium carbonate is heated with silicon dioxide?"};
        String[] LevelFive = {"Which of the following properties of the hormone hCG allows it to be detected in urine?","What is the oxidation number of X in XO,?","Which value is equal to 3 500 000 W?"};
        QuesOne(LevelOne);
//        QueTwo(LevelTwo);
//        QueThree(LevelThree);
//        QueFour(LevelFour);
//        QueFive(LevelFive);
    }

    static void QuesOne(String[] q){
        /*List<String> list = Arrays.asList(q); // converting array to a List
        Collections.shuffle(list); // Shuffling list elements
        String ques = q[0];
        System.out.println("\nQuestion 1 (Child)\n\t"+ques);
        DisplayQues(ques);*/

        firstquestion.add("A vector quantity has:");
        firstquestion.add("Which substance consists of ion?");
        firstquestion.add("Correctly describes how an endotherm would respond to an increase in temperature?");
        Collections.shuffle(firstquestion);
        DisplayQues(firstquestion);
    }

    static void DisplayQues(ArrayList<String> question){ // list of questions of question 1
        int turn;
        ArrayList<String> mcq = McqChoices();
        if (question.get(0).equals("A vector quantity has:")){
            System.out.println("\n"+question.get(0));
            turn = 1;
            ArrayList<String> ans =anslvl1q1();
            DisplayAnswer(turn,ans,mcq);

        } else if (question.get(0).equals("Which substance consists of ion?")) {
            System.out.println("\n"+question.get(0));
            turn = 2;
            ArrayList<String> ans =anslvl1q2();
            DisplayAnswer(turn, ans,mcq);

        } else if (question.get(0).equals("Correctly describes how an endotherm would respond to an increase in temperature?")){
            System.out.println("\n"+question.get(0) );
            turn = 3;
            ArrayList<String> ans =anslvl1q3();
            DisplayAnswer(turn,ans,mcq);
        }

        /*Scanner input = new Scanner(System.in);
        McqChoices();
        //prompt user enter answer
        //char mcq = 64;

        if (q == "A vector quantity has:") {

            List<String> list = Arrays.asList(level1q1);// converting array to a List
            Collections.shuffle(list); // Shuffling list elements
            for (int i = 0; i < level1q1.length; i++) {
//                mcq++;
                System.out.println("\t\t"+Choices[i]+" "+ level1q1[i]);

            }
            ProcessAnswer(level1q1);
        } else if (q == "Which substance consists of ion?") {
            List<String> list = Arrays.asList(level1q3); // converting array to a List
            Collections.shuffle(list); // Shuffling list elements
            for (int i = 0; i < level1q3.length; i++) {
//                mcq++;
                System.out.println("\t\t"+Choices[i]+" "+ level1q3[i]);
            }
        } else if (q == "Correctly describes how an endotherm would respond to an increase in temperature?") {
            List<String> list = Arrays.asList(level1q2); // converting array to a List
            Collections.shuffle(list); // Shuffling list elements
            for (int i = 0; i < level1q2.length; i++) {
//                mcq++;
                System.out.println("\t\t" +Choices[i]+ " " + level1q2[i]);
            }
        }
        System.out.print("Enter your answer: ");
        String inputanswer = input.nextLine();*/
    }

    static void DisplayAnswer(int line, ArrayList<String> ans1, ArrayList<String> mcq){
        if (line == 1){
            for (int i = 0; i < 4; i++) {
                System.out.println("\t\t"+mcq.get(i)+" "+ans1.get(i));
            }
            CheckAnswer();
        } else if (line == 2) {
            for (int j = 0; j < 4; j++) {
                System.out.println("\t\t"+mcq.get(j)+" "+ans1.get(j));
            }
            CheckAnswer();
        }  else if (line == 3){
            for (int c = 0; c < 4; c++) {
                System.out.println("\t\t"+mcq.get(c)+" "+ans1.get(c));
            }
            CheckAnswer();
        }
/*        switch (turn){
            case 1: for (int i = 0; i < mcqchoices.size(); i++) {
                    System.out.println("\t\t"+mcqchoices.get(i)+" "+anslvl1q1().get(i));
                    CheckAnswer();
                };
            case 2: for (int i = 0; i < mcqchoices.size(); i++) {
                    System.out.println("\t\t"+mcqchoices.get(i)+" "+anslvl1q2().get(i));
                    CheckAnswer();
                };
            case 3: for (int i = 0; i < mcqchoices.size(); i++) {
                    System.out.println("\t\t"+mcqchoices.get(i)+" "+anslvl1q3().get(i));
                    CheckAnswer();
                };
        }*/
    }
    static ArrayList<String> anslvl1q1(){ //ans phy question 1
        ans_phy_lvl1_q1.add("Magnitude and direction");
        ans_phy_lvl1_q1.add("Magnitude or direction");
        ans_phy_lvl1_q1.add("Magnitude only");
        ans_phy_lvl1_q1.add("Direction only");
        Collections.shuffle(ans_phy_lvl1_q1); //shuffle the question
        return ans_phy_lvl1_q1;
    }

    static ArrayList<String> anslvl1q2(){ // ans bio question 1
        ans_bio_lvl1_q2.add("Carbon dioxide");
        ans_bio_lvl1_q2.add("Sulphur dioxide");
        ans_bio_lvl1_q2.add("Calcium chloride");
        ans_bio_lvl1_q2.add("Hydrogen chloride");
        Collections.shuffle(ans_bio_lvl1_q2); //shuffle the question
        return ans_bio_lvl1_q2;
    }

    static ArrayList<String> anslvl1q3(){ // ans chem question 1
        ans_chem_lvl1_q3.add("dilation of arterioles near the surface of the skin");
        ans_chem_lvl1_q3.add("erector muscles contract, causing hairs to stand up");
        ans_chem_lvl1_q3.add("rapid contractions of skeletal muscles");
        ans_chem_lvl1_q3.add("sweat glands release less sweat");
        Collections.shuffle(ans_chem_lvl1_q3); //shuffle the question
        return ans_chem_lvl1_q3;
    }

    static void CheckAnswer(){ // this method check the answer correct or wrong
       System.out.println("qefqefqef");


    }
    static ArrayList<String> McqChoices(){
        mcqchoices.add("A");
        mcqchoices.add("B");
        mcqchoices.add("C");
        mcqchoices.add("D");
        return mcqchoices;
    }

}