package my.lesson.springlesson2.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@ToString
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "car")
public class Car extends AbstractIdentifiableEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "driver")
    private Person driver;
    private String brand;
    private String model;
    @Column(name = "engine_type")
    private EngineType engineType;
    @Column(name = "manufactured_year")
    private Integer manufacturedYear;

    public enum EngineType {
        Petrol, Diesel, Gas
    }

}
