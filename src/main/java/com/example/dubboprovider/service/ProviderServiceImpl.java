package com.example.dubboprovider.service;

public class ProviderServiceImpl implements ProviderService {
    public String SayHello(String name) {
            String message=name+"你好啊！";
            return message;
    }
}
