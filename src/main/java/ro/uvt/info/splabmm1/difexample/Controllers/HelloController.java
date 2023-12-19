package ro.uvt.info.splabmm1.difexample.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class HelloController {
    @GetMapping("/")
    public String hello() {
        return "hello";

    }
}