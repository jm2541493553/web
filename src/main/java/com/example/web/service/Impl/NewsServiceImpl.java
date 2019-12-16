package com.example.web.service.Impl;

import com.example.web.mapper.NewsMapper;
import com.example.web.pojo.New;
import com.example.web.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsServiceImpl implements NewsService {
    @Autowired
    private NewsMapper newsMapper;
    @Override
    public void addNews(New news) {
        newsMapper.addNews(news);
    }

    @Override
    public void deleteNews(Integer news_id) {
        newsMapper.deleteNews(news_id);
    }

    @Override
    public List<New> getNewsList() {
        return newsMapper.getNewsList();
    }

    @Override
    public New updataNews(New news) {
        return newsMapper.updataNews(news);
    }

    @Override
    public New NewsDetail(Integer news_id) {
        return newsMapper.NewsDetail(news_id);
    }
}
