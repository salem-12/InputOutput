import java.util.Scanner;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.println(" Welcome to ElizaChats! My name is Eliza,what is your name?: ");
        String name=scanner.nextLine();
        System.out.println("Nice to meet you, Hannah Snow");
        String greeting = scanner.nextLine();
        System.out.println("How has your day been?: ");
        String Question = scanner.nextLine();
        System.out.println("It has been a splendid day!: ");
        String answer = scanner.nextLine();
        System.out.println("Okay, Anything in particular that makes you feel that It has been a splendid day!?: ");
        String choice = scanner.nextLine();
        System.out.println("Yes, I got a job promotion : ");
        System.out.println("Okay, Well it has been my pleasure to speak with you. Have a nice day!");
        System.out.println(" Hannah Snow It has been a splendid day! Yes, I got a job promotion; ");
    }
}

