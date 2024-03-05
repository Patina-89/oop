public class Strategy extends Games{
    private int difficulty;
    public Strategy (String name, String studio, int year, int price, int metacriticrate, int difficulty){
        super(name, studio, year, price, metacriticrate);
        this.difficulty = difficulty;
    }
    public String printInfo() {
        return("Name of the strategy: " + getName() + "\nStudio: " + getStudio() + "\nYear: " + getYear() + "\nPrice: " + getPrice() + "\nRate on Metacritic:" + getMetacriticrate() + "\nAge rate: " + this.difficulty + "\n \n");
    }
}
