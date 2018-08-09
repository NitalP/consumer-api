package com.cars.consumer.service.impl;

import com.cars.consumer.bo.Core;
import com.cars.consumer.repository.CoreRepository;
import com.cars.consumer.service.PdidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PdidServiceImpl implements PdidService {

    @Autowired
    private CoreRepository coreRepository;

    @Override
    public Core getByPdid(String pdid) {
        UUID pdidUuid = UUID.fromString(pdid);

        return coreRepository.findById(pdidUuid).orElse(null);
    }
}
