package openclose;

public class Main {
    public static void main(String[] args){
        StandardCinema standardCinema = new StandardCinema(price:100);
        Double adminfee = standardCinema.calculateAdminfee();
        System.out.println(adminfee);
    }
}