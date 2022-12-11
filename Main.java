import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Phone infinixPhone = new Infinix();

        PhoneUser denver = new PhoneUser(infinixPhone);

        denver.turnOnThePHone();

        Scanner input = new Scanner(System.in);
        String aksi;

        while (true) {
            System.out.println("=== APLIKASI INTERFACE ===");
            System.out.println("[1] Turn on the Phone");
            System.out.println("[2] Shutting down the Phone");
            System.out.println("[3] Volume Up");
            System.out.println("[4] Volume Down");
            System.out.println("[0] Exit");
            System.out.println("===========================");
            System.out.println("Choose action>");
            aksi = input.nextLine();

            if (aksi.equalsIgnoreCase("1")) {
                denver.turnOnThePHone();
            } else if (aksi.equalsIgnoreCase("2")) {
                denver.turnOffThePHone();
            } else if (aksi.equalsIgnoreCase("3")) {
                denver.makePhoneLouder();
            } else if (aksi.equalsIgnoreCase("4")) {
                denver.makePhoneSilent();
            } else if (aksi.equalsIgnoreCase("0")) {
                System.exit(0);
            } else {
                System.out.println("You Choose The Wrong Action!");
            }
        }
    }
}