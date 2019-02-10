package model.bapi;

public class AddressBAPI {

    private String city;
    private String address;
    private String zip;

    public AddressBAPI() {
    }

    public AddressBAPI(String city, String address, String zip) {
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

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
}
