package org.example.service;

import java.io.File;

/**
 * @author ZhangPengFei
 * @discription 抽象下载类
 */
public abstract class AbstractVipMusicDownload {

    public String doDownload(String account, String pwd) {
        if (login(account, pwd)) {
            File download = download();
            File file = decodeFile(download);
            return "success";
        }
        return null;
    }

    /**
     * 登录
     * @param account
     * @param pwd
     * @return
     */
    public abstract boolean login(String account, String pwd);

    /**
     * 下载
     * @return
     */
    public abstract File download();

    /**
     * 文件解码
     * @param file
     * @return
     */
    public abstract File decodeFile(File file);

}
