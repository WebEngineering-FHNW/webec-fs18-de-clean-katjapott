package mvc

class BootStrap {

    def init = { servletContext ->

        Person dierk  = new Person(firstName: "Dierk",  lastName: "König").save(failOnError: true)
        Person dieter = new Person(firstName: "Dieter", lastName: "Holz") .save(failOnError: true)

        Room one = new Room(description: "6.2H03", capacity: 40).save(failOnError:true)
        Room two = new Room(description: "1.331",  capacity: 40).save(failOnError:true)

        Date today = new Date().clearTime()

        for(int i = 1; i<=10; i++) {
            new Booking(booker: dieter, room: one, day: today + i, timeslot: Booking.AM).save(failOnError:true)
            new Booking(booker: dierk,  room: two, day: today + i, timeslot: Booking.AM).save(failOnError:true)
        }

    }
    def destroy = {
    }
}
