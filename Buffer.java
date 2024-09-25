 import java.io.*;
 class Buffer {
    public static void main(String[] args)  {
        try{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  // (System.in) is keybord 
        System.out.println("Enter the First Number");
        int no1 = Integer.parseInt(br.readLine());
        System.out.println("Enter the Second Number");
        int no2 = Integer.parseInt(br.readLine());
        int ans = no1+no2;
        System.out.println("Addition is :"+ans);
        }
        catch(Exception obj){
            System.out.println(obj);
        }
    }
}
