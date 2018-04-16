package mvc

class BookingController {

    static scaffold = Booking;

    def foo(){
        Person Katja = Person.findByFirstName("Katja")
        def result = Booking.findAllByBooker(Katja)
        render text: result
    }

}
