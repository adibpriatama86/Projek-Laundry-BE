package com.example.laundrymanagement.controller;

import com.example.laundrymanagement.entity.Laundry;
import com.example.laundrymanagement.service.LaundryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/laundries")
public class LaundryController {

    @Autowired
    private LaundryService laundryService;

    @PostMapping
    public Laundry addLaundry(@RequestBody Laundry laundry) {
        return laundryService.addLaundry(laundry);
    }

    @GetMapping
    public List<Laundry> getAllLaundries() {
        return laundryService.getAllLaundries();
    }

    @GetMapping("/{id}")
    public Laundry getLaundryById(@PathVariable Long id) {
        return laundryService.getLaundryById(id);
    }

    @PutMapping("/{id}")
    public Laundry updateLaundry(@PathVariable Long id, @RequestBody Laundry laundry) {
        return laundryService.updateLaundry(id, laundry);
    }

    @DeleteMapping("/{id}")
    public void deleteLaundry(@PathVariable Long id) {
        laundryService.deleteLaundry(id);
    }
}
