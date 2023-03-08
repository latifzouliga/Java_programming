package day04_concatenation;

/*
    1. Create aclass named FlightTicket.java
    2. Declare the following variables:
            1. from
            2. to
            3. ticket Price
    3. Use concatenation to print the full ticket information Ex:
            From Las Vegas to McLean is $425.5
 */

import day02_escapeSequences.AboutMe;

public class FlightTicket {

    public static void main(String[] args) {

        String from = "Las Vagas",
                to = "Mclean";
        double ticketPrice = 425.5;

        System.out.println("From " + from + " to " + to + " is $" + ticketPrice);








    }
}
