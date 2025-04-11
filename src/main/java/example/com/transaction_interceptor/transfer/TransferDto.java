package example.com.transaction_interceptor.transfer;

import java.math.BigDecimal;

public class TransferDto {

    private String sender;

    private String receiver;

    private BigDecimal amount;

    public Transfer toTransfer() {
        return Transfer.builder()
                .sender(this.sender)
                .receiver(this.receiver)
                .amount(this.amount)
                .build();
    }

}
