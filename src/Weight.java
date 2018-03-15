public class Weight extends Meter {

    private double minWeight;
    private double maxWeight;


    public Weight() {
    }

    public Weight(String regNumber, boolean isFunctional, String location, double minWeight, double maxWeight) {
        super(regNumber, isFunctional, location);
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public double getMinWeight() {
        return minWeight;
    }

    public void setMinWeight(double minWeight) {
        this.minWeight = minWeight;
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    @Override
    public String toString() {

        String status = isFunctional() ? "In order" : "Not in order";

        return "Weight \n" +
                "Minimum weight: " + getMinWeight() +"\n" +
                "Maximum weight: " + getMaxWeight() +"\n" +
                "Registration Number: " + getRegNumber() + "\n" +
                "Location: " + getLocation() + "\n" +
                "Status: " + status + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Weight weight = (Weight) o;

        if (Double.compare(weight.minWeight, minWeight) != 0) return false;
        return Double.compare(weight.maxWeight, maxWeight) == 0;
    }
}
