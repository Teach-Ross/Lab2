import java.util.Scanner;

public class Main {
    static Scanner scnr = new Scanner(System.in);


    public static int getInput(String input) {
        int num;
        do {
            System.out.println(input);
            while (!scnr.hasNextInt()) {
                System.out.println("Input error");
                System.out.println(input);
                scnr.next();
            }
            num = scnr.nextInt();

            if(num <= 0 || num > 100){
                System.out.println("Input error");
            }

        } while (num <= 0 || num > 100);
        return num;
    }


    public static boolean isEven(int num) {
        boolean even = false;

        if (num % 2 == 0){
            even = true;
        }
        return even;
    }

    public static void playGame(){
        int inputNum = getInput("Please enter an integer (1-100): ");

        if (isEven(inputNum)) {
            if (inputNum > 60) {
                System.out.println(inputNum + " and Even");
            } else if (inputNum <= 25) {
                System.out.println("Even and less than 25");
            } else {
                System.out.println("Even");
            }
        }
        else {
            if (inputNum >60){
                System.out.println(inputNum + " and Odd");
            }
            else {
                System.out.println("Odd");
            }
        }
    }

    public static void main(String[] args) {
        String input;

        do {
            playGame();
            System.out.println("Continue? (Y/N)");
            input = scnr.next();
        } while (input.equalsIgnoreCase("y"));


    }
}

