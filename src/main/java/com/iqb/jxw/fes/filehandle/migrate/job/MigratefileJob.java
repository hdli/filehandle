package com.iqb.jxw.fes.filehandle.migrate.job;


import com.iqb.jxw.fes.filehandle.entity.Migratefile;

import java.io.UnsupportedEncodingException;
import java.util.List;

/**
 * Created by hdli on 2018-5-30.
 */
public interface MigratefileJob<I,O,R> {
    public boolean begin(Migratefile migratefile);
    public I parse(int index,String line,String resLine,Migratefile migratefile) throws UnsupportedEncodingException;
    public O execute(List<I> results, Migratefile migratefile);
    public R end(int count,Migratefile migratefile);
    public Integer getKey();
}
