import java.util.Scanner;

class UserChoise {
    public static void main(String[] args) {

        System.out.println("This prophetic program will surely tell you the greatest number out of those three you dare to input. Care to try?");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter variable A and press ENTER, please = ");
        int varA = in.nextInt();
        System.out.print("Enter variable B and press ENTER, please = ");
        int varB = in.nextInt();
        System.out.print("Enter variable C and press ENTER, please = ");
        int varC = in.nextInt();

        if (varA == varB && varC == varB) {
          System.out.println("All of your damn numbers are identical! Do you know digits other than " + varC + "?");
        } else if (varA == varB && varA > varC) {
            System.out.println("Variables A and B share their greatness: " + varB);
        } else if (varC == varB && varC > varA) {
            System.out.println("Variables B and C share their greatness: " + varC);
        } else if (varC == varA && varC > varB) {
            System.out.println("Variables A and C share their greatness: " + varA);
        } else if (varA > varB && varA > varC) {
            System.out.println("Variable A is the greatest: " + varA);
        } else if (varB > varC) {
            System.out.println("Variable B is the greatest: " + varB);
        } else {
            System.out.println("Variable C is the greatest: " + varC);
        }


    }
}