import java.util.Scanner;
// vize yüzde 40 final yüzde 60 al. harfle derecelendirme
public class ornek10 {
    public static void main(String[] args){
        System.out.println("Notlarınızı girin");
        Scanner vizegir = new Scanner(System.in);
        System.out.println("Vize notunu girin:");
        int vize = vizegir.nextInt();

        Scanner finalgir = new Scanner(System.in);
        System.out.println("Final notunu girin:");
        int finalnot = finalgir.nextInt();

        int vizeal = vize*40/100;
        int finalal = finalnot*60/100;
        int ortalama = vizeal + finalal;

        if(ortalama>90)
            System.out.println(ortalama + "AA");
        else if(ortalama>85)
            System.out.println(ortalama + "BA");
        else if(ortalama>75)
            System.out.println(ortalama + "BB");
        else if(ortalama>65)
            System.out.println(ortalama + "CB");
        else if(ortalama>60)
            System.out.println(ortalama + "CC");
        else if(ortalama>50)
            System.out.println(ortalama + "DC");
        else if(ortalama>45)
            System.out.println(ortalama + "DD");
        else{
            System.out.println("kaldınız");

        }




    }
}
