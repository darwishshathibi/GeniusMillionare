package org.example;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class Main {
    static String[] OneOne = {"Direction only","Magnitude only","Magnitude or direction","Magnitude and direction"};
    static String[] OneTwo = {"dilation of arterioles near the surface of the skin","erector muscles contract, causing hairs to stand up","rapid contractions of skeletal muscles","sweat glands release less sweat"};
    static String[] OneThree = {"Carbon dioxide","Sulphur dioxide","Calcium chloride","Hydrogen chloride"};
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
        String[] LevelOne = {"A vector quantity has:","Which substance consists of ion?","Correctly describes how an endotherm would respond to an increase in temperature?"};
        String[] LevelTwo = {"Which of the following has the lowest rate of reaction?","What is the meaning of 800 W?",".Which of the following, A to D, is a similarity in the way ATP is made in respiration and photosynthesis?"};
        String[] LevelThree = {"Which of the following is a reduction reaction:","Which statement is correct about n-type semiconductor?","Which of the following, A to D, is not an example of cell signalling?"};
        String[] LevelFour = {"Which radioactive can be used to determine the age of the fossil?","Which of the following statements, A to D, is evidence for geotropism?","What type of glass is formed when calcium carbonate is heated with silicon dioxide?"};
        String[] LevelFive = {"Which of the following properties of the hormone hCG allows it to be detected in urine?","What is the oxidation number of X in XO,?","Which value is equal to 3 500 000 W?"};
        System.out.println("The question is now begin.");
        QueOne(LevelOne);
//        QueTwo(LevelTwo);
//        QueThree(LevelThree);
//        QueFour(LevelFour);
//        QueFive(LevelFive);
    }

    static void QueOne(String[] q){
        List<String> list = Arrays.asList(q); // converting array to a List
        Collections.shuffle(list); // Shuffling list elements
        String ques = q[0];
        System.out.println("\nQuestion 1 (Child)\n\t"+ques);
        AnswerAll(ques);
    }

    static void AnswerAll(String q){
        Scanner input = new Scanner(System.in);
        //prompt user enter answer
        char mcq = 64;

        if (q == "A vector quantity has:") {
            List<String> list = Arrays.asList(OneOne); // converting array to a List
            Collections.shuffle(list); // Shuffling list elements
            for (int i = 0; i < OneOne.length; i++) {
                mcq++;
                System.out.println("\t\t"+mcq+" "+OneOne[i]);
            }
        } else if (q == "Which substance consists of ion?") {
            List<String> list = Arrays.asList(OneThree); // converting array to a List
            Collections.shuffle(list); // Shuffling list elements
            for (int i = 0; i < OneThree.length; i++) {
                mcq++;
                System.out.println("\t\t"+mcq+" "+OneThree[i]);
            }
        } else if (q == "Correctly describes how an endotherm would respond to an increase in temperature?") {
            List<String> list = Arrays.asList(OneTwo); // converting array to a List
            Collections.shuffle(list); // Shuffling list elements
            for (int i = 0; i < OneTwo.length; i++) {
                mcq++;
                System.out.println("\t\t" + mcq + " " + OneTwo[i]);
            }
        }
        System.out.print("Enter your answer: ");
        char ansmcq = input.next().charAt(0);
       // char trueans = ProcessAnswer(ansmcq);
    }
    
   /*static boolean ProcessAnswer(char a){
        String[] trueq1 ={"Magnitude and direction","dilation of arterioles near the surface of the skin","Calcium chloride"};
        if (a == ){

        } else if () {

        }
    }*/

}