package com.example.laundrymanagement.repository;

import com.example.laundrymanagement.entity.Laundry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaundryRepository extends JpaRepository<Laundry, Long> {
}
