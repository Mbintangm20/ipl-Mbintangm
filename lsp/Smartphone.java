package lsp;
import java.sql.Date;

public class Smartphone extends Product {
    @Overide
    String getName(){
        return "Samsung S22 Ultra";
    }
    @Overide
    Date getExpiredDate(){
        return new Date(0);
    }
}