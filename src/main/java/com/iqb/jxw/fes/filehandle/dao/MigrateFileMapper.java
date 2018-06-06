package com.iqb.jxw.fes.filehandle.dao;


import com.iqb.jxw.fes.filehandle.entity.Migratefile;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MigrateFileMapper {
    int deleteByPrimaryKey(Long sid);

    int insert(Migratefile record);

    int insertSelective(Migratefile record);

    Migratefile selectByPrimaryKey(Long sid);

    int updateByPrimaryKeySelective(Migratefile record);

    int updateByPrimaryKeyWithBLOBs(Migratefile record);

    int updateByPrimaryKey(Migratefile record);

    List<Migratefile> findToday(@Param("date") String date);

    int insertOnDuplicate(Migratefile record);
}