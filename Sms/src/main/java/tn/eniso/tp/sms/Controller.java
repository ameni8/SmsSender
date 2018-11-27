/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.eniso.tp.sms;

import java.io.Console;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import tn.eniso.tp.sms.Model;
/**
 *
 * @author ameni
 */
@ManagedBean
@SessionScoped
public class Controller {

 private Model _model =new Model();
@EJB
private Service service;


public Model getModel() {
        return _model;
    }

public void onAddNum(){

    String number =getModel().getNewNumbert();
    getModel().numberList.add(number);
    System.out.println(number);
    System.out.println(getModel().numberList);
   
}
public void onSend() throws MalformedURLException, IOException{
    //View To Model
        //preparer les donnees à envoyer au service
        List<String> num = getModel().getNumberList();
        String text = getModel().getMessager();

        //Call Business
        try {
            service.sendKannel(num, text);
            // Model To View
            getModel().setResultat("Messages envoyes avec success");
        } catch (Exception ex) {
            // Model To View
            getModel().setResultat("Erreur lors de l'envooi du message");
        } 
  
}
}
