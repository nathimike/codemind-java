import java.util.Scanner;
public class SwapTwoNumbers{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int x,y;
        x = read.nextInt();
        y = read.nextInt();
        int temp = x;
        x = y;
        y = temp;
        System.out.println(x + "
" + y);
    }
}