package mvc

class Booking {

    public static final String AM = "Vormittag"
    public static final String PM = "Nachmittag"
    Person booker;
    Room room;
    Date day;
    String timeslot;

    static constraints = {
        booker nullable: false;
        room nullable: false;
        day nullable: false, min: new Date().clearTime();
        timeslot inList: [AM, PM]
    }
}