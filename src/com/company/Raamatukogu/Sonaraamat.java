package com.company.Raamatukogu;

import java.util.ArrayList;

/**
 * Created by andrei on 22.01.2017.
 */
public class Sonaraamat {
    String raamatuKeel;
    ArrayList<String> sonad = new ArrayList<>();
    public Sonaraamat(String keel) {
        this.raamatuKeel = keel;
    }


    public void sisestaSona(String sisestatudSona) {
        this.sonad.add(sisestatudSona);
    }

    public String[] otsiEsimeseTaheJargi(String esimeneTaht) {
        ArrayList<String> ajutineArray = new ArrayList<>();

        for (int i = 0; i < sonad.size(); i++) {
            if (sonad.get(i).startsWith(esimeneTaht)) {
                ajutineArray.add(sonad.get(i));
            }
        }
        String[] esimeseTaheMassiiv = new String[ajutineArray.size()];
        for (int i = 0; i < ajutineArray.size(); i++) {
            esimeseTaheMassiiv[i] = ajutineArray.get(i);
        }


        return esimeseTaheMassiiv;
    }

    public void eemaldaSona(String eemaldatavVaste) {
        sonad.remove(eemaldatavVaste);
        System.out.println("Sõna " + eemaldatavVaste + " on eemaldatud. Jäänud on järgmised sõnad");
        System.out.println(sonad);
    }

    public void misKeelesRaamatOn() {
        System.out.println("Selle raamatu keel - " + this.raamatuKeel);
    }
}
