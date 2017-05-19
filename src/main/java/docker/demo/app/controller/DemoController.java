package docker.demo.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by pkrawiec on 5/17/2017.
 */
@RestController
public class DemoController {

    @GetMapping("/helloWorld")
    public String helloWorld() {
        return "Hello world";
    }
}
