package com.iqb.jxw.fes.filehandle.service.impl;

import com.iqb.jxw.fes.filehandle.common.utils.DateTools;
import com.iqb.jxw.fes.filehandle.dao.MigrateFileMapper;
import com.iqb.jxw.fes.filehandle.entity.MigrateFile;
import com.iqb.jxw.fes.filehandle.service.MigrateFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by hdli on 2018-5-21.
 */
@Service
public class MigrateFileServiceImpl implements MigrateFileService {
    @Autowired
    private MigrateFileMapper migrateFileMapper;

    @Override
    public List<MigrateFile> findTodayTest() {

        return migrateFileMapper.findToday(DateTools.getYTD_DATE(new Date()));
    }

    @Override
    public MigrateFile selectByPrimaryKeyTest(Long sid) {
        return migrateFileMapper.selectByPrimaryKey(sid);
    }
}
