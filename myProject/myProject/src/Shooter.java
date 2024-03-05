public class Shooter extends Games {

    private int ageRate;

    public Shooter(String name, String studio, int year, int price, int metacriticrate, int ageRate) {
        super(name, studio, year, price, metacriticrate);
        this.ageRate = ageRate;
    }

    public String printInfo () {
        return("Name of the shooter: " + getName() + "\nStudio: " + getStudio() + "\nYear: " + getYear() + "\nPrice: " + getPrice() + "\nRate on Metacritic:" + getMetacriticrate() + "\nAge rate: " + this.ageRate + "\n \n");
    }

}
