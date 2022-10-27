package patterns.builder.clients;

import patterns.builder.products.Product;

import java.time.LocalDate;

public class Company {
    private final ClientType clientType;
    private final String name;
    private final LocalDate registrationDate;
    private final String phoneNumber;
    private final String address;
    private Product product;

    public Company(ClientType clientType, String name, LocalDate registrationDate,
                   String phoneNumber, String address, Product product) {
        this.clientType = clientType;
        this.name = name;
        this.registrationDate = registrationDate;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.product = product;
    }

    public ClientType getClientType() {
        return clientType;
    }

    public String getName() {
        return name;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public Product getProduct() {
        return product;
    }

    @Override
    public String toString() {
        return "Company{" +
                "clientType=" + clientType +
                ", name='" + name + '\'' +
                ", registrationDate=" + registrationDate +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", product=" + product +
                '}';
    }
}
