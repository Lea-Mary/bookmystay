public class UseCase7AddOnServiceSelection {

    public static void main(String[] args) {

        // Simulated reservation IDs (from UC6)
        String reservation1 = "SingleRoom-12345";
        String reservation2 = "DoubleRoom-67890";

        // Initialize service manager
        AddOnServiceManager manager = new AddOnServiceManager();

        // Create services
        AddOnService breakfast = new AddOnService("Breakfast", 200);
        AddOnService wifi = new AddOnService("WiFi", 100);
        AddOnService spa = new AddOnService("Spa", 500);

        // Add services to reservations
        manager.addService(reservation1, breakfast);
        manager.addService(reservation1, wifi);
        manager.addService(reservation2, spa);

        // Display services
        manager.displayServices(reservation1);
        manager.displayServices(reservation2);

        // Calculate total cost
        System.out.println("\nTotal Add-On Cost for " + reservation1 + " : ₹"
                + manager.calculateTotalCost(reservation1));

        System.out.println("Total Add-On Cost for " + reservation2 + " : ₹"
                + manager.calculateTotalCost(reservation2));
    }
}