package silli;

import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        Scanner s = new Scanner( System.in);
        int a = s.nextInt();
        if ( a %2 == 0 ){
            System.out.println("this is EVEN number ");
        }else{
            System.out.println("this is odd number ");
        }
    }
}
