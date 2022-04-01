package lab.demand;

public class Tax {
    
    public double calculateTax(String country) {
/*      if (country.equals("PE")) {
            return 0.18;
        } else if (country.equals("BR")) {
            return 0.12;
        } else {
            return 0.0;
        }*/

        return (country.equals("PE"))? 0.18: (country.equals("BR"))? 0.12 : 0.0;
    }

    public double calculateTaxByCountry()



}
