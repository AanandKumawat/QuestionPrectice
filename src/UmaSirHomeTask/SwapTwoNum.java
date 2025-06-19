package UmaSirHomeTask;

public class SwapTwoNum {
    public static void FirstWay(){
        int a=10;
        int b=20;
        System.out.println(a+" "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a+" "+b);
    }
    public static void SecondWay(){
        int a=54;
        int b=46;
        a=a^b;
        b=a^b;
        a=b^a;
        System.out.println(a+" "+b);
    }
    public static void main(String[] args) {
        //write a program to swap two numbers without 3rd variables
      SecondWay();
    }
}
