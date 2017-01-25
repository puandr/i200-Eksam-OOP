package com.company;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by andrei on 22.01.2017.
 */
public class Chat {
    String toaNimi;
    //int vestlusePikkus = 0;
    ArrayList<HashMap<String, String>> vestlus = new ArrayList();

    public Chat (String inputString) {
        this.toaNimi = inputString;
    }

    public void sisestaSonum(String kelleSonum, String sonumiSisu) {
        HashMap<String, String> sonum = new HashMap<>();
        sonum.put(kelleSonum, sonumiSisu);
        this.vestlus.add(sonum);
    }

    public void prindiKoikSonumidKoosKasutajanimega() {
        //this.vestlusePikkus = this.vestlus.size();
        for (int i = 0; i < this.vestlus.size(); i++) {
            System.out.println(vestlus.get(i));
        }
        System.out.println();
    }

    public void adminKustutabSonumi(String sonumKustutamiseks) {
        for (int i = 0; i < this.vestlus.size(); i++) {
            if (vestlus.get(i).containsValue(sonumKustutamiseks)) {
                vestlus.remove(i);
            }

        }
    }

    public void prindiToaNimi(){
        System.out.println(this.toaNimi);
    }
}
