package pl.pjatk.kos.jazs22051nbp.service;


import org.springframework.stereotype.Service;
import pl.pjatk.kos.jazs22051nbp.Repository.NbpRepository;
import pl.pjatk.kos.jazs22051nbp.model.Waluta;
import pl.pjatk.kos.jazs22051nbp.model.WalutaResponse;

import java.time.LocalDate;

@Service
public class NbpService {


    private final NbpRepository nbpRepository;

    public NbpService(NbpRepository nbpRepository) {
        this.nbpRepository = nbpRepository;
    }

    public Waluta getWaluta(String waluta, Integer last) {
        LocalDate from = LocalDate.now().minusDays(last);
        LocalDate to = LocalDate.now();
        WalutaResponse res =
    }
}
