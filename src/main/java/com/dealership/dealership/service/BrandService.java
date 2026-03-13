package com.dealership.dealership.service;

import com.dealership.dealership.entity.Brand;
import org.springframework.stereotype.Service;
import com.dealership.dealership.repository.BrandRepository;
import java.util.List;

@Service
public class BrandService {
    private final BrandRepository brandRepository;

    public BrandService(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }
    public List<Brand> findAllBrands() {
        return brandRepository.findAll();
    }

}
