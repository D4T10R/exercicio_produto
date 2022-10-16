package entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {
    
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    // ATRIBUTOS
    private Date manufactureDate;
    // ATRIBUTOS

    // CONSTRUTORES
    public UsedProduct(){
    }
    
    public UsedProduct(String name, Double price, Date date) throws ParseException {
        super(name, price);
        this.manufactureDate = date;
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
    public String priceTag() {
        return getName() + "(used) $" + getPrice() + " (manufacture date: " + sdf.format(manufactureDate) + ")";
    }
    // METODOS
    

}
