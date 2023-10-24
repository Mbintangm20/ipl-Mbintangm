package openclose;

public class PremiumCinema extends Cinema {
    public PremiumCinema(double price){
        this.price = price;
    }
    @Overide
    Double calculateAdminfee(){
        return this.price * 12/100;
    }
}