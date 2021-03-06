package com.spring.service.impl;

import com.spring.dao3.QcCorpustabMapper;
import com.spring.model.QcCorpustab;
import com.spring.model.QcCorpustabKey;
import com.spring.service.IQcCorpustabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("iQcCorpustabService")
public class IQcCorpustabServiceImpl implements IQcCorpustabService {

    @Autowired
    QcCorpustabMapper qcCorpustabMapper;

    @Override
    public List<Map<String,Object>> selectByPrimaryKey(QcCorpustabKey qcCorpustabKey) {
        return qcCorpustabMapper.queryBussinessPopStatisticTable();
    }
}
