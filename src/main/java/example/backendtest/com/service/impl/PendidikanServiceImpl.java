package example.backendtest.com.service.impl;

import example.backendtest.com.model.Murid;
import example.backendtest.com.model.Pendidikan;
import example.backendtest.com.repository.MuridRepository;
import example.backendtest.com.repository.PendidikanRepository;
import example.backendtest.com.service.PendidikanService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PendidikanServiceImpl implements PendidikanService {

    private final PendidikanRepository pendidikanRepository;
    private final MuridRepository muridRepository;

    public PendidikanServiceImpl(PendidikanRepository pendidikanRepository, MuridRepository muridRepository) {
        this.pendidikanRepository = pendidikanRepository;
        this.muridRepository = muridRepository;
    }

    @Override
    public void addPendidikan(Pendidikan pendidikan, int id_murid) {
        Optional<Murid> murid = muridRepository.findById(id_murid);
        if (murid.isPresent()) {
            System.out.println(murid.get());
            pendidikan.setIdMurid(murid.get().getId());
            pendidikanRepository.save(pendidikan);
        }
    }
}
