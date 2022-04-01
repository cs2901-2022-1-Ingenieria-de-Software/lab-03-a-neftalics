package lab.demand;

import java.util.List;

public class ManageDemand {

    private Tax tax;

    public ManageDemand(Tax tax) {
        this.tax = tax;
    }

    public double calculateTotal(List<Order> orders){
        //calculates taxes and quatities
        double quantities = 0.0;
        double taxes = 0.0;
        for (Order order : orders) {
            taxes += this.tax.calculateTax(order.getCountry());
            quantities += order.getQuantity();
        }
        return quantities * taxes;
    }

    public double calculateTotalForWithAdditionalByCountry(List<Order> orders, double defaultAdditionalColombia, double defaultAdditionalPeru, double defaultAdditionalBrazil){
        // Calculate additionals by country
        double taxes = 0.0;
        double quantities = 0.0;
        for (Order order : orders) {
            taxes+= Tax.calculateTaxByCountry(order,defaultAdditionalColombia,defaultAdditionalPeru,defaultAdditionalBrazil);
            quantities +=order.getQuantity();
        }
        return quantities * taxes;
    }

}
