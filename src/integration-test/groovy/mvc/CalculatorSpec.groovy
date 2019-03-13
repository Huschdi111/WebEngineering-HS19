package mvc

import geb.spock.GebSpec
import grails.testing.mixin.integration.Integration

@Integration
class CalculatorSpec extends GebSpec {
    void "Basic Calculation"(){
        when:
        go '/static/GradeCalculator.html'
        then:
        title == 'Grade Calculator'

        when:
        $("form").en = 5.0
        $("form").exam = 6.0
        $("input",type: "submit").click()
        then:
        title == "Average"
        $("output").text() == "5.5"

        when:
        $("a", text:"calculator").click()
        then:
        title == "Grade Calculator"
    }
}
