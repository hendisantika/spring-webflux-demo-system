package id.my.hendisantika.springwebfluxdemosystem.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-webflux-demo-system
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 1/19/24
 * Time: 08:01
 * To change this template use File | Settings | File Templates.
 */
@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    @Id
    private int id;
    private String name;
    private int age;
    private String university;
    private double gpa;
}
