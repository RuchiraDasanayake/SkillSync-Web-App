package BackEnd.repository;

import BackEnd.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface ClientVRepository extends JpaRepository<Client, Long> {
    Optional<Client> findByUserName(String userName);
}