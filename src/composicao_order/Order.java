package composicao_order;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	private Date moment;
	private OrderStatus orderStatus;
	
	private List<OrderItem> orderItems = new ArrayList<>();
	private Client client;
	

	public Order(Date moment, OrderStatus orderStatus, Client client) {
		this.moment = moment;
		this.orderStatus = orderStatus;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}

	public List<OrderItem> getOrderItems() {
		return orderItems;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	public void addItem (OrderItem item) {
		orderItems.add(item);
	}
	
	public void removeItem (OrderItem item) {
		orderItems.remove(item);
	}
	
	public Double total() {
		double sum = 0;
		for (OrderItem item : orderItems) {
		sum += item.subTotal();
		}
		return sum;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ORDER SUMMARY: \n");
		sb.append("Order moment: ");
		sb.append(sdf.format(moment) + "\n");
		sb.append("Order status: " + orderStatus + "\n");
		sb.append("Client: " + client + "\n");
		sb.append("Order itens: \n");
		for (OrderItem item : orderItems) {
			sb.append(item + "\n");
		}
		System.out.println("Total price: $" + total());
		return sb.toString();
	}
}
