package br.com.moip;

import br.com.moip.api.*;

public class API {

    private final Client client;

    public API(final Client client) {
        this.client = client;
    }

    public OrderAPI order() {
        return new OrderAPI(client);
    }

    public PaymentAPI payment() {
        return new PaymentAPI(client);
    }

    public InvoiceAPI invoice() {
        return new InvoiceAPI(client);
    }

    public AccountAPI account() {
        return new AccountAPI(client);
    }

    public CustomerAPI customer() {
        return new CustomerAPI(client);
    }

    public NotificationPreferenceApi notificationPreference() {
        return new NotificationPreferenceApi(client);
    }
}
