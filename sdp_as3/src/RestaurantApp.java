import java.util.ArrayList;
import java.util.List;

public class RestaurantApp {
    public static void main(String[] args) {
        // Modern Online Reservation System (Client)
        OnlineReservationSystem reservationSystem = new ReservationAdapter(new KitchenOrderSystem());

        // Simulating reservation and cancellation
        reservationSystem.makeReservation("John", 4, "2023-10-30");
        reservationSystem.cancelReservation("John", "2023-10-30");

        // Checking the kitchen system for order tickets
        KitchenOrderSystem kitchenSystem = new KitchenOrderSystem();
        System.out.println("Order Tickets in the Kitchen System:");
        for (String orderTicket : kitchenSystem.getOrderTickets()) {
            System.out.println(orderTicket);
        }
    }
}
