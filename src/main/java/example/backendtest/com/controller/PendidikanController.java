package example.backendtest.com.controller;

import example.backendtest.com.model.Pendidikan;
import example.backendtest.com.service.PendidikanService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pendidikan")
public class PendidikanController {

    private final PendidikanService pendidikanService;

    public PendidikanController(PendidikanService pendidikanService) {
        this.pendidikanService = pendidikanService;
    }

    @PostMapping("/{id_murid}")
    public ResponseEntity<String> addPendidikan(@RequestBody Pendidikan pendidikan, @PathVariable int id_murid) {
        pendidikanService.addPendidikan(pendidikan, id_murid);
        return ResponseEntity.ok("Pendidikan " + id_murid + " added");
    }
}
