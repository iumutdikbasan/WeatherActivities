import java.util.Scanner;

public class main {
    public static void main(String[] args){
        int heat;

        Scanner input = new Scanner(System.in);
        System.out.println("Sicaklik Giriniz : ");
        heat = input.nextInt();

        if (heat<5) {
            System.out.println("Kayak yap...");
        }
        else if (heat<15) {
            System.out.println("Sinemaya git");
        }
        else if (heat<25) {
            System.out.println("Piknik yap");
        }
        else System.out.println("Yuzmeye git");
    }
    }

