package model.sap;

public class CustomerSAP {

    private String name;
    private AddressSAP address;
    private EmailSAP email;
    private PhoneSAP phone;
    private LuckyNumberSAP luckyNumberSAP;

    public CustomerSAP() {
    }

    public CustomerSAP(String name, AddressSAP address, EmailSAP email, PhoneSAP phone, LuckyNumberSAP luckyNumberSAP) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.luckyNumberSAP = luckyNumberSAP;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AddressSAP getAddress() {
        return address;
    }

    public void setAddress(AddressSAP address) {
        this.address = address;
    }

    public EmailSAP getEmail() {
        return email;
    }

    public void setEmail(EmailSAP email) {
        this.email = email;
    }

    public PhoneSAP getPhone() {
        return phone;
    }

    public void setPhone(PhoneSAP phone) {
        this.phone = phone;
    }

    public LuckyNumberSAP getLuckyNumberSAP() {
        return luckyNumberSAP;
    }

    public void setLuckyNumberSAP(LuckyNumberSAP luckyNumberSAP) {
        this.luckyNumberSAP = luckyNumberSAP;
    }
}
