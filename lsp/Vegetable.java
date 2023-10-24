package lsp;
import java.util.Date;

public class Vegetable extends FoodProduct{
    @Overide
    String getName(){
        return "Broccoli";
    }
    @Overide
    Date getExpiredDate(){
        return new Date();
    }
}