import java.util.Scanner;

class ClassIO {
    public static void main(String[] args) {
      Scanner sobj = new Scanner(System.in);
      System.out.println("Enter the first number ");
      int No1 = sobj.nextInt();
      System.out.println("Enter the second number ");
      int No2 = sobj.nextInt();
      int ans = 0;
      ans = No1+No2;
      System.out.println("Addition of two number is :"+ans);
      sobj.close();
    }
}
