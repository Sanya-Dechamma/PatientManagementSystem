package PatientManagementSystem.Controller;

import PatientManagementSystem.Entity.Patient;
import PatientManagementSystem.Service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
@RequestMapping("/patients")
public class PatientController {
    private final PatientService patientService;

    @Autowired
    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @GetMapping
    public String getAllPatients(Model model) {
        List<Patient> patients = patientService.getAllPatients();
        model.addAttribute("patients", patients);
        return "homepage";
    }

    @GetMapping("/{id}")
    public String getPatientById(@PathVariable Long id, Model model) throws ChangeSetPersister.NotFoundException {
        Patient patient = patientService.getPatientById(id);
        model.addAttribute("patient", patient);
        return "edit_patient";
    }

    @GetMapping("/create")
    public String createPatientForm(Model model) {
        model.addAttribute("patient", new Patient());
        return "add_patient";
    }

    @PostMapping("/save")
    public String createPatient(@ModelAttribute("patient") Patient patient) {
        patientService.savePatient(patient);
        return "redirect:/patients";
    }

    @GetMapping("/{id}/edit")
    public String editPatientForm(@PathVariable Long id, Model model) throws ChangeSetPersister.NotFoundException {
        Patient patient = patientService.getPatientById(id);
        model.addAttribute("patient", patient);
        return "edit_patient";
    }

    @PostMapping("/{id}/edit")
    public String editPatient(@ModelAttribute("patient") Patient patient) {
        patientService.savePatient(patient);
        return "redirect:/patients";
    }

    @GetMapping("/{id}/delete")
    public String deletePatient(@PathVariable Long id) {
        patientService.deletePatient(id);
        return "redirect:/patients";
    }
}
