package pl.chmielewski.obserwator.notification;

import pl.chmielewski.obserwator.order.Order;

public interface Observer {

    void update(Order order);
}
