package patterns.builder;

import patterns.builder.bulders.ClientBuilder;
import patterns.builder.bulders.CompanyBuilder;
import patterns.builder.clients.Client;
import patterns.builder.clients.Company;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        ClientBuilder clientBuilder = new ClientBuilder();
        CompanyBuilder companyBuilder = new CompanyBuilder();

        manager.registerDepositor(clientBuilder);
        Client client = clientBuilder.build();

        manager.registerCompany(companyBuilder);
        Company company = companyBuilder.build();

        System.out.println(client.toString());

        System.out.println(company.toString());
    }
}
