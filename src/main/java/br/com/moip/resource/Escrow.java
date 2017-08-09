package br.com.moip.resource;

import lombok.Data;

@Data
public class Escrow {

    private String description;

    @Override
    public String toString() {
        return "Escrow{" +
                "description='" + description + '\'' +
                '}';
    }
}
