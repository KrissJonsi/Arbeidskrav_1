public class Thermometer extends Meter{

    private double minTemp;
    private double maxTemp;

    public Thermometer(){

    }

    public Thermometer(String regNumber, boolean isFunctional, String location, double minTemp, double maxTemp) {
        super(regNumber, isFunctional, location);
        this.minTemp = minTemp;
        this.maxTemp = maxTemp;
    }

    public double getMinTemp() {
        return minTemp;
    }

    public void setMinTemp(double minTemp) {
        this.minTemp = minTemp;
    }

    public double getMaxTemp() {
        return maxTemp;
    }

    public void setMaxTemp(double maxTemp) {
        this.maxTemp = maxTemp;
    }

    @Override
    public String toString() {

        String status = isFunctional() ? "In order" : "Not in order";

        return "Temperature \n" +
                "Minimum temperature: " + getMinTemp() +"\n" +
                "maximum temperature: " + getMaxTemp() +"\n" +
                "Registration Number: " + getRegNumber() + "\n" +
                "Location: " + getLocation() + "\n" +
                "Status: " + status + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;


        Thermometer that = (Thermometer) o;

        if (Double.compare(that.minTemp, minTemp) != 0) return false;
        return Double.compare(that.maxTemp, maxTemp) == 0;
    }
}
