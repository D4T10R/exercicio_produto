package entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {
    
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    // ATRIBUTOS
    private Date manufactureDate = new Date();
    // ATRIBUTOS

    // CONSTRUTORES
    public UsedProduct(){
    }
    
    public UsedProduct(String name, Double price, String date) throws ParseException {
        super(name, price);
        this.manufactureDate = sdf.parse(date);
    }
    // CONSTRUTORES

    // ENCAPSULAMENTO
    public Date getManufactureDate() {
        return manufactureDate;
    }
    
    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }
    // ENCAPSULAMENTO
    
    // METODOS
    @Override
    public String priceTag(Product prod) {
        UsedProduct prod2 = (UsedProduct)prod;
        return prod2.getName() + " $" + prod2.getPrice() + " (manufacture date: " + sdf.format(manufactureDate) + ")";
    }
    // METODOS
    

}
