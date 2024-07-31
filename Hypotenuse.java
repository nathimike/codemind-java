import java.util.Scanner;
public class Hypotenuse{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int x,y;
        x = read.nextInt();
        y = read.nextInt();
        double res = Math.sqrt(x*x + y*y);
        System.out.printf("%.2f",res);
    }
}