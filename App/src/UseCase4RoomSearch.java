public class UseCase4RoomSearch {

    public static void main(String[] args) {

        // Initialize inventory
        RoomInventory inventory = new RoomInventory();

        // Create search service
        RoomSearchService searchService = new RoomSearchService(inventory);

        // Perform search (READ-ONLY)
        searchService.searchAvailableRooms();
    }
}