package users.scenario2.feature;

import com.intuit.karate.junit5.Karate;

public class Scenario2Test {
    @Karate.Test
    Karate testScenario2() {
        return Karate.run("Scenario2").relativeTo(getClass());
    }
}