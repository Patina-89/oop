import java.io.FileWriter;
import java.io.IOException;

public class Games {

    private String name;
    private String studio;
    private int year;
    private int price;
    private int metacriticrate;

    public Games(String name, String studio, int year, int price, int metacriticrate){
        this.name = name;
        this.studio = studio;
        this.year = year;
        this.price = price;
        this.metacriticrate = metacriticrate;
    }

    public String printInfo () {
        return("Name of the shooter: " + getName() + "\nStudio: " + getStudio() + "\nYear: " + getYear() + "\nPrice: " + getPrice() + "\nRate on Metacritic:" + getMetacriticrate() + "\n \n");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getMetacriticrate() {
        return metacriticrate;
    }

    public void setMetacriticrate(int metacriticrate) {
        this.metacriticrate = metacriticrate;
    }
    public void writeFile() {
        try {
            FileWriter fw = new FileWriter("games.txt", true);
            String str = printInfo();
            fw.write(str);
            fw.close();
        } catch (IOException var3) {
            throw new RuntimeException(var3);
        }
    }
}
