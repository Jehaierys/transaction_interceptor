package example.com.transaction_interceptor.transfer;


import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.*;
import org.hibernate.validator.constraints.Length;

import java.math.BigDecimal;

@Getter
@Setter
@Builder
public class Transfer {

    @NotNull
    @Length(min = 12, max = 12)
    private String sender;

    @NotNull
    @Length(min = 12, max = 12)
    private String receiver;

    @NotNull
    @Positive
    private BigDecimal amount;

//    private float commission;
}
