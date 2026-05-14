package unicesumar.springsecurity.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import unicesumar.springsecurity.models.JobModel;

import java.util.UUID;

public interface JobRepository extends JpaRepository<JobModel, UUID> {
}
