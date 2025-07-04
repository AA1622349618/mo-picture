package com.momo.yupicturebackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@MapperScan("com.momo.yupicturebackend.mapper")
@EnableAspectJAutoProxy(exposeProxy = true)
public class MoMoctureBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(MoMoctureBackendApplication.class, args);
    }

}
