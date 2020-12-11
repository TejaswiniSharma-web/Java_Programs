package day2;

import java.util.Scanner;

public class Caluculator_UserInput {
    public static void main(String[] args) {
            Scanner sc =new Scanner(System.in);
            Caluculator_UserInput cal =new Caluculator_UserInput();
            System.out.println("Enter 1st Number");
            int V1 =sc.nextInt();
            System.out.println("Enter 2ND Number");
            int V2 =sc.nextInt();
            System.out.println("Enter 3RD Number");
            int V3 =sc.nextInt();
            cal.addNumber(V1,V2,V3);


    }
    public  void addNumber(int i,int x,int z){
        int sum=i +x +z;
        System.out.println("Addition of Two number:"+sum);

    }

}
