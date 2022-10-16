package entities;

import java.util.jar.Attributes.Name;

public class ImportProduct extends Product {

    // ATRIBUTOS
    private Double customsFee;
    // ATRIBUTOS

    // CONSTRUTORES
    public ImportProduct() {
    }

    public ImportProduct(Double customsFee) {
        this.customsFee = customsFee;
    }

    public ImportProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }
    // CONSTRUTORES

    // ENCAPSULAMENTO
    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }
    // ENCAPSULAMENTO

    // METODOS 
    public String priceTag() {
        return this.getName() + " $" + totalPrice(this.getPrice(), customsFee) + "(Customs fee: $" + customsFee;
    }

    public Double totalPrice(Double price, Double customsFee) {
        return price + customsFee;
    }
    // METODOS
    
    
    
}
