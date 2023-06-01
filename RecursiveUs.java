import java.util.Scanner;
public class RecursiveUs {
    static int Power(int a,int b){
        if(b==0)
            return 1;
        else
            return a*Power(a,b-1);
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a,b;
        System.out.print("1. Sayı: ");
        a=input.nextInt();
        System.out.print("2. Sayı: ");
        b= input.nextInt();
        System.out.println(Power(a,b));


    }
}
