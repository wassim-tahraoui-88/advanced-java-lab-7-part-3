package tn.horizonprod.gestionmagasin;

public class Main {

    public static void main() {
        Store store1 = new Store(0, "Carrefour","City Center");
		Store store2 = new Store(1, "Monoprix","Menzah 6");

		Cashier cashier11 = new Cashier(0, "Ali", "Ariana", 130, 1);
		Cashier cashier12 = new Cashier(1, "Ahmed", "Menzah 4", 120, 2);
		Salesperson salesperson1 = new Salesperson(2, "Mohamed", "Menzah 6", 160,10);
		Manager manager1 = new Manager(3, "Sami", "Lac 2", 180, 1000);

		Cashier cashier21 = new Cashier(4, "Amir", "Sousse", 110, 4);
		Salesperson salesperson21 = new Salesperson(5, "Houssem", "Sfax", 100, 12);
		Salesperson salesperson22 = new Salesperson(6, "Sarra", "Sfax", 95, 11);
		Salesperson salesperson23 = new Salesperson(7, "Selim", "Sousse", 105, 10);
		Manager manager2 = new Manager(8, "Mohammed", "Sousse", 180, 1000);

		store1.addEmployee(cashier11);
		store1.addEmployee(cashier12);
		store1.addEmployee(salesperson1);
		store1.addEmployee(manager1);

		store2.addEmployee(cashier21);
		store2.addEmployee(salesperson21);
		store2.addEmployee(salesperson22);
		store2.addEmployee(salesperson23);
		store2.addEmployee(manager2);

		store1.displayEmployee();
		store2.displayEmployee();

	    var p1 = new FruitProduct(1, "Fruit", "Apple",12,53,4);
	    var p2 = new FruitProduct(2, "Fruit", "Banana",42,42,2);
	    var p3 = new FruitProduct(3, "Fruit", "Orange",16,16,5);
	    var p4 = new VegetableProduct(4, "Vegetable", "Carrot",50,50,1);
	    var p5 = new VegetableProduct(5, "Vegetable", "Potato",32,32,5);
	    var p6 = new VegetableProduct(6, "Vegetable", "Tomato",78,78,12);

	    store1.addProduct(p1);
	    store1.addProduct(p2);
	    store1.addProduct(p3);
	    store1.addProduct(p4);
	    store1.addProduct(p5);
	    store1.addProduct(p6);

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
