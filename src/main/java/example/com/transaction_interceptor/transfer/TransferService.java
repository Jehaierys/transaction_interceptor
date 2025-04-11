package example.com.transaction_interceptor.transfer;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class TransferService {

    private final KafkaTemplate<String, Transfer> transferTemplate;

    @Transactional
    public void send(Transfer transfer) {
        transferTemplate.send("transfer", 0, "transfer-0", transfer);
    }
}
