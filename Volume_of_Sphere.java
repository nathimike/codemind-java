import java.util.Scanner;
public class VolumeSphere{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int x = read.nextInt();
        float vol = x*x*x * (float)3.14 * 4/(float)3;
        System.out.printf("%.2f",vol);
    }
}