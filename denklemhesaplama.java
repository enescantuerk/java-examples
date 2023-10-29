import java.util.Scanner;
// y=k.x+a denklemini kullanıcıya göre hesapla
public class ornek9 {
    public static void main(String[] args){
        System.out.println("y=k.x+a denklemini hesapla");
        Scanner xsayisi = new Scanner(System.in);
        System.out.println("Lütfen x değerini girin:");

        int x = xsayisi.nextInt();

        if(x<0){
            int ilkdeger = x*3;
            System.out.println(ilkdeger);
        }else if(x<=5){
            int ikincideger = x*-2;
            System.out.println(ikincideger + 20);
        }else{
            int ucuncudeger = x*2;
            System.out.println(ucuncudeger + -30);
        }



    }
}