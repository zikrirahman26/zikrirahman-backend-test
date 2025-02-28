package example.backendtest.com.repository;

import example.backendtest.com.model.Murid;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MuridRepository extends JpaRepository<Murid, Integer> {
}
