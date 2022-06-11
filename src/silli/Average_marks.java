package silli;

import java.util.Scanner;

public class Average_marks {
    public static void main(String[] args) {
        int m1, m2, m3, avg;
        System.out.println("Your name ");
        System.out.println(" Enter Marks of 3 sub");

        Scanner s = new Scanner(System.in);
        char name = s.next().charAt(0);
        m1 = s.nextInt();
        m2 = s.nextInt();
        m3 = s.nextInt();
        avg = (m1+m2+m3)/3;
        System.out.println(name);
        System.out.println(avg+" this is the average marks that you got ");
    }
}
