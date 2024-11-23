package tn.horizonprod.gestionmagasin;

public class Main {

    public static void main(String[] args) {
        Product p1 = new Product(1021, "Milk", "Delight");
        Product p2 = new Product(25100, "Yogurt", "Vitalait");
        Product p3 = new Product(3250, "Tomato", "Sicam", 1.2);
        p1.setPrice(0.7);
        p2.setPrice(0.85);

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
		store1.addProduct(p1);
		store1.addProduct(p2);

		store2.addEmployee(cashier21);
		store2.addEmployee(salesperson21);
		store2.addEmployee(salesperson22);
		store2.addEmployee(salesperson23);
		store2.addEmployee(manager2);
		store2.addProduct(p3);
    }
}
