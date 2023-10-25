// Adapter Class
class ReservationAdapter implements OnlineReservationSystem {
    private KitchenOrderSystem kitchenSystem;

    ReservationAdapter(KitchenOrderSystem kitchenSystem) {
        this.kitchenSystem = kitchenSystem;
    }

    @Override
    public void makeReservation(String customerName, int numPeople, String date) {
        String reservationDetails = customerName + " - " + numPeople + " people on " + date;
        String orderTicket = convertReservationToTicket(reservationDetails);
        kitchenSystem.addOrderTicket(orderTicket);
        System.out.println("Reservation made: " + reservationDetails);
    }

    @Override
    public void cancelReservation(String customerName, String date) {
        String reservationDetails = customerName + " - " + date;
        String orderTicket = convertReservationToTicket(reservationDetails);
        kitchenSystem.removeOrderTicket(orderTicket);
        System.out.println("Reservation canceled: " + reservationDetails);
    }

    private String convertReservationToTicket(String reservationDetails) {
        // Logic to convert a reservation to a physical order ticket
        return "Order Ticket: " + reservationDetails;
    }
}
