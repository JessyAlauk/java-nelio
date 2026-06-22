package application.enums.application;

import application.enums.entities.Order;
import application.enums.enums.OrderStatus;

import java.time.LocalDate;

public class Program {
    static void main() {
        var order = new Order(1000,
                LocalDate.now(),
                OrderStatus.PENDING_PAYMENT);

        System.out.println(order);

        var os1 = OrderStatus.PROCESSING;

        var os2 = OrderStatus.DELIVERED.name();

        System.out.println(os1);

        System.out.println(os2);

        System.out.println(OrderStatus.PENDING_PAYMENT.getValue());
    }
}
