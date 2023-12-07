package javaDonguler;
import java.util.Scanner;
public class atm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int right, islem, balance, price, select;
        right = 3;
        balance = 1500;
        String username, password;
        while(right>0){
            System.out.println("Kullanıcı adını giriniz: ");
            username = scan.nextLine();
            System.out.println("Şifreyi giriniz: ");
            password = scan.nextLine();
            if(username.equals("asd")&&password.equals("123")){
                do{
                    System.out.println("Yapmak istediğiniz işlemi seçin: \n 1.Para Yatırma \n 2.Para Çekme \n 3.Bakiye Görüntüleme \n 4.Çıkış");
                    select = scan.nextInt();
                    if(select==1){
                        System.out.print("Yatırmak istediğiniz tutarı girin: ");
                        price = scan.nextInt();
                        balance+=price;
                    }
                    else if(select ==2){
                        System.out.print("Çekmek istediğiniz tutarı girin: ");
                        price = scan.nextInt();
                        if(balance>price)
                            balance-=price;
                        else
                            System.out.println("Bakiye yetersiz!");    

                        
                    }
                    else if(select==3)
                        System.out.println("Güncel Bakiye: "+balance);


                }while(select!=4);
                System.out.println("Tekrar görüşmek üzere!");
                break;
            }else{
                right--;
                System.out.println("Hatalı girdiniz tekrar deneyiniz!");
                if(right==0){
                    System.out.println("Hesabınız bloke olmuştur!");
                }
                    else {
                        System.out.println("Kalan Hakkınız: "+right);
                    }

            }scan.close();       

        }
        

    }
    
}
