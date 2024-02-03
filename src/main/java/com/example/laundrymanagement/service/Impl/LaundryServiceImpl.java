package com.example.laundrymanagement.service.Impl;

import com.example.laundrymanagement.entity.Laundry;
import com.example.laundrymanagement.repository.LaundryRepository;
import com.example.laundrymanagement.service.LaundryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class LaundryServiceImpl implements LaundryService {

    @Autowired
    private LaundryRepository laundryRepository;

    @Override
    public List<Laundry> getAllLaundries() {
        return laundryRepository.findAll();
    }

    @Override
    public Laundry getLaundryById(Long id) {
        return laundryRepository.findById(id).orElse(null);
    }

    @Override
    public Laundry addLaundry(Laundry laundry) {
        return laundryRepository.save(laundry);
    }

    @Override
    public Laundry updateLaundry(Long id, Laundry laundry) {
        laundry.setId(id);
        return laundryRepository.save(laundry);
    }

    @Override
    public void deleteLaundry(Long id) {
        laundryRepository.deleteById(id);
    }
}
