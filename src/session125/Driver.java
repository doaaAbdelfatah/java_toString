package session125;

public class Driver extends Person { // inheritance ( Driver child - Person Parent)
    private String expert;
    private  String drivingLicence;

    public Driver() {
    }

    public Driver(String name, String gender, String expert, String drivingLicence) {
        super(name, gender);
        this.expert = expert;
        this.drivingLicence = drivingLicence;
    }

    public String getExpert() {
        return expert;
    }

    public void setExpert(String expert) {
        this.expert = expert;
    }

    public String getDrivingLicence() {
        return drivingLicence;
    }

    public void setDrivingLicence(String drivingLicence) {
        this.drivingLicence = drivingLicence;
    }

    @Override
    public String toString() {
        return "Driver{" +
                super.toString()+
                "expert='" + expert + '\'' +
                ", drivingLicence='" + drivingLicence + '\'' +
                '}';
    }
}
