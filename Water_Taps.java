import java.util.Scanner;
public class WaterTaps{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int a,b,c;
        a = read.nextInt();
        b = read.nextInt();
        c = (a * b) / (a + b);
        System.out.println(c);
    }
}