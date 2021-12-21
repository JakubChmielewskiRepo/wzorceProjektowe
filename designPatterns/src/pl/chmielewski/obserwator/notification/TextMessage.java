package pl.chmielewski.obserwator.notification;

import pl.chmielewski.obserwator.order.Order;

public class TextMessage implements Observer{
    public void update(Order order){
        System.out.println("SMS- Zamówienie numer: " + order.getOrderNumber() + " zmieniło status na: " + order.getOrderStatus());
    }
}
