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
@Table(name = MedicalRecord.TBL_NAME)
public class MedicalRecord {
    public static final String TBL_NAME= "medical_record";
    public static final String FLD_ID= "medical_id";
    public static final String FLD_BLOOD_TYPE= "blood_type";
    public static final String FLD_MEDICAL_HISTORY= "medical_history";

    @Id
    @Column(name = FLD_ID)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    @Column(name = FLD_BLOOD_TYPE, nullable = false)
    private String bloodType;

    @NotBlank
    @Column(name = FLD_MEDICAL_HISTORY)
    private String medicalHistory;


    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "patient_id")
    private Patient patient;
}

