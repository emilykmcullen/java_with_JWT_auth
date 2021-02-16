package com.example.userManagement.service;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class LoginAttemptService {

    private static final int MAXIMUM_NUMBER_OF_ATTEMPTS = 5;
    private static final int ATTEMPT_INCREMENT = 1;
    private LoadingCache<String, Integer> loginAttemptCache;

    public LoginAttemptService(){
        super();
        loginAttemptCache = CacheBuilder.newBuilder().expireAfterWrite(15, TimeUnit.MINUTES)
                .maximumSize(100).build(new CacheLoader<String, Integer>() {
                    @Override
                    public Integer load(String key) throws Exception {
                        return 0;
                    }
                });
    }

}
