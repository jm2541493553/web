package com.example.web.service.Impl;

import com.example.web.mapper.NoticeMapper;
import com.example.web.pojo.Notice;
import com.example.web.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoticeServiceImpl implements NoticeService {
    @Autowired
    private NoticeMapper noticeMapper;
    @Override
    public void addNotice(Notice notice) {
        noticeMapper.addNotice(notice);
    }

    @Override
    public void deleteNotice(Integer notice_id) {
        noticeMapper.deleteNotice(notice_id);
    }

    @Override
    public List<Notice> getNoticesList() {
        return noticeMapper.getNoticeList();
    }

    @Override
    public Notice updataNotice(Notice notice) {
        return noticeMapper.updataNotice(notice);
    }

    @Override
    public Notice NoticeDetail(Integer notice_id) {
        return noticeMapper.NoticeDetail(notice_id);
    }

}
