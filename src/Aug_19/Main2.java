package Aug_19;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number 1:");
        int x = sc.nextInt();
        System.out.println("Input number 2:");
        int y = sc.nextInt();
        try{
            System.out.println(x/y);
        }catch (ArithmeticException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            sc.close();
        }
    }

    public static void callSleep() throws InterruptedException{
        Thread.sleep(1000);
    }
}
