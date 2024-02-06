package springAnnotations;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MainClass {

    @GetMapping("/welcome")
    public static void main( String[] args ){
        System.out.println("Check");
    }


}
