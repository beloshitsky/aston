package patterns.builder.bulders;

import patterns.builder.clients.Client;
import patterns.builder.clients.ClientType;
import patterns.builder.products.Product;

import java.time.LocalDate;

public class ClientBuilder implements Builder {
    private ClientType clientType;
    private String name;
    private LocalDate birthDate;
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
    public void setDate(LocalDate birthDate) {
        this.birthDate = birthDate;
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

    public Client build() {
        return new Client(clientType, name, birthDate, phoneNumber, address, product);
    }
}
