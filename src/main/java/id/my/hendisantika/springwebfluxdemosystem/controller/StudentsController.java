package id.my.hendisantika.springwebfluxdemosystem.controller;

import id.my.hendisantika.springwebfluxdemosystem.model.Student;
import id.my.hendisantika.springwebfluxdemosystem.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

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

    @PostMapping
    public Mono<ResponseEntity<Student>> create(@RequestBody Student student) {
        return studentRepository.save(student)
                .map(savedStudent -> ResponseEntity.ok(savedStudent))
                .defaultIfEmpty(ResponseEntity.notFound().build());
    }

    @GetMapping
    public Flux<Student> getStudents() {
        return studentRepository.findAll();
    }

    @GetMapping("/{studentId}")
    public Mono<ResponseEntity<Student>> getStudentById(@PathVariable int studentId) {
        return studentRepository.findById(studentId)
                .map(student -> ResponseEntity.ok(student))
                .defaultIfEmpty(ResponseEntity.notFound().build());
    }

    @PutMapping("/{studentId}")
    public Mono updateStudent(@PathVariable int studentId, @RequestBody Student student) {
        return studentRepository.findById(studentId)
                .flatMap(selectedStudentFromDB -> {
                    selectedStudentFromDB.setName(student.getName());
                    selectedStudentFromDB.setAge(student.getAge());
                    selectedStudentFromDB.setUniversity(student.getUniversity());
                    selectedStudentFromDB.setGpa(student.getGpa());

                    return studentRepository.save(selectedStudentFromDB);
                })
                .map(updatedStudent -> ResponseEntity.ok(updatedStudent))
                .defaultIfEmpty(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

}
