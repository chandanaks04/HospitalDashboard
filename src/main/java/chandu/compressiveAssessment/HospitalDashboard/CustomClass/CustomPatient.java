package chandu.compressiveAssessment.HospitalDashboard.CustomClass;





public class CustomPatient {
	
	private Long pid;
	private String pname;
	private Long page;
	private String visitedDoctor;
	private String date;
	private String docDes;
	public CustomPatient() {
		super();
	
	}
	public CustomPatient(Long pid, String pname, Long page, String visitedDoctor, String date, String docDes) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.page = page;
		this.visitedDoctor = visitedDoctor;
		this.date = date;
		this.docDes = docDes;
	}
	public Long getPid() {
		return pid;
	}
	public void setPid(Long pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Long getPage() {
		return page;
	}
	public void setPage(Long page) {
		this.page = page;
	}
	public String getVisitedDoctor() {
		return visitedDoctor;
	}
	public void setVisitedDoctor(String visitedDoctor) {
		this.visitedDoctor = visitedDoctor;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getDocDes() {
		return docDes;
	}
	public void setDocDes(String docDes) {
		this.docDes = docDes;
	}
	@Override
	public String toString() {
		return "CustomPatient [pid=" + pid + ", pname=" + pname + ", page=" + page + ", visitedDoctor=" + visitedDoctor
				+ ", date=" + date + ", docDes=" + docDes + "]";
	}
	
}
