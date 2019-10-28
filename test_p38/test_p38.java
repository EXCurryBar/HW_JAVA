import java.io.*;

public class test_p38 {
    public static void main(String[] args) throws IOException {
        System.out.println("請輸入字串");
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));

        String str1 = br1.readLine();
        System.out.println("請輸入要檢索的文字");

        String str2 = br1.readLine();
        char ch = str2.charAt(0);
        int num = str1.indexOf(ch);

        System.out.println(num!=1?str1+"的第"+(num+1)+"個字就是「"+ch+"」":str1+"中沒有「"+ch+"」這個字");

    }
}