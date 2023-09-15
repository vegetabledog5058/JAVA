package javaEx.plus.Io.homework.Reptile;

import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpResponse;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/9/15 0:48
 * @desciption:
 */
public class Emusic {
    public static void main(String[] args) {
        String url = "https://m701.music.126.net/20230914165401/0f6e4b36c9f0057a0b429bc0eb416435/jdyyaac/obj/w5rDlsOJwrLDjj7CmsOj/28133411020/b5d7/3857/ac5c/1274e257b2e91849e3290c8b53709ba5.m4a";
        HttpResponse response = HttpRequest.get(url).execute();
        InputStream inputStream = response.bodyStream();
        try {
            FileOutputStream fos = new FileOutputStream("D:\\Java_Test\\mu.m4a");
            fos.write(inputStream.readAllBytes());

            fos.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
