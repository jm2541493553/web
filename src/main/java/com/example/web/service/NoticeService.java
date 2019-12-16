package com.example.web.service;

import com.example.web.pojo.Notice;

import java.util.List;

public interface NoticeService {
    void addNotice(Notice notice);

    void deleteNotice(Integer notice_id);

    List<Notice> getNoticesList();

    Notice updataNotice(Notice notice);

    Notice NoticeDetail(Integer notice_id);
}
