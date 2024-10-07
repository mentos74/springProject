package stratSpring.stratSpring.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;


@Service
public class StudentService {
    public  List<Student> getStudent() {


        return List.of(new Student(1L,"Ashan", "30B",28, "ashan@gmail.com", LocalDate.of(1996,8,15)));
    }
}
