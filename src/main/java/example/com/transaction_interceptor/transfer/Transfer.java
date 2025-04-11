package example.com.transaction_interceptor.transfer;


import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.*;
import org.hibernate.validator.constraints.Length;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Setter
@Builder
public class Transfer {

    private UUID uuid;

    private String sender;

    private String receiver;

    private BigDecimal amount;


//    private float commission;
}
