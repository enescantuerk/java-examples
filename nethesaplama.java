import java.util.Scanner;
public class ornek8 {
    public static void main(String[] args){
        System.out.println("Net Hesaplama");
        Scanner dogru = new Scanner(System.in);
        System.out.println("Lütfen doğru sayısını girin:");

        int dogrusay = dogru.nextInt();

        Scanner yanlis = new Scanner(System.in);
        System.out.println("Lütfen yanlış sayısını girin:");

        int yanlissay = yanlis.nextInt();

        double eksidogru = yanlissay * 0.25;

        double net = dogrusay - eksidogru;

        System.out.println("Netiniz:" + net);

    }
}
