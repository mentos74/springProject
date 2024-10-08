package stratSpring.stratSpring.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;


@Service
public class StudentService {
    private final StundentRepository studentRepo ;

    public StudentService(StundentRepository studentRepo){
       this.studentRepo = studentRepo;
    }

    public  List<Student> getStudent() {


        return studentRepo.findAll();
    }
}
