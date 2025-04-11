package example.com.transaction_interceptor.transfer;


import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@RequestMapping("/transfer")
public class TransferController {

    @PostMapping
    public Mono<Void> transfer(@Valid @RequestBody Transfer transfer) {

    }
}
