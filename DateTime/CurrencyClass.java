import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.*;

//package DateTime;

public class CurrencyClass {
    public static void main(String[] args){
        Currency usd = Currency.getInstance("USD");
        NumberFormat frm = NumberFormat.getCurrencyInstance(Locale.US);

        String formattedVal = frm.format(108.5);


        System.out.println(formattedVal);


        double price = 2000.5;
        Locale local = new Locale("en", "US");
        NumberFormat frmt = NumberFormat.getCurrencyInstance(local);
        String formattedVall = frmt.format(price);
        System.out.println(formattedVall);

        DecimalFormat decimalFormatter = new DecimalFormat("#, ##0.00");
        decimalFormatter.setPositivePrefix("$");
        String resVAl = decimalFormatter.format(price);

        System.out.println("custom format " + resVAl);
    
        Currency cur = Currency.getInstance("USD");
        String symbol = cur.getSymbol();
        String code = cur.getCurrencyCode();

        System.out.println(symbol);
        System.out.println(code);
    }
}
