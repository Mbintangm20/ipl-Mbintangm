package openclose;

public class CinemaCalculations {
    public Double calculateAdminfee(Cinema cinema){
        if (Cinema instanceof StandardCinema){
            return ((StandardCinema) cinema).price*10/100;
        }
        else if (Cinema instanceof DeluxeCinema){
            return ((DeluxeCinema) cinema).price*12/100;
        }
        else if (Cinema instanceof PremiumCinema){
            return ((PremiumCinema) cinema).price*20/100;
        }
        else {
            return 0.0;
        }
    }
}   