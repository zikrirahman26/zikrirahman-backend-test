package example.backendtest.com.repository;

import example.backendtest.com.model.Pendidikan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PendidikanRepository extends JpaRepository<Pendidikan, Integer> {
}
