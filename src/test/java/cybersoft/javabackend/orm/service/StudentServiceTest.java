package cybersoft.javabackend.orm.service;

import cybersoft.javabackend.orm.model.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class StudentServiceTest {
    @Autowired
    private StudentService sut;
    @Test
    void shouldSaveStudent() {

        sut.save(Student.builder()
                        .studentId(1).name("Trung")
                .build());
    }
}
