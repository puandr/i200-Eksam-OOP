package com.company.Kirjanik;

/**
 * Created by andrei on 22.01.2017.
 */
public class Pastakas {

    int tindiKogus;

    public Pastakas(int algneTint) {
        this.tindiKogus = algneTint;
    }


    public void kirjuta(String sisseString) {
        String temporaryString = sisseString.replaceAll("\\s", "");
        if (this.tindiKogus <= 0) {
            System.out.println("Tint on otsas");
        } else if (temporaryString.length() <= this.tindiKogus) {
            System.out.println(sisseString);
            this.tindiKogus = this.tindiKogus - temporaryString.length();
        } else if (temporaryString.length() > this.tindiKogus){
            System.out.println(sisseString.substring(0, this.tindiKogus));
        }

    }

    public void prindiPaljuTintiAlles() {
        System.out.println("Alles on " + this.tindiKogus + " tindiühikut");
    }
}
