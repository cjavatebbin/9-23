
/**
 * @author Terence Wu
 * @version 9/23/2024
 */

import java.util.Scanner;

public class PepysProblem {
    
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to the Pepys Problem.")
        System.out.print("Enter the number of simulations to run: ")
        int simulations = s.nextInt();

        Pepys p = new Pepys();
        System.out.println("\nThe empirical probability of rolling at least one six if six dice are rolled is: " + p.probAtLeastOneSix());
        System.out.println("The empirical probability of rolling at least two six if 12 dice are rolled is: " + p.probAtLeastTwoSixes());
            
    }
}
