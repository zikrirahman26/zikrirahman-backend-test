package example.backendtest.com.service;

import example.backendtest.com.model.Murid;

import java.util.List;
import java.util.Optional;

public interface MuridService {

    void addMurid(Murid murid);

    void updateMurid(Murid murid, int id);

    void deleteMurid(int id);

    List<Murid> getAllMurids();

    Optional<Murid> getMuridById(int id);
}
