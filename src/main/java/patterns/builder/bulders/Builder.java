package patterns.builder.bulders;

import patterns.builder.clients.ClientType;
import patterns.builder.products.Product;

import java.time.LocalDate;

public interface Builder {
    void setClientType(ClientType clientType);
    void setName(String name);
    void setDate(LocalDate date);
    void setPhoneNumber(String phoneNumber);
    void setAddress(String address);
    void setProduct(Product product);
}
