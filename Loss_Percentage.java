import java.util.Scanner;
public class LossPercentage{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        float x,y;
        x = read.nextFloat();
        y = read.nextFloat();
        float res = 100 * (x-y)/x;
        System.out.printf("%.2f",res);
    }
}