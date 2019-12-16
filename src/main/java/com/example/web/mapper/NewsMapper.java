package com.example.web.mapper;

import com.example.web.pojo.New;

import java.util.List;

public interface NewsMapper {
    void addNews(New news);

    void deleteNews(Integer news_id);

    List<New> getNewsList();

    New updataNews(New news);

    New NewsDetail(Integer news_id);
}
