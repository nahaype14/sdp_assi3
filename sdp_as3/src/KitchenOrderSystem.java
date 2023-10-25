import java.util.ArrayList;
import java.util.List;

// Adaptee
class KitchenOrderSystem {
    private List<String> orderTickets = new ArrayList<>();

    void addOrderTicket(String orderTicket) {
        orderTickets.add(orderTicket);
    }

    void removeOrderTicket(String orderTicket) {
        orderTickets.remove(orderTicket);
    }

    List<String> getOrderTickets() {
        return orderTickets;
    }
}
