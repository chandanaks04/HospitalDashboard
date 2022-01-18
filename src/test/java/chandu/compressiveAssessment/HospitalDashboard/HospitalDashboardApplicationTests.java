package chandu.compressiveAssessment.HospitalDashboard;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import chandu.compressiveAssessment.HospitalDashboard.Controller.HospitalController;
import chandu.compressiveAssessment.HospitalDashboard.CustomClass.CustomDoctor;
import chandu.compressiveAssessment.HospitalDashboard.CustomClass.CustomPatient;
import chandu.compressiveAssessment.HospitalDashboard.Entity.Doctor;
import chandu.compressiveAssessment.HospitalDashboard.Entity.Patient;
import chandu.compressiveAssessment.HospitalDashboard.Repository.DoctorRepository;
import chandu.compressiveAssessment.HospitalDashboard.Repository.PatientRepository;
import chandu.compressiveAssessment.HospitalDashboard.Service.HospitalService;
import chandu.compressiveAssessment.HospitalDashboard.ServiceImpl.HospitalServiceImpl;

@SpringBootTest
class HospitalDashboardApplicationTests {
	@Autowired
	private HospitalController hs;
	
	@MockBean
	private DoctorRepository dr;
	
	@MockBean 
	private PatientRepository pr;
	
	@Test
	@DisplayName("Add Doctor")
	 public void addDoctorsTest() {
		Doctor d1=new Doctor(1L,"Chandana",21L,"female","heart",null);
		when(dr.save(d1)).thenReturn(d1);
		String exp=" ";
		if(d1!=null)
		{
			exp="Doctor added sucessfully!!";
		}
		assertEquals(exp,hs.addDoctorDetails(d1));
	}
	@Test
	@DisplayName("Add Patient")
	public void addPatientsTest() {
		Doctor d1=new Doctor(1L,"Chandana",21L,"female","heart",null);
		CustomPatient p1=new CustomPatient(100L,"sam",21L,"Chandana","22-10--2022","meditation");
		Patient p2=new Patient(p1.getPid(),p1.getPname(),p1.getPage(),d1,p1.getDate(),p1.getDocDes());
		when(pr.save(p2)).thenReturn(p2);
		String exp=" ";
		if(p2!=null)
		{
			exp="Patient Added Sucessfully";
		}
		assertEquals(exp,hs.addPatientDetails(p1));
		
	}

	@Test
	@DisplayName("Doctor by Name")
	public void getDoctorsByNameTest()
	{
		String name="chandana";
		Doctor d1=new Doctor(1L,"Chandana",21L,"female","heart",null);
		when(dr.findByDname(name)).thenReturn(d1); 
		assertNotNull(d1);
	}
	@Test
	@DisplayName("Patient by Id")
	public void getPatientByIdTest()
	{
		Long id=4L;
		Doctor d1=new Doctor(1L,"Chandana",21L,"female","heart",null);
		Patient p1=new Patient(4L,"sam",21L,d1,"22-10--2022","meditation");
		when(pr.findByPid(id)).thenReturn(p1);
		assertEquals(p1,hs.getPatientById(id));
		
	}
	@Test
	@DisplayName("GetAllDoctors")
	public void getAllDoctorsTest()
	{
		when(dr.findAll()).thenReturn(Stream.of(new Doctor(1L,"Chandana",21L,"female","heart",null)).collect(Collectors.toList()));
		assertEquals(1,hs.getAllDoctors().size());
	}

}
