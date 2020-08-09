package distance.service.haversine;

import static java.lang.Math.asin;
import static java.lang.Math.cos;
import static java.lang.Math.pow;
import static java.lang.Math.sin;
import static java.lang.Math.toRadians;

import org.springframework.stereotype.Service;

@Service
public class HaversineService {

    public double getGreatCircleDistanceOnSphere(double aLat, double aLon, double bLat, double bLon, double radius) {
        double dLat = toRadians(bLat - aLat) / 2;
        double dLon = toRadians(bLon - aLon) / 2;

        double c = pow(sin(dLat), 2)
            + pow(sin(dLon), 2)
            * cos(toRadians(aLat))
            * cos(toRadians(bLat));

        return 2 * radius * asin(Math.sqrt(c));
    }

}
