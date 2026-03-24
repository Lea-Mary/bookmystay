public class UseCase2RoomInitialization {

    public static void main(String[] args) {

        // Create objects (Polymorphism)
        Room single = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suite = new SuiteRoom();

        // Static availability
        int singleAvailable = 5;
        int doubleAvailable = 3;
        int suiteAvailable = 2;

        System.out.println("===== Room Details & Availability =====\n");

        single.displayDetails();
        System.out.println("Available Rooms: " + singleAvailable);
        System.out.println("----------------------------------");

        doubleRoom.displayDetails();
        System.out.println("Available Rooms: " + doubleAvailable);
        System.out.println("----------------------------------");

        suite.displayDetails();
        System.out.println("Available Rooms: " + suiteAvailable);
    }
}