package day1;

import net.bytebuddy.implementation.bytecode.Addition;

public class AirthameticOperator {
    public static void main(String[] args) {
        int i =10;
        int j=20;
        int sum =i+j;
        int sub=j-i;
        int div=j/i;
        int mul =j*i;
        int rem =i%j;
        System.out.println("Addition"+sum);
        System.out.println("Substraction"+sub);
        System.out.println("Division"+div);
        System.out.println("Multiplication"+mul);
        System.out.println("Remdier"+rem);
        //increment
        int z=10;
        z++;
        System.out.println(z);
        //Decreement
        int x=10;
        x--;
        System.out.println("Decrement"+x);
    }
}
