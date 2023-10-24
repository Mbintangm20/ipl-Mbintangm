package lsp;
import java.util.Date;

public class Vegetable extends Product{
    @Overide
    String getName(){
        return "Broccoli";
    }
    @Overide
    Date getExpiredDate(){
        return new Date();
    }
}