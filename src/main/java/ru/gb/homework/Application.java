package ru.gb.homework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Application.class, args);

        TicketNumberGenerator generator = context.getBean(TicketNumberGenerator.class);

        System.out.println(generator.createNewTicket());
        System.out.println(generator.createNewTicket());
        System.out.println(generator.createNewTicket());

        Display display = context.getBean(Display.class);

        System.out.println(display.newTicket());
        System.out.println(display.newTicket());
        System.out.println(display.newTicket());
    }
}
