package ru.gb.homework;

import java.time.LocalDateTime;

public class Ticket {

    private String number;

    private LocalDateTime createdAt;

    public Ticket(String number, LocalDateTime createdAt) {
        this.number = number;
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return  "{number='" + number + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}
