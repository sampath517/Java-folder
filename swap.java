/*public class swap{
    public static void main(String [] args){
        int x=20;
        int y=30;
        int temp;
        temp=x;
        x=y;
        y=temp;
        System.out.println("x:"+ x+ " y:" +y+" ");
    }
}*/
import java.util.Scanner;               //user Input 
public class swap{
    public static void main(String []args){
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();                     //string will be nextLine()
        int y =s.nextInt();
        System.out.print(x+" "+y);
    }
}