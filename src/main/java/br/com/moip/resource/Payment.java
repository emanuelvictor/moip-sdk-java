package br.com.moip.resource;

import lombok.Data;

@Data
public class Payment {

    private String id;
    private PaymentStatus status;
    private Amount amount;
    private int installmentCount;
    private final FundingInstrument fundingInstrument = new FundingInstrument();
    private Geolocation geolocation;
    private Escrow escrow;

    @Override
    public String toString() {
        return "Payment{" +
                "id='" + id + '\'' +
                ", status=" + status +
                ", amount=" + amount +
                ", installmentCount=" + installmentCount +
                ", fundingInstrument=" + fundingInstrument +
                ", geolocation=" + geolocation +
                ", escrow=" + escrow +
                '}';
    }
}
