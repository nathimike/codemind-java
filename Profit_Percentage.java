import java.util.Scanner;
public class KingTours{
    public static void main(String [] args){
        Scanner read = new Scanner(System.in);
        int x,y;
        x = read.nextInt();
        y = read.nextInt();
        float res = 100*(y-x)/(float)x;
        System.out.printf("%.2f",res);
    }
}