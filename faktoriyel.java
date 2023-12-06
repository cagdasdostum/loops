package javaDonguler;
import java.util.Scanner;

public class faktoriyel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sayi, carpim;
        System.out.print("--Faktöriyel Hesaplayıcı-- \n Sayı girin: ");
        sayi = scan.nextInt();
        carpim = 1;
        for (int i = 1; i<=sayi; i++){
            carpim*=i;
        }
        System.out.println(sayi+"! = "+carpim);
        scan.close();
        
    }
    
}
