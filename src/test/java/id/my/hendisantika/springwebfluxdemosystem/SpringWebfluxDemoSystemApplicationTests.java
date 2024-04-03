package id.my.hendisantika.springwebfluxdemosystem;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Flux;

@SpringBootTest
class SpringWebfluxDemoSystemApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void simpleFluxExample() {
        Flux<String> fluxColors = Flux.just("red", "green", "blue");
        fluxColors.subscribe(System.out::println);
    }
}
