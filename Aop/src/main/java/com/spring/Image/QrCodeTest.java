package com.spring.Image;

import cn.hutool.core.io.FileUtil;
import cn.hutool.extra.qrcode.QrCodeUtil;
import cn.hutool.extra.qrcode.QrConfig;

import java.awt.*;

public class QrCodeTest {
    public static void main(String[] args) {
        QrConfig config = new QrConfig(400, 500);
// 设置边距，既二维码和背景之间的边距
        config.setMargin(3);
// 设置前景色，既二维码颜色（青色）
        config.setForeColor(Color.blue.getRGB());
// 设置背景色（灰色）
        config.setBackColor(Color.green.getRGB());

// 生成二维码到文件，也可以到流
        QrCodeUtil.generate("https://www.jianshu.com/u/bc4679feced3", config, FileUtil.file("D:/01.jpg"));
    }
}
