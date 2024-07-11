package ru.gb.homework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class Display {

    private TicketNumberGenerator numberGenerator;

    @Autowired
    public Display(TicketNumberGenerator numberGenerator) {
        this.numberGenerator = numberGenerator;
    }

    public Ticket newTicket() {
        return new Ticket(numberGenerator.createNewTicket(), LocalDateTime.now());
    }
}
