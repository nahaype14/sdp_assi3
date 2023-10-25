// Client Interface
interface OnlineReservationSystem {
    void makeReservation(String customerName, int numPeople, String date);

    void cancelReservation(String customerName, String date);
}
