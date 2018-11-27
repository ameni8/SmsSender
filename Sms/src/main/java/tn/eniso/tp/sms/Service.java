/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.eniso.tp.sms;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;

/**
 *
 * @author ameni
 */
public class Service {
    
   
    void sendKannel(List<String> num, String text) throws MalformedURLException, IOException {
        
        KannelDAO kannelDAO = new KannelDAO();
        for (String item:num) {
            
            kannelDAO.send(item, text);
        }
        
        
        }
}
