package mvc

import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification
import spock.lang.Unroll

class CalculatorControllerSpec extends Specification implements ControllerUnitTest<CalculatorController> {

    @Unroll
    void "average of #en and #exam should be #result"(en, exam, result) {
        when:
            controller.calc(en, exam)
        then: "average calculation"
            model.result == result
        where:
            en  | exam | result
            0.0 | 0.0  | 0.0
            1.0 | 2.0  | 1.5
            2.0 | 1.0  | 1.5

    }
}