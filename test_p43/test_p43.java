import java.io.IOException;
import java.util.Scanner;

public class test_p43{
    public static void main(String[] args)throws IOException {
        System.out.println("請輸入兩個整數");

        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        sc.close();

        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);

        int ans = Math.max(num1, num2);

        System.out.println(num1+"與"+num2+"中較大的是"+ans);
    }
}