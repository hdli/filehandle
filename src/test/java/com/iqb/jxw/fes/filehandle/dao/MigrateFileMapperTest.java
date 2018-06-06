package com.iqb.jxw.fes.filehandle.dao;

import com.iqb.jxw.fes.BaseTest;
import com.iqb.jxw.fes.filehandle.entity.Migratefile;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * Created by hdli on 2018-6-1.
 */
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring的配置文件
@ContextConfiguration({"classpath:res/app/spring/spring-data.xml"})
public class MigrateFileMapperTest {

    @Autowired
    private MigrateFileMapper migrateFileMapper;

    @Test
    public void deleteByPrimaryKey() {
    }

    @Test
    public void insertSelective() {
        Migratefile migratefile = new Migratefile();
        migratefile.setInstcode("00220001");
        migratefile.setFilename("aaaaaaaaaaaaaaaaa");
        migratefile.setState("A");
        migratefile.setTims(new Date());
        migratefile.setType("7");

        int i = migrateFileMapper.insertSelective(migratefile);
        System.out.println("执行影响行数："+i);
        System.out.println("返回主键sid:"+migratefile.getSid());

    }

    @Test
    public void selectByPrimaryKey() {
    }

    @Test
    public void updateByPrimaryKeySelective() {
    }

    @Test
    public void updateByPrimaryKeyWithBLOBs() {
    }

    @Test
    public void updateByPrimaryKey() {
    }

    @Test
    public void findToday() {
    }

    @Test
    public void insertOnDuplicate(){
        Migratefile migratefile = new Migratefile();
        migratefile.setInstcode("00220001");
        migratefile.setFilename("bbbbbbbbbbbbbb");
        migratefile.setState("F");
        migratefile.setTims(new Date());
        migratefile.setType("7");
        int i = migrateFileMapper.insertOnDuplicate(migratefile);
        System.out.println("执行影响行数："+i);
        System.out.println("返回主键sid:"+migratefile.getSid());
    }
}