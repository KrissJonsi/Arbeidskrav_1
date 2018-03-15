public abstract class Meter {

    private String regNumber;
    private boolean isFunctional = true;
    private String location;

    public Meter() {
        this("empty", false, "empty");
    }

    public Meter(String regNumber, boolean isFunctional, String location) {
        this.regNumber = regNumber;
        this.isFunctional = isFunctional;
        this.location = location;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public boolean isFunctional() {
        return isFunctional;
    }

    public void setFunctional(boolean functional) {
        isFunctional = functional;
    }
}
