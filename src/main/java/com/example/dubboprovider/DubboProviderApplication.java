package com.example.dubboprovider;

import com.example.dubboprovider.service.ProviderService;
import com.example.dubboprovider.service.ProviderServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class DubboProviderApplication {

    public static void main(String[] args) throws IOException {

        //加载xml配置文件启动
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/provider.xml");
        context.start();
        System.in.read(); // 按任意键退出
    }

}
