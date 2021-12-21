package pl.chmielewski.obserwator.notification;

import pl.chmielewski.obserwator.order.Order;

public class Email implements Observer {

    public void update(Order order){
        System.out.println("E-mail - Zamówienie numer: " + order.getOrderNumber() + " zmieniło status na: " + order.getOrderStatus());
    }
}
