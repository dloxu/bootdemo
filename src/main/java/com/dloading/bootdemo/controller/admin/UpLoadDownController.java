package com.dloading.bootdemo.controller.admin;

import com.dloading.bootdemo.model.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Dloading
 * @since 2019/12/18
 *
 * 文件下载上传控制器
 */
@RestController
public class UpLoadDownController {


    /**
     * 上传文件（图片）
     * @param picture
     * @param request
     * @return
     */
    @RequestMapping("/upload")
    public Result upload(@RequestParam("picture") MultipartFile picture, HttpServletRequest request){

        //获取文件存储位置
        String path=request.getSession().getServletContext().getRealPath("/Upload");
        System.out.println("文件存储位置："+path);
        File filePath=new File(path);

        //存储位置不存在,创建存储目录
        if (!filePath.exists()&&!filePath.isDirectory()){
            filePath.mkdir();
        }

        //获取原始文件名称
        String originalFileName=picture.getOriginalFilename();
        System.out.println("文件原始名称："+originalFileName);
        //获取文件类型
        String type=originalFileName.substring(originalFileName.lastIndexOf(".")+1);
        System.out.println("获取文件类型："+type);
        //获取文件名称
        String fileName=originalFileName.substring(0,originalFileName.lastIndexOf("."));
        System.out.println("获取文件名称:"+fileName);
        //设置文件新名称,当前时间+文件名称
        Date date=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddHHmmss");
        String nowdate=sdf.format(date);

        String fileEndName=nowdate+fileName+"."+type;
        System.out.println("获取文件新名称:"+fileEndName);
        //指定路径下创建一个文件
        File targetFilePath=new File(path,fileEndName);

        try {
            picture.transferTo(targetFilePath);
            System.out.println("上传成功");
            return new Result(true,"/Upload/"+fileEndName);
        } catch (IOException e) {
            System.out.println("上传失败");
            e.printStackTrace();
            return new Result(false,"上传失败");
        }
    }
}
