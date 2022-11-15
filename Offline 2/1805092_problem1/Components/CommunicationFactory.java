package Components;

public class CommunicationFactory {
    public CommunicationSystem getCommunicationSysytem(String communicationsystem) {
        if (communicationsystem.equalsIgnoreCase("WIFI")) {
            return new WifiSystem();
        } else if (communicationsystem.equalsIgnoreCase("Mobile System")) {
            return new MobileSystem();
        }
        return null;


    }
};