public class Simulator extends Games{
    private String realism;
    public Simulator (String name, String studio, int year, int price, int metacriticrate, String realism){
        super(name, studio, year, price, metacriticrate);
        this.realism = realism;
    }
    public String printInfo() {
        return("Name of the Simulator: " + getName() + "\nStudio: " + getStudio() + "\nYear: " + getYear() + "\nPrice: " + getPrice() + "\nRate on Metacritic:" + getMetacriticrate() + "\nAge rate: " + this.realism + "\n \n");
    }
}
