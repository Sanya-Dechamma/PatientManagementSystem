package PatientManagementSystem.Entity;

import lombok.*;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = Patient.TBL_NAME)
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@AttributeOverrides({
        @AttributeOverride(name = "id", column = @Column(name = Patient.FLD_ID)),
        @AttributeOverride(name = "name", column = @Column(name = Patient.FLD_NAME))
})public class Patient extends AbstractPerson {
    public static final String TBL_NAME= "patient";
    public static final String FLD_ID= "patient_id";
    public static final String FLD_NAME = "patient_name";
    public static final String FLD_AGE= "age";
    public static final String FLD_GENDER= "gender";
    public static final String FLD_CONTACT= "contact_number";
    public static final String FLD_ADDRESS= "address";

    @NotNull
    @Min(value = 0, message = "Age shouldn't be less than Zero")
    @Max(value = 120, message = "Age should not exceed 120")
    @Column(name = FLD_AGE, nullable = false)
    private int age;

    @NotBlank
    @Column(name = FLD_GENDER, nullable = false)
    private String gender;

    @NotBlank
    @Size(min = 11, max = 11)
    @Column(name = FLD_CONTACT, nullable = false, unique = true)
    private String contactNumber;

    @NotBlank
    @Size(min = 1, max = 50)
    @Column(name = FLD_ADDRESS, nullable = false)
    private String address;

    @OneToOne(mappedBy = "patient", cascade = CascadeType.ALL)
    private MedicalRecord medicalRecord;

    @OneToMany(mappedBy = "patient", cascade = CascadeType.ALL)
    private List<Appointment> appointments;
}
