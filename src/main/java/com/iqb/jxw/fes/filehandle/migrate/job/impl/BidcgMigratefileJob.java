package com.iqb.jxw.fes.filehandle.migrate.job.impl;

import com.iqb.jxw.fes.filehandle.dto.ResultMap;
import com.iqb.jxw.fes.filehandle.entity.Migratefile;
import com.iqb.jxw.fes.filehandle.migrate.job.MigratefileJob;

import org.springframework.stereotype.Component;

import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;

/**
 * Created by hdli on 2018-5-30.
 */
@Component
public class BidcgMigratefileJob implements MigratefileJob<Map<String,Object>,Future<Boolean>,ResultMap> {

    @Override
    public boolean begin(Migratefile migratefile) {
        return true;
    }

    @Override
    public Map<String, Object> parse(int index, String line, String resLine, Migratefile migratefile) throws UnsupportedEncodingException {
        return null;
    }

    @Override
    public Future<Boolean> execute(List<Map<String, Object>> results, Migratefile migratefile) {
        return null;
    }

    @Override
    public ResultMap end(int count, Migratefile migratefile) {
        return null;
    }

    @Override
    public Integer getKey() {
        return null;
    }
}
