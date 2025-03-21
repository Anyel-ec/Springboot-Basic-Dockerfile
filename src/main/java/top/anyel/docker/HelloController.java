package top.anyel.docker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * Author: Anyel EC
 * Github: https://github.com/Anyel-ec
 * Creation date: 21/03/2025
 */
@RestController
@RequestMapping
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello Docker World!";
    }
}
