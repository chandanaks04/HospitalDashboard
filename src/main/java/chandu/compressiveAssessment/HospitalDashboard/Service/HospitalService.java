package chandu.compressiveAssessment.HospitalDashboard.Service;

import java.util.List;

import chandu.compressiveAssessment.HospitalDashboard.CustomClass.CustomDoctor;
import chandu.compressiveAssessment.HospitalDashboard.CustomClass.CustomPatient;
import chandu.compressiveAssessment.HospitalDashboard.Entity.Doctor;
import chandu.compressiveAssessment.HospitalDashboard.Entity.Patient;

public interface HospitalService {
		public String  AddDoctor(Doctor d);
		public String AddPatient(CustomPatient  cp);
		public CustomDoctor getDoctorName(String name);	
		public Patient getPatientById(Long id);
		public List<Doctor> getDoctors();
}
