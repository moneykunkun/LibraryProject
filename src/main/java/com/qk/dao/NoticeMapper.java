package com.qk.dao;

import com.qk.entity.Notice;

import java.util.List;

public interface NoticeMapper {

    int deleteByPrimaryKey(Integer id);


    int insert(Notice record);


    int insertSelective(Notice record);


    Notice selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Notice record);


    int updateByPrimaryKey(Notice record);


    List<Notice> queryNoticeAll(Notice notice);

}