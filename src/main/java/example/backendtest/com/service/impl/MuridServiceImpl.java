package example.backendtest.com.service.impl;

import example.backendtest.com.model.Murid;
import example.backendtest.com.repository.MuridRepository;
import example.backendtest.com.service.MuridService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MuridServiceImpl implements MuridService {

    private final MuridRepository muridRepository;

    public MuridServiceImpl(MuridRepository muridRepository) {
        this.muridRepository = muridRepository;
    }

    @Override
    public void addMurid(Murid murid) {
        muridRepository.save(murid);
    }

    @Override
    public void updateMurid(Murid murid, int id) {
        Optional<Murid> muridOptional = muridRepository.findById(id);
        if (muridOptional.isPresent()) {
            muridRepository.save(murid);
        }
    }

    @Override
    public void deleteMurid(int id) {
        Optional<Murid> muridOptional = muridRepository.findById(id);
        muridOptional.ifPresent(muridRepository::delete);
    }

    @Override
    public List<Murid> getAllMurids() {
        return muridRepository.findAll();
    }

    @Override
    public Optional<Murid> getMuridById(int id) {
        return muridRepository.findById(id);
    }
}
