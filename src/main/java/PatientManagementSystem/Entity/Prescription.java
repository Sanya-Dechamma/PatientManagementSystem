package PatientManagementSystem.Entity;

import lombok.*;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = Prescription.TBL_NAME)
public class Prescription {
    public static final String TBL_NAME= "prescription";
    public static final String FLD_ID= "prescription_id";
    public static final String FLD_MEDICATION= "medication";
    public static final String FLD_DOSAGE= "dosage";
    public static final String FLD_INSTRUCTIONS= "instructions";
    @Id
    @Column(name = FLD_ID)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(min = 2, max = 20)
    @Column(name = FLD_MEDICATION, nullable = false)
    private String medication;

    @Column(name = FLD_DOSAGE, nullable = false)
    private String dosage;

    @Size(min = 2, max = 100)
    @Column(name = FLD_INSTRUCTIONS)
    private String instructions;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "appointment_id")
    private Appointment appointment;
}

