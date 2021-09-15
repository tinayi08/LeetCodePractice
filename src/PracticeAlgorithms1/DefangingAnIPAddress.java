package PracticeAlgorithms1;


//    Given a valid (IPv4) IP address, return a
//    defanged version of that IP address.
//
//    A defanged IP address replaces every period "." with "[.]".

public class DefangingAnIPAddress {
    public static void main(String[] args) {
        String address = "255.100.50.0";

        DefangingAnIPAddress main = new DefangingAnIPAddress();
        main.defangIPaddr(address);
    }
    public String defangIPaddr(String address) {

        return address.replace(".", "[.]");
    }

}
