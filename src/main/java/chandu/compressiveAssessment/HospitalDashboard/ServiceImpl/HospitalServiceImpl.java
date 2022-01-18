package chandu.compressiveAssessment.HospitalDashboard.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import chandu.compressiveAssessment.HospitalDashboard.CustomClass.CustomDoctor;
import chandu.compressiveAssessment.HospitalDashboard.CustomClass.CustomPatient;
import chandu.compressiveAssessment.HospitalDashboard.Entity.Doctor;
import chandu.compressiveAssessment.HospitalDashboard.Entity.Patient;
import chandu.compressiveAssessment.HospitalDashboard.Repository.DoctorRepository;
import chandu.compressiveAssessment.HospitalDashboard.Repository.PatientRepository;
import chandu.compressiveAssessment.HospitalDashboard.Service.HospitalService;
@Service
public class HospitalServiceImpl  implements HospitalService{
	 @Autowired
	 private DoctorRepository doc;
	 
	 @Autowired
	 private PatientRepository pat;
	 
	 
	public HospitalServiceImpl(DoctorRepository doc, PatientRepository pat) {
		super();
		this.doc = doc;
		this.pat = pat;
	}

	@Override
	public String  AddDoctor(Doctor doctor) {
		
		
	Doctor checkdoc=doc.findByDid(doctor.getDid());

		if(checkdoc==null) {
		 doc.save(doctor);
		return "Doctor added sucessfully!!";
		}
		else 
			return "Doctor of this id "+doctor.getDid()+" is already present try with new  doctor id ";
	
		
	}

	

	@Override
	public String AddPatient(CustomPatient cp) {
		Patient p=pat.findByPid(cp.getPid());
		if(p==null)
		{
			Doctor d=doc.findByDname(cp.getVisitedDoctor());
			Patient pt=new Patient(cp.getPid(), cp.getPname(),cp.getPage(),d,cp.getDate(),cp.getDocDes());
			pat.save(pt);
			return "Patient Added Sucessfully";
		}
		else
			return "Patient with same id is present try with another id";
	}

	@Override
	public CustomDoctor getDoctorName(String name) {
	Doctor d=doc.findByDname(name);
    CustomDoctor cs = new CustomDoctor (d.getDid(),d.getDname(),d.getDage(),d.getDgender(),d.getSpecialist(),d.getPatient().size());
    return cs;
	}

	@Override
	public Patient getPatientById(Long id) {
		// TODO Auto-generated method stub
		return pat.findByPid(id);
	}

	@Override
	public List<Doctor> getDoctors() {
		// TODO Auto-generated method stub
		return doc.findAll();
	}
	
	



}
