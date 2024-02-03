package com.example.laundrymanagement.service;

import com.example.laundrymanagement.entity.Laundry;

import java.util.List;

public interface LaundryService {
    List<Laundry> getAllLaundries();
    Laundry getLaundryById(Long id);
    Laundry addLaundry(Laundry laundry);
    Laundry updateLaundry(Long id, Laundry laundry);
    void deleteLaundry(Long id);
}
