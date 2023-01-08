package javahomeworks10x6Ocak;

import java.util.List;

public class StolenCars {
    private List<String> stolenPlate;
    private String policeOfficer;

    public StolenCars(List<String> stolenPlate, String policeOfficer) {
        this.stolenPlate = stolenPlate;
        this.policeOfficer = policeOfficer;
    }

    public List<String> getStolenPlate() {
        return stolenPlate;
    }

    public void setStolenPlate(List<String> stolenPlate) {
        this.stolenPlate = stolenPlate;
    }

    public String getPoliceOfficer() {
        return policeOfficer;
    }

    public void setPoliceOfficer(String policeOfficer) {
        this.policeOfficer = policeOfficer;
    }
}
