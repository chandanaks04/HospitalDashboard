package chandu.compressiveAssessment.HospitalDashboard.CustomClass;

public class CustomDoctor {
	private Long did;
	private String dname;
	private Long dage;
	private String dgender;
	private String specialist;
	private int visitedNoPatient;
	public CustomDoctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CustomDoctor(Long did, String dname, Long dage, String dgender, String specialist, int visitedNoPatient) {
		super();
		this.did = did;
		this.dname = dname;
		this.dage = dage;
		this.dgender = dgender;
		this.specialist = specialist;
		this.visitedNoPatient = visitedNoPatient;
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
	public int getVisitedNoPatient() {
		return visitedNoPatient;
	}
	public void setVisitedNoPatient(int visitedNoPatient) {
		this.visitedNoPatient = visitedNoPatient;
	}
	@Override
	public String toString() {
		return "CustomDoctor [did=" + did + ", dname=" + dname + ", dage=" + dage + ", dgender=" + dgender
				+ ", Specialist=" + specialist + ", visitedNoPatient=" + visitedNoPatient + "]";
	}
	
}
