public class Clock extends Meter {

    private double minInterval;

    public Clock() {
    }

    public Clock(String regNumber, boolean isFunctional, String location, double minInterval) {
        super(regNumber, isFunctional, location);
        this.minInterval = minInterval;
    }

    public double getMinInterval() {
        return minInterval;
    }

    public void setMinInterval(double minInterval) {
        this.minInterval = minInterval;
    }

    @Override
    public String toString() {

        String status = isFunctional() ? "In order" : "Not in order";

        return "Clock \n" +
                "Minimum interval: " + getMinInterval() + "\n" +
                "Registration Number: " + getRegNumber() + "\n" +
                "Location: " + getLocation() + "\n" +
                "Status: " + status + "\n";

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Clock clock = (Clock) o;

        return Double.compare(clock.minInterval, minInterval) == 0;
    }
}
