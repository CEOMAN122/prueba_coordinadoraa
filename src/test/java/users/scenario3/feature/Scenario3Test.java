package users.scenario3.feature;

import com.intuit.karate.junit5.Karate;

public class Scenario3Test {
    @Karate.Test
    Karate testScenario3() {
        return Karate.run("Scenario3").relativeTo(getClass());
    }
}