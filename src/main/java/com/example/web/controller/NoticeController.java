package com.example.web.controller;

import com.example.web.pojo.New;
import com.example.web.pojo.Notice;
import com.example.web.service.NewsService;
import com.example.web.service.NoticeService;
import com.example.web.vo.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "NoticeManage")
@EnableAutoConfiguration
public class NoticeController {
    @Autowired
    private NoticeService noticeService;
    @RequestMapping("/addNotice")
    @ResponseBody
    public JsonResult addNotice(String notice_name, String notice_context){
        if(notice_name!=null&&notice_context!=null){
            Notice notice=new Notice();
            notice.setNotice_name(notice_name);
            notice.setNotice_context(notice_context);
            noticeService.addNotice(notice);
            return new JsonResult("data","success",101);
        }else {
            return new JsonResult(null,"请输入内容或标题",102);
        }
    }
    @RequestMapping("/deleteNotice")
    public JsonResult deleteNews(Integer notice_id){
        if(notice_id!=null){
            noticeService.deleteNotice(notice_id);
            return new JsonResult("data","success",101);
        }else {
            return new JsonResult(null,"请输入内容或标题",102);
        }
    }
    @RequestMapping("/NoticeDetail")
    public JsonResult NoticeDetail(Integer notice_id){
        if(notice_id!=null){
           Notice notice= noticeService.NoticeDetail(notice_id);
            return new JsonResult(notice);
        }else {
            return new JsonResult(null,"请输入内容或标题",102);
        }
    }
    @RequestMapping("/getNoticesList")
    public JsonResult getNoticeList(){
        List<Notice> noticelist=noticeService.getNoticesList();
        if (noticelist!=null){
            return new JsonResult(noticelist);
        }else {
            return new JsonResult(null,"没有数据",102);
        }
    }
    @RequestMapping("/updataNotice")
    public JsonResult updataNotice(Integer notice_id,String notice_name,String notice_context){
        Notice notice=new Notice();
        notice.setNotice_id(notice_id);
        notice.setNotice_name(notice_name);
        notice.setNotice_context(notice_context);
        Notice notice1=noticeService.updataNotice(notice);
        JsonResult jsonResult =new JsonResult(notice);
        return jsonResult;
    }
}
