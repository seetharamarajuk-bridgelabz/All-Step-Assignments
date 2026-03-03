package week1And2.level2;

import java.util.Scanner;

public class FirstSmallest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
        System.out.println("Is first number smallest? " + (a < b && a < c));
        in.close();
    }
}