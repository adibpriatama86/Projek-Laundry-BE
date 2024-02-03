package com.example.laundrymanagement.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Laundry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nama;
    private String tanggalMasuk;
    private String tanggalKeluar;
    private String jenisLaundry;
    private String tipeLaundry;
    private String hargaPerKG;
    private String berat;
    private String totalHarga;
}
