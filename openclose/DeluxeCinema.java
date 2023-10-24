package openclose;

public class DeluxeCinema extends Cinema {
    public DeluxeCinema(double price){
        this.price = price;
    }
    @Overide
    Double calculateAdminfee(){
        return this.price * 20/100;
    }
}