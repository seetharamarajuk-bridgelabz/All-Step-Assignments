package week1And2.level2;

import java.util.Scanner;

public class CountdownFor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter starting number: ");
        int n = in.nextInt();
        for (int i = n; i >= 0; i--)
            System.out.println(i);
        in.close();
    }
}