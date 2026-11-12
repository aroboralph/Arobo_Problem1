/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arobo_problem1;

/**
 *
 * @author arobo_CPE113
 */
import java.util.Scanner;

public class Arobo_Problem1 {

    public static int sumOfDigits(int number) {
        if (number == 0) {
            return 0;
        }

        return (number % 10) + sumOfDigits(number / 10);
    }

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int number = in.nextInt();
           
            System.out.println(sumOfDigits(number));
        }
    }
}
 