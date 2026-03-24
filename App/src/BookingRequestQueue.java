import java.util.LinkedList;
import java.util.Queue;

class BookingRequestQueue {

    private Queue<Reservation> queue;

    public BookingRequestQueue() {
        queue = new LinkedList<>();
    }

    // Add request
    public void addRequest(Reservation reservation) {
        queue.add(reservation);
        System.out.println("Request added for " + reservation.getGuestName());
    }

    // View all requests
    public void displayRequests() {
        System.out.println("\n===== Booking Requests Queue =====");

        for (Reservation r : queue) {
            System.out.println(r.getGuestName() + " → " + r.getRoomType());
        }
    }
}