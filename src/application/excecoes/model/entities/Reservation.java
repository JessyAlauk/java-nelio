package application.excecoes.model.entities;

import application.excecoes.model.exceptions.DomainException;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Reservation {

    private Integer roomNumber;
    private LocalDate checkin;
    private LocalDate checkout;

    private static DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Reservation(Integer roomNumber, LocalDate checkin, LocalDate checkout) throws DomainException {
        if (!checkout.isAfter(checkin)){
            throw new DomainException("Checkout date must be after checkin date");
        }
        this.roomNumber = roomNumber;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public Reservation() {
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public LocalDate getCheckin() {
        return checkin;
    }

    public LocalDate getCheckout() {
        return checkout;
    }

    public long duration() {
        return ChronoUnit.DAYS.between(checkin, checkout);
    }

    public void updateDates(LocalDate checkin, LocalDate checkout) throws DomainException {
        if (checkin.isBefore(LocalDate.now()) || checkout.isBefore(LocalDate.now())){
            throw new DomainException("Reservation datesw for update must be future dates");
        }
        else if (!checkout.isAfter(checkin)){
            throw new DomainException("Checkout date must be after checkin date");
        }
        this.checkin = checkin;
        this.checkout = checkout;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Reservation{");
        sb.append("roomNumber=").append(roomNumber);
        sb.append(", checkin=").append(checkin.format(dateTimeFormatter));
        sb.append(", checkout=").append(checkout.format(dateTimeFormatter));
        sb.append('}');
        return sb.toString();
    }
}
