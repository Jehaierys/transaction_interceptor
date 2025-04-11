package example.com.transaction_interceptor.transfer;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TransferService {
    private final KafkaTemplate<String, Transfer> transferTemplate;
}
