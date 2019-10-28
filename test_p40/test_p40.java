
import java.io.IOException;
import java.util.Scanner;

public class test_p40{
    public static void main(String[] args)throws IOException {
        System.out.println("請輸入字串");
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        System.out.println("請輸入要新增的字串");
        String str2 = scanner.nextLine();
        scanner.close();
        StringBuffer sb = new StringBuffer(str1);
        sb.append(str2);
        System.out.println("在"+str1+"後新增"+str2+"的話就會變成"+sb);
    }
}