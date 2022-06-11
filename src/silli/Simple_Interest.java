package silli;

import java.util.Scanner;

public class Simple_Interest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double principle , interest , time ;

        principle= s.nextFloat();
        interest= s.nextFloat();
        time= s.nextFloat();
        double sP = (( principle*interest)*time)/100;
        System.out.println(sP);
    }
}
