package patterns.builder;

import patterns.builder.bulders.Builder;
import patterns.builder.clients.ClientType;
import patterns.builder.products.Product;

import java.time.LocalDate;

public class Manager {
    public void registerDepositor(Builder builder) {
        builder.setClientType(ClientType.DEPOSITOR);
        builder.setName("New Client");
        builder.setDate(LocalDate.of(1992, 2, 15));
        builder.setPhoneNumber("8800");
        builder.setAddress("Baker Street, 221b");
        builder.setProduct(Product.DEPOSIT);
    }

    public void registerCompany(Builder builder) {
        builder.setClientType(ClientType.COMPANY);
        builder.setName("Space X");
        builder.setDate(LocalDate.of(2002, 03, 14));
        builder.setPhoneNumber("8800");
        builder.setAddress("USA");
        builder.setProduct(Product.CASH_AND_SETTLEMENT);
    }
}
