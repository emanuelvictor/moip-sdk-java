package br.com.moip.api;

import br.com.moip.Client;
import br.com.moip.resource.NotificationPreference;

import java.util.Arrays;
import java.util.List;

public class NotificationPreferenceApi {

    private final Client client;
    private static final String NOTIFICATION_PREFERENCE_URL = "/v2/preferences/notifications";

    public NotificationPreferenceApi(final Client client) {
        this.client = client;
    }

    public NotificationPreference get(final String id) {
        return client.get(NOTIFICATION_PREFERENCE_URL + "/" + id, NotificationPreference.class);
    }

    public List<NotificationPreference> list() {
        return Arrays.asList(client.get(NOTIFICATION_PREFERENCE_URL, NotificationPreference[].class));
    }
}
