package my.lesson.springlesson2.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@ToString
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "person")
public class Person extends AbstractIdentifiableEntity {

    private String name;
    private String surname;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    private Integer age;

    public enum Gender {
        Male, Female
    }

}
