package tn.horizonprod.gestionmagasin;

import tn.horizonprod.gestionmagasin.exceptions.FullStoreException;
import tn.horizonprod.gestionmagasin.exceptions.NegativePriceException;

public class Main {

    public static void main() {
        Store store1 = new Store(0, "Carrefour","City Center");
		Store store2 = new Store(1, "Monoprix","Menzah 6");


	    var p1 = new FruitProduct(1,"Fruit","Apple",12,53,4);
	    var p2 = new FruitProduct(2,"Fruit","Banana",42,42,2);
	    var p3 = new FruitProduct(3,"Fruit","Orange",16,16,5);
	    var p4 = new VegetableProduct(4,"Vegetable","Carrot",50,50,1);
	    var p5 = new VegetableProduct(5,"Vegetable","Potato",32,32,5);
	    var p6 = new VegetableProduct(6,"Vegetable","Tomato",78,78,12);

		try {
	        store1.addProduct(p1);
			store1.addProduct(p2);
			store1.addProduct(p3);
			store1.addProduct(p4);
			store1.addProduct(p5);
			store1.addProduct(p6);
		}
		catch (FullStoreException e) {
			System.out.println(e.getMessage());
		}
		catch (NegativePriceException e) {
			System.out.println("The price of the product cannot be negative.");
			System.out.println(e.getMessage());
		}

	    store1.displayProducts();
	    store1.removeProduct(p1);
		store1.displayProducts();

	    var currentSeason = 12; // change to any value between 1 and 12
	    System.out.println("Product 1 is fresh: " + p1.isFresh(currentSeason));
	    System.out.println("Product 2 is fresh: " + p2.isFresh(currentSeason));
	    System.out.println("Product 3 is fresh: " + p3.isFresh(currentSeason));
	    System.out.println("Product 4 is fresh: " + p4.isFresh(currentSeason));
	    System.out.println("Product 5 is fresh: " + p5.isFresh(currentSeason));
	    System.out.println("Product 6 is fresh: " + p6.isFresh(currentSeason));

	    System.out.println("Total number of fruit products in " + store1.getName() + " is: " + store2.calculateStock());

	    store2.printProductTypes();
    }
}
