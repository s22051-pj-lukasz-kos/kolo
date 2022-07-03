package pl.pjatk.kos.jazs22051nbp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.pjatk.kos.jazs22051nbp.model.WalutaResponse;


@Repository
public class NbpRepository extends JpaRepository<WalutaResponse, Long> {


}
