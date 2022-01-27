package com.search.admin.adapter;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.search.admin.infra.mapper")
public class SearchAdminAdapterApplication {

    public static void main(String[] args) {
        SpringApplication.run(SearchAdminAdapterApplication.class, args);
    }

}
