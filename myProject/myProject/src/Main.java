import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Shooter stalker = new Shooter("STALKER", "GSC", 2007, 12, 87, 16);
        Shooter callofduty = new Shooter("CoD Modern Warfare", "Activision", 2007, 15, 90, 18);
        Simulator euroTruck = new Simulator("Euro Truck simulator 2", "SCS", 2012, 10, 79, "hard");
        Simulator forza = new Simulator("Forza Horizon 4", "Playground Games", 2018, 30, 86, "regular");
        Strategy rome = new Strategy("Rome Total war", "Creative Assembly", 2005, 10, 89, 8);
        Strategy starcraft = new Strategy("Starcraft 2", "Blizzard Entertainment", 2010, 10, 87, 7);
        ArrayList<Games> games = new ArrayList();

        Scanner scan = new Scanner(System.in);

        System.out.println("What genre of game do you want to buy?");
        System.out.println("Genres: shooter- press 1\n" +
                "simulator- press 2\n" +
                "strategy- press 3");
        int a = scan.nextInt();
        if (a == 1){
            stalker.printInfo();
            callofduty.printInfo();
            System.out.println("Choose shooter: \n" +
                    "1- STALKER\n" +
                    "2- CoD Modern Warfare");
            int b = scan.nextInt();
            if (b == 1){
                games.add(stalker);
            }
            if (b == 2){
                games.add(callofduty);
            }
        }

       else if (a == 2){
            euroTruck.printInfo();
            forza.printInfo();

            System.out.println("Choose simulator: \n" +
                    "1- Euro Truck Simulator 2\n" +
                    "2- Forza Horizon 4");
            int b = scan.nextInt();
            if (b == 1){
                games.add(euroTruck);
            }
            if (b == 2){
                games.add(forza);
            }
        }

       else if (a == 3){
            rome.printInfo();
            starcraft.printInfo();

            System.out.println("Choose strategy: \n" +
                    "1- Rome Total War\n" +
                    "2- Starcraft 2");
            int b = scan.nextInt();
            if (b == 1){
                games.add(rome);
            }
            if (b == 2){
                games.add(starcraft);
            }
        }
       else {
            System.out.println("Incorrect answer, try again");
        }

        String str = "";
        for (Games i : games
        ) {
            str = str + i.printInfo();
        }
        System.out.println(str);
        str = "";
        for (Games i : games
        ) {
            i.writeFile();
        }
    }
}