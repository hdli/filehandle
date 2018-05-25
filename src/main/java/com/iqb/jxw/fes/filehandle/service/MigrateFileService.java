package com.iqb.jxw.fes.filehandle.service;

import com.iqb.jxw.fes.filehandle.entity.MigrateFile;

import java.util.List;

/**
 * Created by hdli on 2018-5-21.
 */
public interface MigrateFileService {

    List<MigrateFile> findTodayTest();

    MigrateFile selectByPrimaryKeyTest(Long sid);
}
