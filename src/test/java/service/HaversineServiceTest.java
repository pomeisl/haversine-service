package service;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import distance.service.haversine.HaversineService;

public class HaversineServiceTest {

    private HaversineService subject = new HaversineService();

    @Test
    void test_ShouldCalculate() {
        double result = subject.getGreatCircleDistanceOnSphere(47.497913, 19.040236, 51.509865, -0.118092, 6371);
        MatcherAssert.assertThat(result, Matchers.closeTo(1448.63, 0.5));
    }

}
