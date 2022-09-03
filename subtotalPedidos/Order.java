import java.util.Date;
import java.util.List;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Order {
    private Date moment;
    private OrderStatus status;
    private Client client;
    private List <OrderItem> items = new ArrayList<>();
    SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy"); 

    public Order(){
    }

    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }
    public Date getMoment() {
        return moment;
    }
    public void setMoment(Date moment) {
        this.moment = moment;
    }
    public OrderStatus getStatus() {
        return status;
    }
    public void setStatus(OrderStatus status) {
        this.status = status;
    }
    public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;
    }
    public void addItem(OrderItem item){
        items.add(item);
    }
    public void removeItem(OrderItem item){
        items.remove(item);
    }

    public double total(){
        double sum = 0;
        for(OrderItem item : items) {
            sum += item.subTotal();
        }
        return sum;
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order sumary:\n");
        sb.append("Order moment: " + date.format(moment) + "\n");
        sb.append("Order Status: " + status + "\n");
        sb.append("Client: " + client + "\n");
        sb.append("Order items: ");
        for(OrderItem item: items) {
            sb.append(item.toString() + "\n");
        } 
        sb.append("\nTotal price: R$" + total());
        return sb.toString();
    } 
}
