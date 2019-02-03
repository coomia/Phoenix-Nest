package com.phoenix.ad.service;

import com.phoenix.ad.vo.CreativeRequest;
import com.phoenix.ad.vo.CreativeResponse;

public interface ICreativeService {

    CreativeResponse createCreative(CreativeRequest request);
}
