package Session3;

import java.util.Scanner;

public class ScannerClass {
    //psvm shortcut
    //sout shortcut
    public static void main(String[] args) {
        System.out.println();
        String userName= "Maria";
        int userAge = 34;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please provide some text:");
        String userInput = scanner.nextLine();
        System.out.println("Your input is: "+userInput);
        scanner.close();

    }
}
