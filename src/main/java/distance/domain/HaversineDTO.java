package distance.domain;

import com.fasterxml.jackson.databind.PropertyNamingStrategy.KebabCaseStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import lombok.Data;

@Data
@JsonNaming(KebabCaseStrategy.class)
public class HaversineDTO {

    private double aLongitude;

    private double aLatitude;

    private double bLongitude;

    private double bLatitude;

    private double radius = 6371;

}
