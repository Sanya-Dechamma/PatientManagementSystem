package PatientManagementSystem.Entity;

import lombok.*;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.util.List;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = Appointment.TBL_NAME)
public class Appointment {
    public static final String TBL_NAME= "appointment";
    public static final String FLD_ID = "appointment_id";
    public static final String FLD_APPOINTMENT_DATE= "appointment_date";
    public static final String FLD_DESCRIPTION = "description";
    @Id
    @Column(name = FLD_ID)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(name = FLD_APPOINTMENT_DATE, nullable = false)
    private String appointmentDate;

    @Column(name = FLD_DESCRIPTION)
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "patient_id")
    private Patient patient;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "doctor_id")
    private Doctor doctor;

    @ManyToMany
    @JoinTable(
            name = "appointment_doctor",
            joinColumns = @JoinColumn(name = "appointment_id"),
            inverseJoinColumns = @JoinColumn(name = "doctor_id")
    )
    private List<Doctor> doctors;



}

