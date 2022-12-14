package cybersoft.javabackend.orm.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
@Data
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    @Id
    private int studentId;
    private String name;
}
