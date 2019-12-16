package com.example.web.utils;

import com.example.web.vo.JsonResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 文件上传工具类
 */
@Controller
public class FileUploadUtil {

    private static String UPLOAD_PATH = "src/main/resources/static/Img";

    //上传图片
    @RequestMapping(value = "/uploadImage", method = RequestMethod.POST)
    @ResponseBody
    public JsonResult uploadImage(MultipartFile image) {
        try {
            String name = image.getOriginalFilename();

            System.out.println(name);

            InputStream inputStream = image.getInputStream();
            Path directory = Paths.get(UPLOAD_PATH);
            if (!Files.exists(directory)) {
                Files.createDirectories(directory);
            }
            long copy = Files.copy(inputStream, directory.resolve(name));
            JsonResult jsonResult =new JsonResult(UPLOAD_PATH+"/"+name,"saas",101);

            return jsonResult;

        } catch (Exception e) {
            return new JsonResult("null","上传失败",102);
        }
    }
}
