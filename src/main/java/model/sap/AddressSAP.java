package model.sap;

public class AddressSAP {

    private String city;
    private String address;
    private int zip;

    public AddressSAP() {
    }

    public AddressSAP(String city, String address, int zip) {
        this.city = city;
        this.address = address;
        this.zip = zip;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    @Override
    public String toString() {
        return "AddressSAP{" +
                "city='" + city + '\'' +
                ", address='" + address + '\'' +
                ", zip=" + zip +
                '}';
    }
}
