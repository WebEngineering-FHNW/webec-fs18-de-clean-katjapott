package mvc

import geb.spock.GebSpec
import grails.testing.mixin.integration.Integration

/**
 * See http://www.gebish.org/manual/current/ for more instructions
 */
@Integration
class InPlaceCalculatorSpec extends GebSpec {

// TODO: un-comment the commented lines below and see them failing, then make them pass

    void "Calculate in place with a self-refreshing view"() {
        when: "Go to start GSP page by calling it disguised as HTML"
            go '/InPlaceCalculator.html'
        then:
        	title == "In-Place Calculator"

        when: "set valid input"
<<<<<<< HEAD
            $("form").en   = '5'
            $("form").exam = '6'
            $("input", type: "submit").click()

        then: "Result is displayed with proper rounding up"
           $("output").text() == "6"
=======
            $("form").en   = 5
            $("form").exam = 6
            $("input", type: "submit").click()

        then: "Result is displayed with proper rounding up"
            $("output").text() == "6"
>>>>>>> upstream/master
    }

    void "Invalid input shows error message and sets error class"() {
        when: "Go to start GSP page by calling it disguised as HTML"
            go '/InPlaceCalculator.html'
        then:
        	title == "In-Place Calculator"

        when: "set invalid input"
            $("form").en   = 0
            $("form").exam = 3
            $("input", type: "submit").click()

        then: "Result contains error message"
            $("output").text() == "Cannot calculate. Input data was invalid."
        then: "invalid en field has error class while valid exam input has no class"
            $("#en",   class:'error')
            $("#exam").attr('class') == ""
    }


    void "Invalid input is handled in-place by JS without submission"() {
        given: "a valid state"
            go '/InPlaceCalculator.html'
            $("form").en   = 3
            $("form").exam = 3
        when:
            $("input", type: "submit").click()
        then: "we should have a clean, valid state to start from"
            $("#en").attr('class') == ""
        when: "we enter some invalid value _without_ submitting"
//            def message = withAlert {
                $("form").en = 0.9
//            }
        then: "the in-place JS logic should kick in"
//            $("#en").attr('class') == "error"
//            message == "en value needs to be at least 1.0"
//            $("#en").focused
    }


}
