public class UseCase6RoomAllocationService {

    public static void main(String[] args) {

        // Initialize inventory
        RoomInventory inventory = new RoomInventory();

        // Initialize queue
        BookingRequestQueue bookingQueue = new BookingRequestQueue();

        // Add requests
        bookingQueue.addRequest(new Reservation("Alice", "Single Room"));
        bookingQueue.addRequest(new Reservation("Bob", "Double Room"));
        bookingQueue.addRequest(new Reservation("Charlie", "Single Room"));
        bookingQueue.addRequest(new Reservation("David", "Suite Room"));

        // Process bookings
        BookingService bookingService = new BookingService(inventory, bookingQueue);
        bookingService.processBookings();
    }
}