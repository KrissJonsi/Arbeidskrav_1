public class Client {

    public static void main(String[] args) {
        new Client();
    }

    public Client(){
        mainMethod();
    }

    public void mainMethod(){
        MeterArchive archive = new MeterArchive();

        archive.addMeter(new Weight("V1000", true, "R101H1", 0.01, 10.0));
        archive.addMeter(new Clock("V1001", true, "R101H2", 0.01));
        archive.addMeter(new Clock("V1003", true, "R101H3", 0.1));
        archive.addMeter(new Thermometer("V1002", false, "R101H3", 0.01, 100));
        //archive.getAllMeters();

        System.out.println(archive.getMeter("V1003"));
        archive.newLocation("V1003","R101H4");
        archive.notFunctional("V1003");
        archive.removeMeter("V1003");

        System.out.println("\n" +"Overview of all meters");
        System.out.println(archive.getAllMeters());


    }


}
