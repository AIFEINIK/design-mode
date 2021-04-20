package org.example;

import org.example.service.AbstractVipMusicDownload;
import org.example.service.WyMusic;
import org.junit.Test;

/**
 * @author ZhangPengFei
 * @discription
 */
public class DownloadTest {

    @Test
    public void execute() {
        AbstractVipMusicDownload download = new WyMusic();
        download.doDownload("15000000000", "123456");
    }
}
