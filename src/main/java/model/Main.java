package model;

import model.bapi.AddressBAPI;
import model.bapi.CustomerBAPI;
import model.bapi.CustomerContactsBAPI;
import model.bapi.LuckyNumberBAPI;
import model.sap.AddressSAP;
import model.sap.CustomerSAP;
import model.sap.LuckyNumberSAP;
import org.dozer.DozerBeanMapper;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        DozerBeanMapper mapper = new DozerBeanMapper();
        configureMapper(mapper,
                "lucky-mapper.xml",
                                "customer-mapper.xml",
                                "email-mapper.xml"
        //                        ,"phone-mapper.xml"
        );

        // simple conversion
        AddressBAPI addressBAPI = new AddressBAPI("Budapest", "Vaci u. 17", "1138");
        AddressSAP addressSAP = mapper.map(addressBAPI, AddressSAP.class);
        System.out.println(addressSAP);

        System.out.println("===============================================================");

        // differing data type
        LuckyNumberBAPI luckyNumberBAPI = new LuckyNumberBAPI("2131");
        LuckyNumberSAP luckyNumberSAP = mapper.map(luckyNumberBAPI, LuckyNumberSAP.class);
        System.out.println(luckyNumberSAP.getFavNumber());

        System.out.println("===============================================================");

        // complex converion
        CustomerBAPI customerBAPI = new CustomerBAPI();
        customerBAPI.setCustomerName("Lajos");
        customerBAPI.setAddress(addressBAPI);
        customerBAPI.setLuckyNumber(luckyNumberBAPI);

        CustomerSAP customerSAP = mapper.map(customerBAPI, CustomerSAP.class);

        System.out.println(customerSAP.getName());
        System.out.println(customerSAP.getAddress());
        System.out.println(customerSAP.getLuckyNumberSAP().getFavNumber());

        System.out.println("===============================================================");

        CustomerContactsBAPI customerContactsBAPI = new CustomerContactsBAPI("00660123345", "bul@dozer.org");
        customerBAPI.setContacts(customerContactsBAPI);

        customerSAP = mapper.map(customerBAPI, CustomerSAP.class);

        System.out.println(customerSAP.getEmail().getEmailAddress());
        System.out.println(customerSAP.getPhone().getPhoneNumber());
    }

    private static void configureMapper(DozerBeanMapper mapper, String... mappingFileUrls) {

        mapper.setMappingFiles(Arrays.asList(mappingFileUrls));

    }

}
