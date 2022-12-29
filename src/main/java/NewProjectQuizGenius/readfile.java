package NewProjectQuizGenius;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.List;
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.ArrayList;
public class readfile {
    static boolean validate;
    static ArrayList<String> question1 = new ArrayList<>();
    static ArrayList<String> answer_q1 = new ArrayList<>();
    static List<String> answer_q1_phy = new ArrayList<>();
    static List<String> answer_q1_bio = new ArrayList<>();
    static List<String> answer_q1_chem = new ArrayList<>();
    static ArrayList<String> question2 = new ArrayList<>();
    static ArrayList<String> answer_q2 = new ArrayList<>();
    static List<String> answer_q2_phy = new ArrayList<>();
    static List<String> answer_q2_bio = new ArrayList<>();
    static List<String> answer_q2_chem = new ArrayList<>();
    static ArrayList<String> ansq3 = new ArrayList<>();
    static ArrayList<String> ansq4 = new ArrayList<>();
    static ArrayList<String> ansq5 = new ArrayList<>();
    static ArrayList<String> question3 = new ArrayList<>();
    static ArrayList<String> question4 = new ArrayList<>();
    static ArrayList<String> question5 = new ArrayList<>();
    static ArrayList<String> answer = new ArrayList<>();
    static ArrayList<String> mcq = new ArrayList<>();
    static int round;
    public static void main(String[] args) throws FileNotFoundException{
        boolean check =  validate;
        for (round = 1; round <= 5; round++) {
            System.out.println("\nQuestion "+round);
            int random = (int) (Math.random()*3);
            //System.out.println(random);
            displayquestion(round, random);
        }
        //answer();
            System.out.println("DOne");
    }
    static boolean displayquestion(int turn, int random) throws FileNotFoundException {
        //boolean check =  validate;
        switch (turn) {
            case 1 -> q1(random);
            case 2 -> q2(random);
            case 3 -> q3(random);
            case 4 -> q4(random);
            case 5 -> q5(random);
        }
        return false; // change to validate later
    }
    static void q1(int random) throws FileNotFoundException{
        File file = new File("question1collections.txt");
        Scanner input = new Scanner(file);
        while (input.hasNextLine())
            question1.add(input.nextLine());
        showquestion(question1, random);
        generate_answer(random);
    }
    static void q2(int random) throws FileNotFoundException{
        File file = new File("question2collections.txt");
        Scanner input = new Scanner(file);
        while (input.hasNextLine())
            question2.add(input.nextLine());
        showquestion(question2, random);
        generate_answer(random);
    }
    static void q3(int random) throws FileNotFoundException{
        File file = new File("question3collections.txt");
        Scanner input = new Scanner(file);
        while (input.hasNextLine())
            question3.add(input.nextLine());
        showquestion(question3, random);
        generate_answer(random);
    }
    static void q4(int random) throws FileNotFoundException{
        File file = new File("question4collections.txt");
        Scanner input = new Scanner(file);
        while (input.hasNextLine())
            question4.add(input.nextLine());
        showquestion(question4, random);
        generate_answer(random);
    }
    static void q5(int random) throws FileNotFoundException{
        File file = new File("question5collections.txt");
        Scanner input = new Scanner(file);
        while (input.hasNextLine())
            question5.add(input.nextLine());
        showquestion(question5, random);
        generate_answer(random);
    }
    static void showquestion(ArrayList<String> question, int random){System.out.println(question.get(random));}
    static void generate_answer(int turn) throws FileNotFoundException {
        if (round == 1){
            readfile_ans_q1();
            switch (turn) {
                case 0 -> {
                    answer_q1_phy = answer_q1.subList(0, 4);
                    show_answer(answer_q1_phy);
                }
                case 1 -> {
                    answer_q1_bio = answer_q1.subList(4, 8);
                    show_answer(answer_q1_bio);
                }
                case 2 -> {
                    answer_q1_chem = answer_q1.subList(8, 12);
                    show_answer(answer_q1_chem);
                }
            }
        } else if (round == 2) {
           readfile_ans_q2();
            switch (turn) {
                case 0 -> {
                    answer_q2_phy = answer_q2.subList(0, 4);
                    show_answer(answer_q1_phy);
                }
                case 1 -> {
                    answer_q2_bio = answer_q2.subList(4, 8);
                    show_answer(answer_q2_bio);
                }
                case 2 -> {
                    answer_q2_chem = answer_q2.subList(8, 12);
                    show_answer(answer_q2_chem);
                }
            }
        } else if (round == 3) {
           readfile_ans_q3();
        } else if (round == 4) {
            readfile_ans_q4();
        } else if (round == 5) {
            readfile_ans_q5();
        }
    }
    static void show_answer(List<String> answer){
        mcq_choices();
        for (int i = 0; i < answer.size(); i++) {
            System.out.println("\t"+mcq.get(i)+" "+answer.get(i));
        }
    }
    static void check_answer(String correct_answer, ArrayList<String> answer){ //later change to true
        String correct_choices = null;
        for (int i = 0; i < 4; i++) {

            if (answer.get(i).contains(correct_answer))
                correct_choices = mcq.get(i);
        }
    }
    static void readfile_ans_q1()throws FileNotFoundException{
        File file = new File("ansq1.txt");
        Scanner input = new Scanner(file);
        while (input.hasNextLine())
            answer_q1.add(input.nextLine());
    }
    static void readfile_ans_q2()throws FileNotFoundException{
        File file = new File("ansq2.txt");
        Scanner input = new Scanner(file);
        while (input.hasNextLine())
            answer_q2.add(input.nextLine());
    }
    static void readfile_ans_q3()throws FileNotFoundException{
        File file = new File("ansq3.txt");
        Scanner input = new Scanner(file);
        while (input.hasNextLine())
            ansq3.add(input.nextLine());
    }
    static void readfile_ans_q4()throws FileNotFoundException{
        File file = new File("ansq4.txt");
        Scanner input = new Scanner(file);
        while (input.hasNextLine())
            ansq4.add(input.nextLine());
    }
    static void readfile_ans_q5()throws FileNotFoundException{
        File file = new File("ansq5.txt");
        Scanner input = new Scanner(file);
        while (input.hasNextLine())
            ansq5.add(input.nextLine());
    }
    static void mcq_choices(){
        mcq.add("A");
        mcq.add("B");
        mcq.add("C");
        mcq.add("D");
    }
}
