package com.phoenix.ad.service.impl;

import com.phoenix.ad.dao.CreativeRepository;
import com.phoenix.ad.entity.Creative;
import com.phoenix.ad.service.ICreativeService;
import com.phoenix.ad.vo.CreativeRequest;
import com.phoenix.ad.vo.CreativeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreativeServiceImpl implements ICreativeService {

    private final CreativeRepository creativeRepository;

    @Autowired
    public CreativeServiceImpl(CreativeRepository creativeRepository) {
        this.creativeRepository = creativeRepository;
    }

    @Override
    public CreativeResponse createCreative(CreativeRequest request) {

        Creative creative = creativeRepository.save(
                request.convertToEntity()
        );

        return new CreativeResponse(creative.getId(), creative.getName());
    }
}
