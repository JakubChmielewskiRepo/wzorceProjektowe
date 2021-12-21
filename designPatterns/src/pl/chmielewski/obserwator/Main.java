package pl.chmielewski.obserwator;

import pl.chmielewski.obserwator.notification.Email;
import pl.chmielewski.obserwator.notification.MobileApp;
import pl.chmielewski.obserwator.notification.TextMessage;
import pl.chmielewski.obserwator.order.Order;
import pl.chmielewski.obserwator.order.OrderStatus;

public class Main {

    public static void main(String[] args) {
        Order order=new Order(110L, OrderStatus.ZAREJESTROWANE);
        TextMessage textMessage=new TextMessage();
        Email email=new Email();
        MobileApp mobileApp=new MobileApp();

        order.registerObserver(textMessage);
        order.registerObserver(mobileApp);
        order.registerObserver(email);

        order.notifyObservers();
        System.out.println("-------------------------------------------------------------------");
        order.changeOrderStatus(OrderStatus.WYSLANE);
        order.unregisterObserver(email);
        System.out.println("-------------------------------------------------------------------");
        order.changeOrderStatus(OrderStatus.ODEBRANE);
    }
}
