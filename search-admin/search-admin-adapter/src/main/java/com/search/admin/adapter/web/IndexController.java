package com.search.admin.adapter.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class IndexController {

    /**
     * 单个索引新增
     * @return
     */
    @PostMapping(value = "/create/index")
    public String createIndex(){
        return "ok";
    }

    /**
     * 单个索引修改
     * @return
     */
    @PostMapping(value = "/update/index")
    public String updateIndex(){
        return "ok";
    }

    /**
     * 单个索引删除
     * @return
     */
    @PostMapping(value = "/delete/index")
    public String deleteIndex(){
        return "ok";
    }

    /**
     * 查询单个索引信息
     * @return
     */
    @GetMapping(value = "/get/index")
    public String getIndex(){
        return "ok";
    }

    /**
     * 查询所有索引信息
     * @return
     */
    @GetMapping(value = "/get/indexes")
    public String getIndexes(){
        return "ok";
    }
}
