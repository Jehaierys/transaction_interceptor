package example.com.transaction_interceptor.transfer;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Builder;
import org.hibernate.validator.constraints.Length;

import java.math.BigDecimal;
import java.util.UUID;

@Builder
public class TransferDto {

    @NotNull
    @Length(min = 12, max = 12)
    private String sender;

    @NotNull
    @Length(min = 12, max = 12)
    private String receiver;

    @NotNull
    @Positive
    private BigDecimal amount;

    public Transfer toTransfer() {
        return Transfer.builder()
                .uuid(UUID.randomUUID())
                .sender(this.sender)
                .receiver(this.receiver)
                .amount(this.amount)
                .build();
    }

}
