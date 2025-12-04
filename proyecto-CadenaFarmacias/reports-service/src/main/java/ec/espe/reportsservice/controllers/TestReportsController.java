package ec.espe.reportsservice.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@RestController
@RequiredArgsConstructor
public class TestReportsController {

    private final RestTemplate restTemplate = new RestTemplate();

    @Value("${sales.api.url}")
    private String salesApiUrl;

    @GetMapping("/test-sales")
    public Object testSales() {
        String url = salesApiUrl + "/ping";
        return restTemplate.getForObject(url, Object.class);
    }

    @GetMapping("/ping")
    public Map<String, String> ping() {
        return Map.of("msg", "Hola desde reports-service");
    }
}
