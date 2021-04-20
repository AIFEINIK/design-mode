package org.example.service;

import java.io.File;

/**
 * @author ZhangPengFei
 * @discription
 */
public class QQMusic extends AbstractVipMusicDownload {

    @Override
    public boolean login(String account, String pwd) {
        System.out.println("QQ音乐平台登录成功");
        return true;
    }

    @Override
    public File download() {
        System.out.println("QQ音乐平台歌曲下载完成");
        return null;
    }

    @Override
    public File decodeFile(File file) {
        System.out.println("QQ音乐平台歌曲解码完成");
        return null;
    }
}
