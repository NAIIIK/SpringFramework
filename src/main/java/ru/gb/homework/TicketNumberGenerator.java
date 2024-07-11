package ru.gb.homework;

import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class TicketNumberGenerator {

    public String createNewTicket() {
        return "Ticket #" + UUID.randomUUID().toString();
    }
}
