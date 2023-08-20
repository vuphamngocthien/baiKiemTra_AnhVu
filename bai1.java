import java.util.ArrayList;
import java.util.Scanner;



public class bai1{

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
    
        System.out.println("nhap so nguyen duong n ");
        n = input.nextInt();
        if(n < 0)
        {
            System.out.println("nhap so nguyen duong n ");
            n = input.nextInt();
        }
        for(int i= 0; i< n;i++){
             if(isPrime(i)){
            System.out.println(i);
        }

        }
       
        input.close();




    }}