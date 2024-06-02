package PatientManagementSystem.Entity;

import lombok.*;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Entity
@Getter
@Setter
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Table(name = Doctor.TBL_NAME)
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@AttributeOverrides({
        @AttributeOverride(name = "id", column = @Column(name = Doctor.FLD_ID)),
        @AttributeOverride(name = "name", column = @Column(name = Doctor.FLD_NAME))
})
public class Doctor extends AbstractPerson{
    public static final String TBL_NAME= "doctor";
    public static final String FLD_ID= "doctor_id";
    public static final String FLD_NAME = "doctor_name";
    public static final String FLD_EMAIL= "email";
    public static final String FLD_DEPARTMENT= "department";

    @NotBlank
    @Email
    @Column(name = FLD_EMAIL, nullable = false, unique = true)
    private String email;

    @NotBlank
    @Size(min = 2, max = 50)
    @Column(name = FLD_DEPARTMENT, nullable = false)
    private String department;

    @OneToMany(mappedBy = "doctor", cascade = CascadeType.ALL)
    private List<Appointment> appointments;

    @ManyToMany(mappedBy = "doctors")
    private List<Appointment> doctorsAppointments;
}
