package chandu.compressiveAssessment.HospitalDashboard.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import chandu.compressiveAssessment.HospitalDashboard.Entity.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient,Long>{

	 public Patient findByPid(Long pid);

}
