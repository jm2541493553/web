package com.example.web.service;

import com.example.web.pojo.New;

import java.util.List;

public interface NewsService {
    void addNews(New news);

    void deleteNews(Integer news_id);

    List<New> getNewsList();

    New updataNews(New news);

    New NewsDetail(Integer news_id);
}
