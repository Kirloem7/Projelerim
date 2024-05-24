import java.util.Scanner;

public class AsalSayi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int girisHakki = 3;
        
        while (girisHakki > 0) {
            System.out.print("1-10000 arasinda sayi girin: ");
            int sayi = sc.nextInt();
            boolean asalMi = true;

            if (sayi == 1) {
                System.out.println("1 sayisi asal sayi degildir");
            } else if (sayi >= 2 && sayi <= 10000) {
                for (int i = 2; i <= Math.sqrt(sayi); i++) {
                    if (sayi % i == 0) {
                        asalMi = false;
                        break;
                    }
                }
                if (asalMi) {
                    System.out.println(sayi + " sayisi asal sayidir");
                } else {
                    System.out.println(sayi + " sayisi asal sayi degildir");
                    girisHakki--;
                    System.out.println("Tekrar deneyin. " + girisHakki + " hakkiniz daha var.");
                }
            } else {
                System.out.println("Gecersiz sayi girildi.");
                girisHakki--;
                if(girisHakki>0){
                System.out.println("Tekrar deneyin. " + girisHakki + " hakkiniz daha var.");
            }

            if (girisHakki == 0) {
                System.out.println("Giris hakkiniz doldu.");
            }
        }
    }
    }
}