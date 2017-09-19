package lab1;

import java.io.*;

public class Lab1 {

    static BufferedReader cin = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws NumberFormatException, IOException {
        int fizz, buzz, start, end, count;
        while (true) {
            System.out.print("Enter Fizz number: ");
            fizz = Integer.parseInt(cin.readLine());
            if (fizz == 0) {
                System.out.println(" ");
                System.out.println("The end.");
                return;
            }
            while (fizz < 0) {
                System.out.print("ERROR: Negative numbers are not allowed! Try again: ");
                fizz = Integer.parseInt(cin.readLine());
            }
            System.out.print("Enter Buzz number: ");
            buzz = Integer.parseInt(cin.readLine());
            if (buzz == 0) {
                System.out.println("/nThe end./n");
                return;
            }
            while (buzz < 0) {
                System.out.print("ERROR: Negative numbers are not allowed! Try again: ");
                buzz = Integer.parseInt(cin.readLine());
            }
            System.out.print("Enter starting number: ");
            start = Integer.parseInt(cin.readLine());

            System.out.print("Enter ending number: ");
            end = Integer.parseInt(cin.readLine());
            while (end <= start) {
                System.out.print("ERROR: Ending number cannot be less than starting number! Try again: ");
                end = Integer.parseInt(cin.readLine());
            }
            for (count = start; count <= end; count++) {
                System.out.printf("%d. ", count);
                if (count % fizz == 0) {
                    if (count % buzz == 0) {
                        System.out.println("FizzBuzz");
                    } else {
                        System.out.println("Fizz");
                    }
                } else if (count % buzz == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.printf("%d", count);
                    System.out.println(" ");
                }
            }

        }
    }

}
