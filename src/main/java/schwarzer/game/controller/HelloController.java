package schwarzer.game.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author SchwarzerRammuse
 * @Date 2021/2/4 20:06
 * @Version 1.0
 * @describtion
 */
@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping
    public String hello(){
        return "helloWorld";
    }
}
