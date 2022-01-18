package chandu.compressiveAssessment.HospitalDashboard.Entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="doctor")
public class Doctor implements Serializable{
	@Id
	private Long did;
	private String dname;
	private Long dage;
	private String dgender;
	private String specialist;
	
	
	
	@OneToMany(mappedBy="doctor")
	@JsonIgnore
	private List<Patient> patient;
	public Doctor() {
		super();
	}
	public Doctor(Long did, String dname, Long dage, String dgender, String specialist, List<Patient> patient) {
		super();
		this.did = did;
		this.dname = dname;
		this.dage = dage;
		this.dgender = dgender;
		this.specialist = specialist;
		this.patient = patient;
	}
	
	public Doctor(Long did, String dname, Long dage, String dgender, String specialist) {
		super();
		this.did = did;
		this.dname = dname;
		this.dage = dage;
		this.dgender = dgender;
		this.specialist = specialist;
	}
	public Long getDid() {
		return did;
	}
	public void setDid(Long did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public Long getDage() {
		return dage;
	}
	public void setDage(Long dage) {
		this.dage = dage;
	}
	public String getDgender() {
		return dgender;
	}
	public void setDgender(String dgender) {
		this.dgender = dgender;
	}
	public String getSpecialist() {
		return specialist;
	}
	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}
	public List<Patient> getPatient() {
		return patient;
	}
	public void setPatient(List<Patient> patient) {
		this.patient = patient;
	}
	@Override
	public String toString() {
		return "Doctor [did=" + did + ", dname=" + dname + ", dage=" + dage + ", dgender=" + dgender + ", specialist="
				+ specialist + ", patient=" + patient + "]";
	}
	
	
}
