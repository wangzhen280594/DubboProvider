package com.example.dubboprovider.service.annotation;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.dubboprovider.service.ProviderService;


@Service
public class ProviderServiceImplAnnotation implements ProviderService {
    public String SayHello(String name) {
        String message=name+"你好不好";
        return message;
    }
}
