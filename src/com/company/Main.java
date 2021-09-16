package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int total = 0;
        for (int i = 0; i < input.length(); i+= 2) if (input.charAt(i) % 3 == 0) total += Character.getNumericValue(input.charAt(i));
        System.out.println(total);
    }
}
