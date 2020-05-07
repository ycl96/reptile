package com.ycl.service.impl;

import com.ycl.common.utils.HttpClientUtils;
import com.ycl.service.ReptileService;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

/**
 * @author : YangChunLong
 * @date : Created in 2020/5/7 22:47
 * @description:
 * @modified By:
 * @version: :
 */
public class ReptileServiceImpl implements ReptileService {
    @Autowired
    private RestTemplate restTemplate;

    @Override
    public String reptileDemo() {
        String url = "";
        String htmlStr = restTemplate.getForObject(url,String.class);
        return htmlStr;
    }

    public static void main(String[] args) {
        String url = "https://www.jiatui.com/";
        String htmlStr = HttpClientUtils.doGet(url);
        Document document = Jsoup.parse(htmlStr);
        System.out.println(htmlStr);
    }
}
