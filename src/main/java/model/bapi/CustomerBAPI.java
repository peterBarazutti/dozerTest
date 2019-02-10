package model.bapi;

public class CustomerBAPI {

    private String customerName;
    private AddressBAPI address;
    private CustomerContactsBAPI contacts;
    private LuckyNumberBAPI luckyNumber;

    public CustomerBAPI() {
    }

    public CustomerBAPI(String customerName, AddressBAPI address, CustomerContactsBAPI contacts, LuckyNumberBAPI luckyNumber) {
        this.customerName = customerName;
        this.address = address;
        this.contacts = contacts;
        this.luckyNumber = luckyNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public AddressBAPI getAddress() {
        return address;
    }

    public void setAddress(AddressBAPI address) {
        this.address = address;
    }

    public CustomerContactsBAPI getContacts() {
        return contacts;
    }

    public void setContacts(CustomerContactsBAPI contacts) {
        this.contacts = contacts;
    }

    public LuckyNumberBAPI getLuckyNumber() {
        return luckyNumber;
    }

    public void setLuckyNumber(LuckyNumberBAPI luckyNumber) {
        this.luckyNumber = luckyNumber;
    }
}
