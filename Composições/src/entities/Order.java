package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import enumerated.entities.OrderStatus;

public class Order {

    // Formato da data utilizado para formatar a data e hora do momento do pedido
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date moment; // Momento do pedido
    private OrderStatus status; // Status do pedido
    private Client client; // Cliente associado ao pedido
    private List<OrderItem> items = new ArrayList<>(); // Lista de itens do pedido

    public Order() {
    }

    /**
     * Construtor com parâmetros.
     * 
     * @param moment Momento do pedido
     * @param status Status do pedido
     * @param client Cliente associado ao pedido
     */
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

    /**
     * Retorna a lista de itens do pedido.
     * 
     * A classe OrderItem representa os itens individuais do pedido.
     * Essa lista é usada para armazenar e gerenciar os itens associados a este pedido.
     * Permite adicionar, remover e acessar os itens do pedido.
     * Estabelece uma associação entre a classe Order (pedido) e a classe OrderItem (itens do pedido).
     * 
     * @return A lista de itens do pedido
     */
    public List<OrderItem> getItems() {
        return items;
    }

    /**
     * Define a lista de itens do pedido.
     * 
     * A classe OrderItem representa os itens individuais do pedido.
     * Essa lista é usada para armazenar e gerenciar os itens associados a este pedido.
     * Permite adicionar, remover e acessar os itens do pedido.
     * Estabelece uma associação entre a classe Order (pedido) e a classe OrderItem (itens do pedido).
     * 
     * @param items A lista de itens a ser definida para o pedido
     */
    public void setItems(List<OrderItem> items) {
        this.items = items;
    }

    /**
     * Adiciona um item ao pedido.
     * 
     * @param orderItem O item a ser adicionado ao pedido
     */
    public void addItem(OrderItem orderItem) {
        items.add(orderItem);
    }

    /**
     * Remove um item do pedido.
     * 
     * @param itemsToRemove A lista de itens a serem removidos do pedido
     */
    public void removeItem(List<OrderItem> itemsToRemove) {
        items.remove(itemsToRemove);
    }

    /**
     * Calcula o valor total do pedido.
     * 
     * @return O valor total do pedido
     */
    public double total() {
        double total = 0.0;
        for (OrderItem item : items) {
            total += item.subTotal();
        }
        return total;
    }
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: ");
		sb.append(sdf.format(moment) + "\n");
		sb.append("Order status: ");
		sb.append(status + "\n");
		sb.append("Client: ");
		sb.append(getClient());
		sb.append("Order items:\n");
		for (OrderItem item : items) {
			sb.append(item.getPrice() + item.getQuantity() + "\n");
		}
		sb.append("Total price: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();

	}

	// IMPORTANTE: SEMPRE GERAR UM TOSTRING PARA FORMATAR CLASSES E SUBCLASSES COM
	// INFROMAÇÕES QUE SERÃO PASSADAS PARA O CONSOLE/COMPILADOR

}
