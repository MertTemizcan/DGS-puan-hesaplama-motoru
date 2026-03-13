import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("DGS puan hesaplama sistemine hoşgeldiniz");

        System.out.print("Türkçe'de doğru yaptığınız soru sayısını giriniz: ");
        int turkceDogru = scan.nextInt();
        System.out.print("Türkçe'de yanlış yaptığınız soru sayısını giriniz: ");
        int turkceYanlis = scan.nextInt();


        if (turkceDogru + turkceYanlis > 50) {
            System.out.println("Hatalı veri girişi soru sayısı 50'den fazla olamaz");
            return;
        }

        if(turkceDogru < 0 || turkceYanlis < 0) {
            System.out.println("Hatalı veri girişi negatif sayılar girilemez");
            return;
        }

        double turkceNet = turkceDogru - (turkceYanlis / 4.0);
        int turkceBos = 50 - (turkceDogru + turkceYanlis);

        System.out.print("Matematik'te doğru yaptığınız soru sayısını giriniz: ");
        int matDogru = scan.nextInt();
        System.out.print("Matematik'te yanlış yaptığınız soru sayısını giriniz: ");
        int matYanlis = scan.nextInt();

        if (matDogru + matYanlis > 50) {
            System.out.println("Hatalı veri girişi soru sayısı 50'den fazla olamaz");
            return;
        }

        if(matDogru < 0 || matYanlis < 0) {
            System.out.println("Hatalı veri girişi negatif sayılar girilemez");
            return;
        }

        double matNet = matDogru - (matYanlis / 4.0);
        int matBos = 50 - (matDogru + matYanlis);

        System.out.print("Üniversite gano puanınızı giriniz: ");
        double gano = scan.nextDouble();

        if (gano < 0 || gano > 4) {
            System.out.println("Hatalı veri girişi gano notu 0 ile 4 arasında olmalıdır");
            return;
        }

        double obp = gano * 20;

        double toplamPuan = (matNet * 3.0) + (turkceNet * 0.6) + obp + 120;

        System.out.println("Türkçe netiniz: " + turkceNet + " Doğru sayınız: " + turkceDogru + " yanlış sayınız: " + turkceYanlis + " boş sayınız: " + turkceBos);
        System.out.println("Matematik netiniz: " + matNet + " doğru sayınız: " + matDogru + " yanlış sayınız: " + matYanlis + " boş sasyınız: " + matBos);
        System.out.println("Obp puanınız: " + obp);
        System.out.println("Tahmini DGS puanınız: " + toplamPuan);

    }
}