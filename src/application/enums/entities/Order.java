package application.enums.entities;

import application.enums.enums.OrderStatus;

import java.time.LocalDate;

public record Order (Integer id,
                     LocalDate date,
                     OrderStatus orderStatus) {

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Order{");
        sb.append("id=").append(id);
        sb.append(", date=").append(date);
        sb.append(", orderStatus=").append(orderStatus);
        sb.append('}');
        return sb.toString();
    }
}
