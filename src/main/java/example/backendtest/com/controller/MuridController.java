package example.backendtest.com.controller;

import example.backendtest.com.model.Murid;
import example.backendtest.com.service.MuridService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/murid")
public class MuridController {

    //Test

    private final MuridService muridService;

    public MuridController(MuridService muridService) {
        this.muridService = muridService;
    }

    @GetMapping
    public ResponseEntity<List<Murid>> getAllMurids() {
        List<Murid> murids = muridService.getAllMurids();
        return ResponseEntity.ok(murids);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Murid>> getMuridById(@PathVariable int id) {
        Optional<Murid> optionalMurid = muridService.getMuridById(id);
        return ResponseEntity.ok(optionalMurid);
    }

    @PostMapping
    public ResponseEntity<String> addMurid(@RequestBody Murid murid) {
        muridService.addMurid(murid);
        return ResponseEntity.ok("Murid added");
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateMurid(@RequestBody Murid murid, @PathVariable int id) {
        muridService.updateMurid(murid, id);
        return ResponseEntity.ok("Murid updated");
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteMurid(@PathVariable int id) {
        muridService.deleteMurid(id);
        return ResponseEntity.ok("Murid deleted");
    }
}
