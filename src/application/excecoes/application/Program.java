package application.excecoes.application;

import application.excecoes.model.entities.Reservation;
import application.excecoes.model.exceptions.DomainException;

import java.time.LocalDate;

public class Program {

    static void main() {

        try {
            System.out.println("Preenchendo quarto");

            var hoje = LocalDate.now();
            var amanha = hoje.plusDays(1);

            var reserva = new Reservation(101, hoje, amanha);
            System.out.println("Reversa: " + reserva);

            System.out.println("Atualizando a reserva");

            var depoisDeAmanha = LocalDate.now().plusDays(2);
            var depoisDepoisDeAmanha = LocalDate.now().plusDays(4);
            reserva.updateDates(depoisDeAmanha, depoisDepoisDeAmanha);
            System.out.println("Reversa: " + reserva);

        } catch (DomainException | RuntimeException e){
            System.out.println(e.getMessage());
        }

    }
}
