package javahomeworks10x6Ocak;

import java.util.HashSet;
import java.util.List;

public class StolenCars {
    private HashSet<String> stolenPlate;
    private String policeOfficer;

    public StolenCars(HashSet<String> stolenPlate, String policeOfficer) {
        this.stolenPlate = stolenPlate;
        this.policeOfficer = policeOfficer;
    }

    public HashSet<String> getStolenPlate() {
        return stolenPlate;
    }

    public void setStolenPlate(HashSet<String> stolenPlate) {
        this.stolenPlate = stolenPlate;
    }

    public String getPoliceOfficer() {
        return policeOfficer;
    }

    public void setPoliceOfficer(String policeOfficer) {
        this.policeOfficer = policeOfficer;
    }
}
