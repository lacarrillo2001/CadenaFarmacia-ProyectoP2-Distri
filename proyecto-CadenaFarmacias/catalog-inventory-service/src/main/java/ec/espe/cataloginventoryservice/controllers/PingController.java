package ec.espe.cataloginventoryservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController {
    @GetMapping("/ping")
    public String ping() {
        return "Hola desde catalog-inventory-service";
    }
}
