package week1And2.level2;

import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = in.nextInt();
        System.out.println(age >= 18 ? "Eligible to vote" : "Not eligible to vote");
        in.close();
    }
}