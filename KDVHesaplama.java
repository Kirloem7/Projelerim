import java.util.Scanner;
public class KDVHesaplama {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double tutar,kdvlifiyat,kdv=0.10;

        System.out.print("Urunun tutarini giriniz:");
        tutar=scan.nextDouble();
        kdvlifiyat=tutar+(tutar*kdv);
        System.out.println("Urunun kdv'li fiyati:"+kdvlifiyat +"TL");
    }
    
}