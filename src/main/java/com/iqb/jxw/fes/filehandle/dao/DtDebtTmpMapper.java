package com.iqb.jxw.fes.filehandle.dao;


import com.iqb.jxw.fes.filehandle.entity.DtDebtTmp;
import org.springframework.stereotype.Repository;

@Repository
public interface DtDebtTmpMapper {
    int deleteByPrimaryKey(Long sid);

    int insert(DtDebtTmp record);

    int insertSelective(DtDebtTmp record);

    DtDebtTmp selectByPrimaryKey(Long sid);

    int updateByPrimaryKeySelective(DtDebtTmp record);

    int updateByPrimaryKey(DtDebtTmp record);
}