package NewProjectQuizGenius;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Collections;
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.ArrayList;
public class readfile {
    static boolean validate;
    static ArrayList<String> question1 = new ArrayList<>();
    static ArrayList<String> question2 = new ArrayList<>();
    static ArrayList<String> question3 = new ArrayList<>();
    static ArrayList<String> question4 = new ArrayList<>();
    static ArrayList<String> question5 = new ArrayList<>();
    public static void main(String[] args) throws FileNotFoundException{
        boolean check =  validate;
        for (int i = 1; i <= 5; i++) {
            System.out.println("\nQuestion "+i);
            displayquestion(i);
        }
            System.out.println("DOne");
    }
    static void displayquestion(int turn) throws FileNotFoundException {
        boolean check =  validate;
        switch (turn) {
            case 1:
                q1(); break;
            case 2:
                q2(); break;
            case 3:
                q3(); break;
            case 4:
                q4(); break;
            case 5:
                q5(); break;
        }
    }
    static void q1() throws FileNotFoundException{
        File file = new File("C:/Users/User/Documents/GeniusMillionare/src/main/java/NewProjectQuizGenius/question1collections.txt");
        Scanner input = new Scanner(file);
        while (input.hasNextLine())
            question1.add(input.nextLine());
//        System.out.println(question1);
//        System.out.println(question1.size());
        Collections.shuffle(question1);
        System.out.println(question1.get(2));
        System.out.println();
    }
    static void q2() throws FileNotFoundException{
        File file = new File("C:/Users/User/Documents/GeniusMillionare/src/main/java/NewProjectQuizGenius/question2collections.txt");
        Scanner input = new Scanner(file);
        while (input.hasNextLine())
            question2.add(input.nextLine());
        Collections.shuffle(question2);
        System.out.println(question2.get(0));
        System.out.println();
    }
    static void q3() throws FileNotFoundException{
        File file = new File("C:/Users/User/Documents/GeniusMillionare/src/main/java/NewProjectQuizGenius/question3collections.txt");
        Scanner input = new Scanner(file);
        while (input.hasNextLine())
            question3.add(input.nextLine());
        Collections.shuffle(question3);
        System.out.println(question3.get(0));
        System.out.println();
    }
    static void q4() throws FileNotFoundException{
        File file = new File("C:/Users/User/Documents/GeniusMillionare/src/main/java/NewProjectQuizGenius/question4collections.txt");
        Scanner input = new Scanner(file);
        while (input.hasNextLine())
            question4.add(input.nextLine());
        Collections.shuffle(question4);
        System.out.println(question4.get(0));
        System.out.println();
    }
    static void q5() throws FileNotFoundException{
        File file = new File("C:/Users/User/Documents/GeniusMillionare/src/main/java/NewProjectQuizGenius/question5collections.txt");
        Scanner input = new Scanner(file);
        while (input.hasNextLine())
            question5.add(input.nextLine());
        Collections.shuffle(question5);
        System.out.println(question5.get(0));
        System.out.println();
    }
}
