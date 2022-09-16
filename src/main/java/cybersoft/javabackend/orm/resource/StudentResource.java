package cybersoft.javabackend.orm.resource;

import cybersoft.javabackend.orm.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentResource {
    @Autowired
    private StudentService service;

    public StudentResource (StudentService studentService) {
        this.service = studentService;
    }

}
