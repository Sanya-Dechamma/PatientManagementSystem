package PatientManagementSystem.Service;

import PatientManagementSystem.Entity.Prescription;
import PatientManagementSystem.Repository.PrescriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrescriptionService {
    private final PrescriptionRepository prescriptionRepository;

    @Autowired
    public PrescriptionService(PrescriptionRepository prescriptionRepository) {
        this.prescriptionRepository = prescriptionRepository;
    }

    public List<Prescription> getAllPrescriptions() {
        return prescriptionRepository.findAll();
    }

    public Prescription savePrescription(Prescription prescription) {
        return prescriptionRepository.save(prescription);
    }

    public Prescription getPrescriptionById(Long id) throws ChangeSetPersister.NotFoundException {
        return prescriptionRepository.findById(id)
                .orElseThrow(ChangeSetPersister.NotFoundException::new);
    }

    public void deletePrescription(Long id) {
        prescriptionRepository.deleteById(id);
    }
}
