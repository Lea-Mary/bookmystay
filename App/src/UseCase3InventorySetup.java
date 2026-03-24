public class UseCase3InventorySetup {

    public static void main(String[] args) {

        // Initialize inventory
        RoomInventory inventory = new RoomInventory();

        // Display initial inventory
        inventory.displayInventory();

        System.out.println("\nUpdating inventory...\n");

        // Update availability
        inventory.updateAvailability("Single Room", 4);
        inventory.updateAvailability("Double Room", 2);

        // Display updated inventory
        inventory.displayInventory();
    }
}