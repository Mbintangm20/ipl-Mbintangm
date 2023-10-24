package openclose;

public class StandardCinema extends Cinema {
    public StandardCinema(double price){
        this.price = price;
    }
    @Overide
    Double calculateAdminfee(){
        return this.price * 10/100;
    }
}