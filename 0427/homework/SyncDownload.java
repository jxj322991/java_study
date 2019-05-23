
/*
 * @Description: 
 * @Author: jinxiaojian
 * @Email: jinxiaojian@youxin.com
 * @LastEditors: ��Ф��
 * @Date: 2019-04-27 22:27:27
 * @LastEditTime: 2019-04-27 22:53:16
 */

import java.net.URL;

import java.io.*;

class SyncDownload extends Thread {

  URL url;
  String file;

  SyncDownload(URL url, String file) {

    this.url = url;

    this.file = file;

    System.out.println(url);

  }

  public void run() {

    java.io.InputStream input = null;

    java.io.OutputStream output = null;

    try {

      input = url.openStream();

      output = new FileOutputStream(file);

      byte[] data = new byte[1024];

      int length;

      try {

        while ((length = input.read(data)) != -1) {

          output.write(data, 0, length);

        }

      } catch (IOException e1) {

        e1.printStackTrace();

      }

    } catch (IOException e1) {

      e1.printStackTrace();

    }

  }

}

class test

{

  public static void main(String[] args)

      throws Exception

  {

    final URL[] urls = { // URL���飬������ҳ��ַ

        new URL("https://www.pku.edu.cn"),

        new URL("https://www.baidu.com"),

        new URL("https://www.sina.com.cn")

    };

    final String[] files = { // ������ҳhtm�ļ���

        "pku.htm",

        "baidu.htm",

        "sina.htm"

    };

    SyncDownload sd1 = new SyncDownload(urls[0], files[0]); // �����ĸ��߳�

    SyncDownload sd2 = new SyncDownload(urls[1], files[1]);

    SyncDownload sd3 = new SyncDownload(urls[2], files[2]);

    sd1.start();

    sd2.start();

    sd3.start();

  }

}
