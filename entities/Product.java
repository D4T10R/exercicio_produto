package entities;

public class Product {
    
    // ATRIBUTOS
    private String name; 
    private Double price;
    // ATRIBUTOS
    

    // CONSTRUTORES
    public Product() {
    }

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }
    // CONSTRUTORES

    // ENCAPSULAMENTO
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    // ENCAPSULAMENTOS

    // METODOS
    public String priceTag(Product prod) {
        return prod.getName() + " $" + prod.getPrice(); 
    }  
    // METODOS  


}
