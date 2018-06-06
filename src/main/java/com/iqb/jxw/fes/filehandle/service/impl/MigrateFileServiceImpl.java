package com.iqb.jxw.fes.filehandle.service.impl;

import com.iqb.jxw.fes.common.util.DateTools;
import com.iqb.jxw.fes.filehandle.dao.MigrateFileMapper;
import com.iqb.jxw.fes.filehandle.entity.Migratefile;
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

    /**
     * 获取今天文件处理的任务
     * @return
     */
    @Override
    public List<Migratefile> findTodayTest() {

        return migrateFileMapper.findToday(DateTools.getYTD_DATE(new Date()));
    }

    @Override
    public Migratefile selectByPrimaryKeyTest(Long sid) {
        return migrateFileMapper.selectByPrimaryKey(sid);
    }

    @Override
    public Integer saveMigratefile(Migratefile migratefile) {

        return migrateFileMapper.insert(migratefile);
    }

    /**
     * 保存上传文件的任务记录，若migratefile表已经存在这更新文件记录状态
     * @param migratefile
     * @return
     */
    @Override
    public Integer saveOnDuplicateMigrate(Migratefile migratefile) {

        return migrateFileMapper.insertOnDuplicate(migratefile);
    }
}
