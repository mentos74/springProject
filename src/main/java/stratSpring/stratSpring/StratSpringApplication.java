package stratSpring.stratSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import stratSpring.stratSpring.student.Student;
import stratSpring.stratSpring.student.StudentController;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
@SpringBootApplication
@RequestMapping
public class StratSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(StratSpringApplication.class, args);
    }


}

