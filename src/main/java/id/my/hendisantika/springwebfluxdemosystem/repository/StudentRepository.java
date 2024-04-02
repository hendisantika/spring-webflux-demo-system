package id.my.hendisantika.springwebfluxdemosystem.repository;

import id.my.hendisantika.springwebfluxdemosystem.model.Student;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-webflux-demo-system
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 1/19/24
 * Time: 08:03
 * To change this template use File | Settings | File Templates.
 */
public interface StudentRepository extends ReactiveMongoRepository<Student, String> {
}
