package com.example.laundrymanagement.repository;

import com.example.laundrymanagement.entity.Karyawan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KaryawanRepository extends JpaRepository<Karyawan, Long> {
}
