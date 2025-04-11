package example.com.transaction_interceptor.transfer;


import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@RequestMapping("/transfer")
public class TransferController {

    private final TransferService transferService;

    @PostMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Mono<String> transfer(@Valid @RequestBody TransferDto transferDto) {
        transferService.send(transferDto.toTransfer());
        return Mono.just("Success!");
    }
}
