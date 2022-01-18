package chandu.compressiveAssessment.HospitalDashboard.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import chandu.compressiveAssessment.HospitalDashboard.CustomClass.CustomDoctor;
import chandu.compressiveAssessment.HospitalDashboard.CustomClass.CustomPatient;
import chandu.compressiveAssessment.HospitalDashboard.Entity.Doctor;
import chandu.compressiveAssessment.HospitalDashboard.Entity.Patient;
import chandu.compressiveAssessment.HospitalDashboard.Service.HospitalService;
import chandu.compressiveAssessment.HospitalDashboard.ServiceImpl.HospitalServiceImpl;
@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/hospital")
public class HospitalController {
	@Autowired
	private HospitalService ser;
	
	
	public HospitalController(HospitalService ser) {
		super();
		this.ser = ser;
	}


	@PostMapping("/add/doctors")
	public String addDoctorDetails(@RequestBody Doctor d)
	{
		return ser.AddDoctor(d);
	}
	@PostMapping("add/patients")
	public String addPatientDetails(@RequestBody CustomPatient p) {
		return ser.AddPatient(p);
	}
	@GetMapping("/get/doctorsname/{name}")
	public CustomDoctor doctorByNameDetails(@PathVariable(value="name") String name)
	{
		return ser.getDoctorName(name);
	}
	
	@GetMapping("/get/patients/{id}")
	public Patient getPatientById(@PathVariable(value="id") Long id)
	{
		return ser.getPatientById(id);
	}
	@GetMapping("/get/allDoctors")
	public List<Doctor> getAllDoctors()
	{
		return ser.getDoctors();
	}
}
