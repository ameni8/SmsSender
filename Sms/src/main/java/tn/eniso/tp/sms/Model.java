/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.eniso.tp.sms;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ameni
 */

public class Model {
    String messager;
    String newNumbert;
    List<String> numberList = new ArrayList<>();
    private String resultat;

    public String getResultat() {
        return resultat;
    }

    public void setResultat(String resultat) {
        this.resultat = resultat;
    }
    public String getMessager() {
        return messager;
    }

    public void setMessager(String messager) {
        this.messager = messager;
    }

    public String getNewNumbert() {
        return newNumbert;
    }

    public void setNewNumbert(String newNumbert) {
        this.newNumbert = newNumbert;
    }

    public List<String> getNumberList() {
        return numberList;
    }

    public void setNumberList(List<String> numberList) {
        this.numberList = numberList;
    }

    
}
