package mvc

class BootStrap {

    def init = { servletContext ->
        Person Katja = new Person(firstName: "Katja", lastName: "Pott").save(failOnError: true);
        Room room1 = new Room(description: "Raum1", capacity: "20").save(failOnError: true);

        Date today = new Date().clearTime();

        for (int i = 1; i <= 1000; i++) {
            new Booking(booker: Katja, room: room1, day: today + i, timeslot: Booking.AM).save(failOnError: true)

        }
        def destroy = {
        }
    }
}