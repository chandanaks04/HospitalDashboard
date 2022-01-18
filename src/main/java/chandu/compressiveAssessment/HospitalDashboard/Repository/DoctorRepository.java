package chandu.compressiveAssessment.HospitalDashboard.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import chandu.compressiveAssessment.HospitalDashboard.Entity.Doctor;
@Repository
public interface DoctorRepository  extends JpaRepository<Doctor,Long> {

	public Doctor findByDid(Long did);

	public Doctor findByDname(String name);	

}
