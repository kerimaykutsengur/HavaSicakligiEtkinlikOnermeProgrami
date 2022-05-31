import java.util.Scanner;

public class HavaSicakligiEtkinlikOnermeProgrami {
    public static void main(String[] args) {
        int heat;

        Scanner input = new Scanner(System.in);
        System.out.print("Sýcaklýðý Giriniz:");
        heat = input.nextInt();

        if (heat < 5){
            System.out.print("Kayak yapabilirsiniz...");
        }else if (heat >=5 && heat <=25){
            if (heat <= 15){
                System.out.println("Sinemaya Gidebilirsiniz...");
            }
            if (heat >=10){
                System.out.println("Pikniðe Gidebilirsiniz...");
            } else {
                System.out.println("Yüzmeye Gidebilirsiniz...");
            }

        }


    }
}
