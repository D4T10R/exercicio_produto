package entities;

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
    public String priceTag(Product prod) {
        ImportProduct imp_prod = (ImportProduct)prod;
        return imp_prod.getName() + " $" + imp_prod.totalPrice(imp_prod);
    }

    public Double totalPrice(ImportProduct prod) {
        return prod.getPrice() + prod.getCustomsFee();
    }
    // METODOS
    
    
    
}
