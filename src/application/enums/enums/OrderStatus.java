package application.enums.enums;

public enum OrderStatus {

    PENDING_PAYMENT("pending"),
    PROCESSING("processing"),
    SHIPPED("shipped"),
    DELIVERED("delivered");

    private final String value;

    OrderStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
