package lab_5_part_2;

public class Main {
	public static void main() {
		var store = new Store("Monoprix");

		var p1 = new FruitProduct(1, "Fruit", "Apple", 53,4);
		var p2 = new FruitProduct(2, "Fruit", "Banana",42,2);
		var p3 = new FruitProduct(3, "Fruit", "Orange",16,5);
		var p4 = new VegetableProduct(4, "Vegetable", "Carrot", 50,1);
		var p5 = new VegetableProduct(5, "Vegetable", "Potato", 32,5);
		var p6 = new VegetableProduct(6, "Vegetable", "Tomato", 78,12);

		store.addProduct(p1);
		store.addProduct(p2);
		store.addProduct(p3);
		store.addProduct(p4);
		store.addProduct(p5);
		store.addProduct(p6);

		var currentSeason = 12; // change to any value between 1 and 12
		System.out.println("Product 1 is fresh: " + p1.isFresh(currentSeason));
		System.out.println("Product 2 is fresh: " + p2.isFresh(currentSeason));
		System.out.println("Product 3 is fresh: " + p3.isFresh(currentSeason));
		System.out.println("Product 4 is fresh: " + p4.isFresh(currentSeason));
		System.out.println("Product 5 is fresh: " + p5.isFresh(currentSeason));
		System.out.println("Product 6 is fresh: " + p6.isFresh(currentSeason));

		System.out.println("Total number of fruit products in " + store.getName() + " is: " + store.calculateStock());

		store.printProductTypes();
	}
}
