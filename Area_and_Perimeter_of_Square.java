import java.util.Scanner;
public class AreaPerimeterSquare{
    public static void main(String [] args){
        Scanner read = new Scanner(System.in);
        int x;
        x = read.nextInt();
        System.out.println(x*x + " " + 2*(x+x));
    }
}