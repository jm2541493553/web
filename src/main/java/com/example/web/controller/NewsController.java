package com.example.web.controller;

import com.example.web.pojo.New;
import com.example.web.service.NewsService;
import com.example.web.vo.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "NewsManage")
@EnableAutoConfiguration
public class NewsController {
    @Autowired
    private NewsService newsService;
    @RequestMapping("/addNews")
    @ResponseBody
    public JsonResult addNews(String news_name,String news_context){
        if(news_name!=null&&news_context!=null){
            New news=new New();
            news.setNews_name(news_name);
            news.setNews_context(news_context);
            newsService.addNews(news);
            return new JsonResult("data","success",101);
        }else {
            return new JsonResult(null,"请输入内容或标题",102);
        }
    }
    @RequestMapping("/deleteNews")
    public JsonResult deleteNews(Integer news_id){
        if(news_id!=null){
            newsService.deleteNews(news_id);
            return new JsonResult("data","success",101);
        }else {
            return new JsonResult(null,"请输入内容或标题",102);
        }
    }
    @RequestMapping("/NewsDetail")
    public JsonResult NewsDetail(Integer news_id){
        if(news_id!=null){
            New news=newsService.NewsDetail(news_id);
            return new JsonResult(news);
        }else {
            return new JsonResult(null,"请输入内容或标题",102);
        }
    }
    @RequestMapping("/getNewsList")
    public JsonResult getNewsList() {
        List<New> newslist = newsService.getNewsList();
        if (newslist != null) {
            return new JsonResult(newslist);
        } else {
            return new JsonResult(null, "没有数据", 102);
        }
    }

        @RequestMapping("/updataNews")
        public JsonResult updataNews(Integer news_id,String news_name,String news_context){
            New news=new New();
            news.setNews_id(news_id);
            news.setNews_name(news_name);
            news.setNews_context(news_context);
            New news1=newsService.updataNews(news);
            JsonResult jsonResult =new JsonResult(news);
            return jsonResult;
        }

}
