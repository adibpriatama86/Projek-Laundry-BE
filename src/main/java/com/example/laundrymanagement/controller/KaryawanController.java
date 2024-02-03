package com.example.laundrymanagement.controller;

import com.example.laundrymanagement.entity.Karyawan;
import com.example.laundrymanagement.service.KaryawanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/karyawans")
public class KaryawanController {

    @Autowired
    private KaryawanService karyawanService;

    @PostMapping
    public Karyawan addKaryawan(@RequestBody Karyawan karyawan) throws Exception {
        return karyawanService.addKaryawan(karyawan);
    }

    @GetMapping
    public List<Karyawan> getAllKaryawans() {
        return karyawanService.getAllKaryawans();
    }

    @GetMapping("/{id}")
    public Karyawan getKaryawanById(@PathVariable Long id) {
        return karyawanService.getKaryawanById(id);
    }

    @PutMapping("/{id}")
    public Karyawan updateKaryawan(@PathVariable Long id, @RequestBody Karyawan karyawan) {
        return karyawanService.updateKaryawan(id, karyawan);
    }

    @DeleteMapping("/{id}")
    public void deleteKaryawan(@PathVariable Long id) {
        karyawanService.deleteKaryawan(id);
    }
}
