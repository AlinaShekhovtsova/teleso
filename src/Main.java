import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        ArrayList<Krychle> krychle = new ArrayList<>();
        ArrayList<Kuzel> kuzel = new ArrayList<>();
        ArrayList<Jehlan> jehlan = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Vyberte jednu z možností : Přídat těleso (1) / Vypsat všechna tělesa jednoho druhu (2) / Těleso s největším a nejmenším povrchem (3) / Počet jednotlivých druhů těles v poli (4) / Součet všech objemů těles (5) / Krychli, kužel a jehlan s největším povrchem (6)");
        int volba = sc.nextInt();
        switch (volba) {
            case 1:
                System.out.println("Zvol, které těleso si přeješ přidat : Krychle (1) / Kuzel (2) / Jehlan (3)");
                int teleso = sc.nextInt();
                sc.nextLine();
                switch (teleso) {

                    case 1:
                        System.out.println("Zadej hranu krychle");
                        double hrana = sc.nextDouble();
                        krychle.add(new Krychle(hrana));

                    case 2:
                        System.out.println("Zadej poloměr podstavy:");
                        double podstava = sc.nextDouble();
                        sc.nextLine();
                        System.out.println("Zadej vysku:");
                        double vysku = sc.nextDouble();
                        sc.nextLine();
                        System.out.println("Zadej polomer:");
                        double polomer = sc.nextDouble();
                        sc.nextLine();
                        System.out.println("Zadej vysku kuzele:");
                        double vyskaKuzele = sc.nextDouble();
                        sc.nextLine();
                        kuzel.add(new Kuzel(podstava, vysku, polomer, vyskaKuzele));


                    case 3:
                        System.out.println("Zadej hranu dolní podstavy: ");
                        double podstavaDP = sc.nextDouble();
                        sc.nextLine();
                        System.out.println("Zadej výšku jehlanu: ");
                        double vyskaJehlanu = sc.nextDouble();
                        sc.nextLine();
                        jehlan.add(new Jehlan(podstavaDP, vyskaJehlanu));

                }

            case 2:
                System.out.println("Zvol, které těleso si přeješ smazat : Krychle (1) / Kuzel (2) / Jehlan (3)");
                int smazat = sc.nextInt();
                sc.nextLine();
                switch (smazat) {
                    case 1:
                        System.out.println("Kterou krychle chceš smazat?(zadej index): ");
                        int indexKrychle = sc.nextInt();
                        sc.nextLine();
                        krychle.remove(indexKrychle);

                    case 2:
                        System.out.println("Kteri kuzel chceš smazat?(zadej index): ");
                        int indexKuzel = sc.nextInt();
                        sc.nextLine();
                        krychle.remove(indexKuzel);

                    case 3:
                        System.out.println("Kteri jehlan chceš smazat?(zadej index): ");
                        int indexJehlan = sc.nextInt();
                        sc.nextLine();
                        krychle.remove(indexJehlan);
                }
            case 3:
                System.out.println("Výpisy");
                System.out.println("1 - výpis všech těles /n" +
                        "2 - všechna tělesa jdnoho druhu /n" +
                        "3 - těleso s největším a nejmenším povrchem" +
                        "4 - počet jednotlivých druhů těles v poli" +
                        "5 - součet objemů všech těles" +
                        "6 - krzchli, kužel a jehlan s největším povrchem" );
                int vypis = sc.nextInt();
                sc.nextLine();
                if (vypis > 6) {
                    System.err.println("error");
                }
                else if (vypis < 1) {
                    System.err.println("error");
                }
                else{
                switch (vypis) {
                    case 1:
                        ;
                    case 2:
                        ;
                    case 3:
                        ;
                    case 4:
                        ;
                    case 5:
                        ;
                    case 6:
                        ;
                }
                }

        }


    }

}