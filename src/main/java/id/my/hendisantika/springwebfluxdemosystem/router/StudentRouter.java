package id.my.hendisantika.springwebfluxdemosystem.router;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-webflux-demo-system
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 4/3/24
 * Time: 07:05
 * To change this template use File | Settings | File Templates.
 */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.web.reactive.function.server.RequestPredicates.DELETE;
import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.POST;
import static org.springframework.web.reactive.function.server.RequestPredicates.PUT;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;

@Configuration
public class StudentRouter {
    @Bean
    public RouterFunction<ServerResponse> route(StudentHandler studentHandler) {
        return RouterFunctions
                .route(
                        GET("/students/{id:[0-9]+}")
                                .and(accept(APPLICATION_JSON)), studentHandler::getStudent)
                .andRoute(
                        GET("/students")
                                .and(accept(APPLICATION_JSON)), studentHandler::listStudents)
                .andRoute(
                        POST("/students")
                                .and(accept(APPLICATION_JSON)), studentHandler::addNewStudent)
                .andRoute(
                        PUT("students/{id:[0-9]+}")
                                .and(accept(APPLICATION_JSON)), studentHandler::updateStudent)
                .andRoute(
                        DELETE("/students/{id:[0-9]+}")
                                .and(accept(APPLICATION_JSON)), studentHandler::deleteStudent);
    }
}
