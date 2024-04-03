package id.my.hendisantika.springwebfluxdemosystem.handler;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-webflux-demo-system
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 4/3/24
 * Time: 07:07
 * To change this template use File | Settings | File Templates.
 */

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class StudentHandler {
    private final StudentService studentService;
}
