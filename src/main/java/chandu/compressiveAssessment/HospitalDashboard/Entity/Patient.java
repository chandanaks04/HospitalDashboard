package chandu.compressiveAssessment.HospitalDashboard.Entity;



import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="patient")
public class Patient {
	@Id
	private Long pid;
	private String pname;
	private Long page;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="visitedDoctor",referencedColumnName="dname")
	private Doctor doctor;
	private String date;
	private String docDes;
	
	public Patient() {
		super();
	}

	public Patient(Long pid, String pname, Long page, Doctor doctor, String date, String docDes) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.page = page;
		this.doctor = doctor;
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

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
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
		return "Patient [pid=" + pid + ", pname=" + pname + ", page=" + page + ", doctor=" + doctor + ", date=" + date
				+ ", docDes=" + docDes + "]";
	}

	
	
}
