package com.example.laundrymanagement.service;

import com.example.laundrymanagement.entity.Karyawan;

import java.util.List;

public interface KaryawanService {
    List<Karyawan> getAllKaryawans();
    Karyawan getKaryawanById(Long id);
    Karyawan addKaryawan(Karyawan karyawan) throws Exception;
    Karyawan updateKaryawan(Long id, Karyawan karyawan);
    void deleteKaryawan(Long id);
}
