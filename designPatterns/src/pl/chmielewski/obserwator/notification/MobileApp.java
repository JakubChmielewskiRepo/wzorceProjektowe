package pl.chmielewski.obserwator.notification;

import pl.chmielewski.obserwator.order.Order;

public class MobileApp implements Observer {

    public void update(Order order){
        System.out.println("Aplikacja mobilna - Zamówienie numer: " + order.getOrderNumber() + " zmieniło status na: " + order.getOrderStatus());
    }
}
