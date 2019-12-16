package com.example.web.mapper;

import com.example.web.pojo.Notice;

import java.util.List;

public interface NoticeMapper {

    void addNotice(Notice notice);

    void deleteNotice(Integer notice_id);

    List<Notice> getNoticeList();

    Notice updataNotice(Notice notice);

    Notice NoticeDetail(Integer notice_id);
}
