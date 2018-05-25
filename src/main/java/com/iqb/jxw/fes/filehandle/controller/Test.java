package com.iqb.jxw.fes.filehandle.controller;

import com.iqb.jxw.fes.filehandle.entity.MigrateFile;
import com.iqb.jxw.fes.filehandle.service.MigrateFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

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
        List<MigrateFile> list = migrateFileService.findTodayTest();
        System.out.println(migrateFileService.findTodayTest());
//        System.out.println(migrateFileService.selectByPrimaryKey(118L));
        for (MigrateFile m: list){
            System.out.println("文件名："+m.getFilename());
        }

        return "SUCCESS";
    }

    @GetMapping(value = "/test/{sid}")
    public String testParams(@PathVariable("sid") Long sid){

        MigrateFile migrateFile = migrateFileService.selectByPrimaryKeyTest(sid);

        System.out.println("文件名："+migrateFile.getFilename());

        return "SUCCESS";
    }
}
