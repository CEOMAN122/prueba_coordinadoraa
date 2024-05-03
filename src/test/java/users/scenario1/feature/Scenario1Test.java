import com.intuit.karate.junit5.Karate;

public class Scenario1Test {
    @Karate.Test
    Karate testScenario1() {
        return Karate.run("Scenario1").relativeTo(getClass());
    }
}