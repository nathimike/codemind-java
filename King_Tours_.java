import java.util.Scanner;
public class KingTours{
    public static void main(String [] args){
        Scanner read = new Scanner(System.in);
        int x,y,res;
        x = read.nextInt();
        y = read.nextInt();
        res = x*5 + y*7;
        System.out.println(res);
    }
}