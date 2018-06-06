package com.iqb.jxw.fes.filehandle.controller;

import com.iqb.jxw.fes.common.util.SpringBeanUtil;
import com.iqb.jxw.fes.filehandle.entity.Migratefile;
import com.iqb.jxw.fes.filehandle.service.MigrateFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * Created by hdli on 2018-5-21.
 */
@RestController
public class Test {
    @Autowired
    private MigrateFileService migrateFileService;

    @GetMapping(value = "/test")
    public String test(){
        List<Migratefile> list = migrateFileService.findTodayTest();
        System.out.println(migrateFileService.findTodayTest());
//        System.out.println(migrateFileService.selectByPrimaryKey(118L));
        for (Migratefile m: list){
            System.out.println("文件名："+m.getFilename());
        }

        return "SUCCESS";
    }

    @GetMapping(value = "/test/{sid}")
    public String testParams(@PathVariable("sid") Long sid){

        Migratefile migrateFile = migrateFileService.selectByPrimaryKeyTest(sid);

        System.out.println("文件名："+migrateFile.getFilename());

        return "SUCCESS";
    }

    @GetMapping(value = "/test2")
    public String test2(){

        ApplicationContext context = SpringBeanUtil.getApplicationContext();
        if (context == null){
            System.out.println("ApplicationContext is null");
        }

        return "SUCCESS";
    }

}
