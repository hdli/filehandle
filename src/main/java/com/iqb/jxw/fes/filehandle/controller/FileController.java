package com.iqb.jxw.fes.filehandle.controller;

import com.iqb.jxw.fes.filehandle.service.MigrateFileService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

/**
 * Created by hdli on 2018-5-21.
 */
@RestController
@RequestMapping("/file")
public class FileController {
    private static Logger log = LoggerFactory.getLogger(FileController.class);

    @Autowired
    private MigrateFileService migrateFileService;

    @PostMapping(value = "/upload")
    public Map uploadfile(@RequestParam MultipartFile FILE, String instCode){
        log.info("文件处理，请求参数：{}",instCode);
        System.out.println(migrateFileService.findTodayTest());
        return null;
    }
}
