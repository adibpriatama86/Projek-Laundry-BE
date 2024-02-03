package com.example.laundrymanagement.service.Impl;

import com.example.laundrymanagement.entity.Karyawan;
import com.example.laundrymanagement.repository.KaryawanRepository;
import com.example.laundrymanagement.service.KaryawanService;
import jakarta.persistence.EntityNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class KaryawanServiceImpl implements KaryawanService {

    @Autowired
    private KaryawanRepository karyawanRepository;

    @Override
    public List<Karyawan> getAllKaryawans() {
        return karyawanRepository.findAll();
    }

    @Override
    public Karyawan getKaryawanById(Long id) {
        return karyawanRepository.findById(id).orElse(null);
    }

    @Override
    public Karyawan addKaryawan(Karyawan karyawan) {
        return karyawanRepository.save(karyawan);
    }

    @Override
    public Karyawan updateKaryawan(Long id, Karyawan karyawan) {
        karyawan.setId(id);
        return karyawanRepository.save(karyawan);
    }

    @Override
    public void deleteKaryawan(Long id) {
        karyawanRepository.deleteById(id);
    }
}
