package patterns.builder.bulders;

import patterns.builder.clients.ClientType;
import patterns.builder.clients.Company;
import patterns.builder.products.Product;

import java.time.LocalDate;

public class CompanyBuilder implements Builder {
    private ClientType clientType;
    private String name;
    private LocalDate registrationDate;
    private String phoneNumber;
    private String address;
    private Product product;

    @Override
    public void setClientType(ClientType clientType) {
        this.clientType = clientType;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    @Override
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public void setProduct(Product product) {
        this.product = product;
    }

    public Company build() {
        return new Company(clientType, name, registrationDate, phoneNumber, address, product);
    }
}
