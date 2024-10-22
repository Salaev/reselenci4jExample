package ru.salaev.hub.clients;

import org.springframework.stereotype.Component;

@Component
public class ClientRest {

    public String callApi() {
        return "Call api";
    }

    public String fallback() {
        return "Fallback call api";
    }
}
