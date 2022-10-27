package patterns.builder.clients;

import patterns.builder.products.Product;

import java.time.LocalDate;

public class Client {
    private final ClientType clientType;
    private final String name;
    private final LocalDate birthDate;
    private final String phoneNumber;
    private final String address;
    private Product product;

    public Client(ClientType clientType, String name, LocalDate birthDate,
                  String phoneNumber, String address, Product product) {
        this.clientType = clientType;
        this.name = name;
        this.birthDate = birthDate;
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

    public LocalDate getBirthDate() {
        return birthDate;
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
        return "Client{" +
                "clientType=" + clientType +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", product=" + product +
                '}';
    }
}
