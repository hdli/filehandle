package com.iqb.jxw.fes.filehandle.controller;

import com.iqb.jxw.fes.filehandle.dto.AjaxResponse;
import com.iqb.jxw.fes.filehandle.dto.RequestMap;
import com.iqb.jxw.fes.filehandle.entity.Migratefile;
import com.iqb.jxw.fes.filehandle.service.MigrateFileService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Created by hdli on 2018-6-1.
 */
@Controller
@RequestMapping("/migrate")
public class MigrateController {
    private static Logger log = LoggerFactory.getLogger(MigrateController.class);

    @Autowired
    private MigrateFileService migrateFileService;

    @PostMapping(value = "/upload")
    public ModelAndView paseFile(@ModelAttribute RequestMap requestMap) throws IOException {
        log.info("开始文件上传:{}",requestMap.getExecuteId());
        String instCode = requestMap.getInstCode();
        log.info("{}上传结果文件：{}",instCode,requestMap.getResultFileName());

        MultipartFile respFile = requestMap.getResultfile();
        respFile.transferTo(new File("D:/a.txt"));

        log.info("请求参数："+requestMap.toString());

        ModelAndView modelAndView = new ModelAndView("/batchfile/SUCCESS");

        return modelAndView;
    }

    @PostMapping(value = "/query")
    @ResponseBody
    public AjaxResponse<List<Migratefile>> query(@RequestBody Map<String,Object> map){
        log.info("查询请求报文："+map.toString());

        List<Migratefile> migratefiles = migrateFileService.findTodayTest();

        return new AjaxResponse<List<Migratefile>>(migratefiles,2,true);
    }
}
