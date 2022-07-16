package com.lfw.pattern.u08_bridge;

/**
 * @version v1.0
 * @ClassName: Mac
 * @Description: Mac操作系统(扩展抽象化角色)
 * @Author: 黑马程序员
 */
public class Mac extends OperatingSystem {

    public Mac(VideoFile videoFile) {
        super(videoFile);
    }

    public void play(String fileName) {
        videoFile.decode(fileName);
    }
}
