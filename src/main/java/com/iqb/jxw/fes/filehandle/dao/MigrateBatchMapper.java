package com.iqb.jxw.fes.filehandle.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * Created by hdli on 2018-5-29.
 */
@Repository
public interface MigrateBatchMapper {

    void addDebtcgTmpBatch(List<Map<String,Object>> datas);

    void updateDebtcgTmpBailAcctNoBatch(@Param("mid") Long mid, @Param("version") Long version);
    void updateDebtByCgTmpBatch(@Param("mid") Long mid,@Param("version") Long version);
    List<Map<String,Serializable>> selectCountDebtcgFail(@Param("mid") Long mid);
    void deleteDebtTmpByMid(@Param("mid") Long mid);
}
