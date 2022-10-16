package principal;

import java.util.Scanner;

import entities.ImportProduct;
import entities.Product;
import entities.UsedProduct;

import java.util.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Programa {

    public static void main(String[] args) throws ParseException {
        
        Scanner sc = new Scanner(System.in);
        List<Product> product = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter the number of products: ");
        int quant = sc.nextInt();
        

        for (int i = 0; i < quant; i++) {

            System.out.println("\nProduct #" + (i+1) + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char tipo = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Price: ");
            Double price = sc.nextDouble();
            
            if (tipo == 'c') {
                product.add(new Product(name, price));
            } 
            else if (tipo == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date manufacture = sdf.parse(sc.next());
                product.add(new UsedProduct(name, price, manufacture));
            }
            else if (tipo == 'i') {
                System.out.print("Customs fee: ");
                Double customFee = sc.nextDouble();

                product.add(new ImportProduct(name, price, customFee));
            }

        }

        System.out.println("\nPRICE TAGS: ");
        for (Product prod : product) {
            System.out.println(prod.priceTag());
        }


    }


    // D4T10R
}