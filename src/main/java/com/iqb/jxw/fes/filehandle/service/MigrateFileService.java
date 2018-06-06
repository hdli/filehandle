package com.iqb.jxw.fes.filehandle.service;

import com.iqb.jxw.fes.filehandle.entity.Migratefile;

import java.util.List;

/**
 * Created by hdli on 2018-5-21.
 */
public interface MigrateFileService {

    List<Migratefile> findTodayTest();

    Migratefile selectByPrimaryKeyTest(Long sid);

    Integer saveMigratefile(Migratefile migratefile);

    Integer saveOnDuplicateMigrate(Migratefile migratefile);
}
