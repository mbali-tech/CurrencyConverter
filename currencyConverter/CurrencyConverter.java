import java.util.HashMap;
import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {
        // group and store the currency codes
        HashMap <String, Double> currencyCodes = new HashMap<>();
        //Add currency
        currencyCodes.put("USD", 1.0);
        currencyCodes.put("EUR", 0.85);
        currencyCodes.put("ZAR", 0.73);
        currencyCodes.put("CHF", 1.53);

        // Add user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount");
         double amount = sc.nextDouble();
         

        //prompt user to enter currency code
        System.out.print("Enter currency code: ");
        String initialCurrency = sc.next();

        //prompt user to enter the intended currency convertion
        System.out.print("Enter currency code to convert to: ");
        String convertionCurrency = sc.next();

        // convert the exchange rate
        double initialRate     = currencyCodes.get(initialCurrency);
        double convertionRate  = currencyCodes.get(convertionCurrency);
        double convertedAmount = (convertionRate/initialRate) * amount;

        System.out.println(convertedAmount);
    
      }    
    }