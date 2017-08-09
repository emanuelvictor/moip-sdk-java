package br.com.moip.request;

import lombok.Data;

@Data
public class EscrowRequest {

    private String description;

    public EscrowRequest description(final String description) {
        this.description = description;
        return this;
    }

    @Override
    public String toString() {
        return "EscrowRequest{" +
                "description='" + description + '\'' +
                '}';
    }
}
