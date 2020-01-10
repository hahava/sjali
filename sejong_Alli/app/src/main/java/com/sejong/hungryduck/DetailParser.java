package com.sejong.hungryduck;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by HOME on 2016-12-20.
 */
public class DetailParser {
    String url="http://223.195.12.84:52273/";
    String htmlContent;
    int cnt=0;
    DetailAdding di=new DetailAdding();
    ArrayList<DetailAdding> result=new ArrayList<DetailAdding>();
    ArrayList<DetailAdding> connectFest() {
        try {

            Document doc = Jsoup.connect(url).get();
            Elements links = doc.select("td");
            for (Element link : links) {
                cnt++;
                htmlContent = link.text().trim();
                System.out.println(htmlContent);
                switch (cnt) {
                    case 3:
                        di.title = htmlContent;
                        break;
                    case 4:
                        di.subject = htmlContent;
                        break;
                    case 5:
                        di.personel = htmlContent;
                        break;
                    case 6:
                        di.contents = htmlContent;
                        break;
                    case 7:
                        di.name=htmlContent;
                        break;
                    case 8:
                        di.major=htmlContent;
                        break;
                    case 9:
                        di.cellPhone=htmlContent;
                        result.add(di);
                        di=new DetailAdding();
                        cnt = 0;
                        break;

                }
            }
        } catch (IOException e) {

        }
        return result;
    }
}
