package com.iqb.jxw.fes.filehandle.dao;


import com.iqb.jxw.fes.filehandle.entity.MigrateFile;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MigrateFileMapper {
    int deleteByPrimaryKey(Long sid);

    int insert(MigrateFile record);

    int insertSelective(MigrateFile record);

    MigrateFile selectByPrimaryKey(Long sid);

    int updateByPrimaryKeySelective(MigrateFile record);

    int updateByPrimaryKeyWithBLOBs(MigrateFile record);

    int updateByPrimaryKey(MigrateFile record);

    List<MigrateFile> findToday(@Param("date") String date);
}