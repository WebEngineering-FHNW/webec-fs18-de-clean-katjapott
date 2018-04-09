package mvc

class Room {

    String description
    int    capacity

    static constraints = {
        description nullable:false, blank:false
        capacity    nullable:false
    }
}
