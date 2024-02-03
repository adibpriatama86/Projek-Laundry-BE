package com.example.laundrymanagement.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Karyawan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String nama;
    private String tanggalLahir;
    private String jenisKelamin;
    private String alamat;
    private String email;
    private String password;
    private String confirmPassword;
}
