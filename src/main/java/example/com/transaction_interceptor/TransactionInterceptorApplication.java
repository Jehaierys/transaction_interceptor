package example.com.transaction_interceptor;

import example.com.transaction_interceptor.transfer.TransferController;
import example.com.transaction_interceptor.transfer.TransferDto;
import example.com.transaction_interceptor.transfer.TransferService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.core.KafkaTemplate;

import java.math.BigDecimal;

@SpringBootApplication
public class TransactionInterceptorApplication {

    private static TransferController transferController;

    @Autowired
    public void setTransferController(TransferController transferController) {
        this.transferController = transferController;
    }
    public static void main(String[] args) {
        SpringApplication.run(TransactionInterceptorApplication.class, args);
        TransferDto transferDto = TransferDto.builder()
                .sender("234576541234")
                .receiver("859402349867")
                .amount(BigDecimal.TEN)
                .build();

        transferController.transfer(transferDto);
    }

}
