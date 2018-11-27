/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.eniso.tp.sms;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

/**
 *
 * @author ameni
 */
public class KannelDAO {
    final private String url = "http://localhost:13013/cgi-bin/sendsms";
    private String user = "tester";
    private String password = "foobar";

    void send(String item, String text) throws UnsupportedEncodingException, MalformedURLException, IOException {
        StringBuilder sb = new StringBuilder();
        sb.append(url)
                .append("?")
                .append("username=").append(URLEncoder.encode(user, "UTF-8"))
                .append("&password=").append(URLEncoder.encode(password, "UTF-8"))
                .append("&to=").append(URLEncoder.encode(item, "UTF-8"))
                .append("&text=").append(URLEncoder.encode(text, "UTF-8"));
        new URL(url).openConnection();
    }
    
}
