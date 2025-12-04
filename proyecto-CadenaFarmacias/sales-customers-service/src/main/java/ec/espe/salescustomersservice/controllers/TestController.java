package ec.espe.salescustomersservice.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequiredArgsConstructor
public class TestController {

    private final RestTemplate rest = new RestTemplate();

    @GetMapping("/test-catalog")
    public String testCatalog() {
        return rest.getForObject("http://catalog-inventory-service:8081/ping", String.class);
    }

    @GetMapping("/ping")
    public String ping() {
        return "Hola desde sales-customers-service";
    }
}
