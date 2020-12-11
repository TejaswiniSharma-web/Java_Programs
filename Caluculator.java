package day2;

public class Caluculator {
    public static void main(String[] args) {
        Caluculator cal = new Caluculator();
        cal.addNumber(30, 40, 15);
        cal.mulNumber(75, 345, 100);
        cal.divNumber(75, 345, 100);
        cal.reminder(75, 345, 100);
        cal.subNumber(75, 345, 100);

       /* int i=10;
        int x=20;*/
       /* int sum =i+x;
        System.out.println(sum);*/
    }

    //Access Modifier,Return type,MethodName,(Parameters)
    public void addNumber(int i, int x, int y) {
        int sum = i + x + y;
        System.out.println("Addition of two numbers" + sum);

    }
    public void mulNumber(int i,int x,int y){
        int Mul =i*x*y;
        System.out.println("Multiplication of two numbers"+Mul);
    }
    public void subNumber(int i,int x,int y){
        int sub =i-x-y;
        System.out.println("Substraction of two numbers"+sub);
    }
    public void reminder(int i,int x,int y){
        int reminder =i%x%y;
        System.out.println("Reminder of two numbers"+reminder);
    }
    public void divNumber(int i,int x,int y){
        int div =i/x/y;
        System.out.println("Division of two numbers"+div);

    }
}