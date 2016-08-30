package cw10;

import java.util.Scanner;

public class CustomExceptionTest {
    public static void main(String[] args) throws IllegalAgeException {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age < 0) {
            throw new IllegalAgeException("Illegal age entered");
        } else {
            System.out.println(age);
        }
    }
}
