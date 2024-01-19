package id.my.hendisantika.springwebfluxdemosystem.controller;

import id.my.hendisantika.springwebfluxdemosystem.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-webflux-demo-system
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 1/19/24
 * Time: 08:04
 * To change this template use File | Settings | File Templates.
 */
@RestController
@RequestMapping("/students")
@RequiredArgsConstructor
public class StudentsController {

    private final StudentRepository studentRepository;

}
