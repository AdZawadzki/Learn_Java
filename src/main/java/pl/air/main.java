package pl.air;

import pl.air.learn.lesson1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        lesson1 zad1 = new lesson1();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Wprowadź temperature: ");
            int text = Integer.parseInt(input.nextLine());
            zad1.check(text);


        }



    }
}
