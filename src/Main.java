import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int n1, n2, select;

        System.out.print("İlk sayı: ");
        n1 = input.nextInt();
        System.out.print("İkinci sayı: ");
        n2 = input.nextInt();

        System.out.print("1- Toplama, 2- Çıkarma, 3- Çarpma, 4- Bölme işlemidir.\n Seçiminizi yapınız..: ");
        select = input.nextInt();

        switch (select){
            case 1:
                System.out.println("Toplam: "+ (n1 + n2));
                break;
            case 2:
                System.out.println("Çıkarma: "+ (n1 - n2));
                break;
            case 3:
                System.out.println("Çarpma: "+ (n1 * n2));
                break;
            case 4:
                if(n2 != 0){
                    System.out.println("Bölme: "+ (n1 / n2));
                }else{
                    System.out.println("Belirsiz.");
                }
                break;
            default:
                System.out.println("Geçersiz bir seçim yaptınız.");
        }

    }
}