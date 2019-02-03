package com.phoenix.ad.service;

import com.phoenix.ad.exception.AdException;
import com.phoenix.ad.vo.CreateUserRequest;
import com.phoenix.ad.vo.CreateUserResponse;

public interface IUserService {

    /**
     * <h2>创建用户</h2>
     * */
    CreateUserResponse createUser(CreateUserRequest request) throws AdException;
}
