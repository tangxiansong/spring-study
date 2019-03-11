package com.spring.Image;

        import cn.hutool.core.util.ImageUtil;
        import org.aspectj.lang.annotation.AfterReturning;
        import org.aspectj.lang.annotation.Aspect;
        import org.aspectj.lang.annotation.Before;
        import org.aspectj.lang.annotation.Pointcut;
        import org.slf4j.Logger;
        import org.slf4j.LoggerFactory;

        import java.awt.*;
        import java.io.File;
@Aspect
public class ImageHandler {
    private static final Logger logger= LoggerFactory.getLogger(ImageHandler.class);
    @Pointcut("execution(* com.spring.Image.ImageCopy.copyImage())")
    public void handleImage(){

    }
    @Before(value = "handleImage()")
    public void pressTextOnImage(){
        logger.info("开始给图片添加水印");
        File srcFile = new File("D:/bg.jpg");
        File destFile = new File("D:/bg1.jpg");
        Color color = new Color(211,71,38);
        Font font = new Font("微软雅黑",Font.BOLD,10);
        ImageUtil.pressText(srcFile,destFile,"Spring AOP水印",color,font,40,80,1.0f);
    }
    @AfterReturning("handleImage()")
    public void grayImage(){
        logger.info("开始将图片转成黑白");
        File srcFile = new File("E:/bg1.jpg");
        File destFile = new File("E:/bg2.jpg");
        ImageUtil.gray(srcFile,destFile);
    }
}
