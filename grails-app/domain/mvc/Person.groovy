package mvc

class Person {

    String firstName
    String lastName

    String toString() {
        return firstName + " " + lastName;

    }

    static constraints = {
    }
}
