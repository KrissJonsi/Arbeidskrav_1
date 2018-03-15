import java.util.ArrayList;
import java.util.List;

public class MeterArchive {

    private List<Meter> meters;

    public MeterArchive(){
        meters = new ArrayList<>();
    }

    public void addMeter(Meter meter){
        meters.add(meter);
    }

    public boolean removeMeter(String regNumber){
        for(Meter m : meters){
            if (m.getRegNumber().equals(regNumber)){
                meters.remove(m);
                System.out.println("Meter with registration number " + regNumber + " has been deleted");
                return true;
            }
        }
        System.out.println("Could not find meter with specified registration number");
        return false;
    }

    public Meter getMeter(String regNumber){
        for (Meter m : meters){
            if (m.getRegNumber().equals(regNumber)){
                System.out.println("Getting meter with registration number: " + regNumber);
                return m;
            }
        }
        System.out.println("Could not find meter with specified registration number");
        return null;
    }

    public boolean newLocation(String regNumber, String location){
        for(Meter m : meters){
            if(m.getRegNumber() == regNumber){
                System.out.println("Meter with registration number " + regNumber +
                        " has been moved from " + m.getLocation() + " to " + location);
                m.setLocation(location);
                return true;
            }
        }
        System.out.println("Could not find meter with specified registration number");
        return false;
    }

    public boolean notFunctional(String regNumber){
        for(Meter m : meters){
            if(m.getRegNumber().equals(regNumber)){
                m.setFunctional(false);
                System.out.println("Meter with registration number " + regNumber +
                        " has been set to 'not in order'");
                return true;
            }
        }
        System.out.println("Could not find meter with specified registration number");
        return false;
    }

    public String getAllMeters(){
        String meterString = "";
        for(Meter m : meters){
            meterString += m + "\n";
        }
        return meterString;
    }
}
