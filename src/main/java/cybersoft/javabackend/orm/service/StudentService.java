package cybersoft.javabackend.orm.service;

import cybersoft.javabackend.orm.model.Student;
import cybersoft.javabackend.orm.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface StudentService {
    List<Student> findAll();
    Student save (Student student);

    Student update(Student student, Integer id);
}
@Service
class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository repository;

    @Override
    @Transactional(readOnly = true)
    public List<Student> findAll() {
        return repository.findAll();
    }

    @Override
    public Student save(Student student) {
        return repository.save(student);
    }

    @Override
    @Transactional
    public Student update(Student student, Integer id) {
        Student pStudent = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student is not existed"));
        pStudent.setName(student.getName());
        return pStudent;
    }
}