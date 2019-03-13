import grails.testing.web.controllers.ControllerUnitTest
import mvc.CalculatorController
import spock.lang.Specification

class CalculatorControllerSpec extends Specification implements ControllerUnitTest<CalculatorController>{
    void "simple average of #en and #exam should be result"(){
        when:
        controller.calc(5.0,6.0)
        then:
        model.result == 5.5
    }
}
