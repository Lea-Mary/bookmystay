import java.util.*;

class BookingService {

    private RoomInventory inventory;
    private BookingRequestQueue requestQueue;

    // Track allocated rooms
    private Map<String, Set<String>> allocatedRooms;

    public BookingService(RoomInventory inventory, BookingRequestQueue requestQueue) {
        this.inventory = inventory;
        this.requestQueue = requestQueue;
        this.allocatedRooms = new HashMap<>();
    }

    public void processBookings() {

        System.out.println("\n===== Processing Bookings =====");

        Queue<Reservation> queue = requestQueue.getQueue();

        while (!queue.isEmpty()) {

            Reservation reservation = queue.poll(); // FIFO
            String roomType = reservation.getRoomType();

            int available = inventory.getAvailability(roomType);

            if (available > 0) {

                // Generate unique room ID
                String roomId = roomType + "-" + UUID.randomUUID().toString().substring(0, 5);

                // Store allocated room
                allocatedRooms.putIfAbsent(roomType, new HashSet<>());
                allocatedRooms.get(roomType).add(roomId);

                // Update inventory
                inventory.updateAvailability(roomType, available - 1);

                System.out.println("Booking CONFIRMED for " + reservation.getGuestName()
                        + " | Room: " + roomId);

            } else {
                System.out.println("Booking FAILED for " + reservation.getGuestName()
                        + " | No rooms available");
            }
        }
    }
}