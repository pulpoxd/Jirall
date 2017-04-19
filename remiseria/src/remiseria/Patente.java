/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remiseria;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author tecnica
 */
class Patente {

    public Patente(String valor, int tipo) {
        String pattern = "";
        if (tipo == 0) {
            pattern = "[A-Z][A-Z][A-Z][0-9][0-9][0-9]";
        }
        if (tipo == 1) {
            pattern = "[0-9][0-9][0-9][A-Z][A-Z][A-Z]";
        }
        if (tipo == 2) {
            pattern = "[A-Z][A-Z][0-9][0-9][0-9][A-Z][A-Z][A-Z]";
        }
        if (tipo == 3) {
            pattern = "[A-Z][0-9][0-9][0-9][A-Z][A-Z][A-Z]";
        }

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(valor);
        if (m.matches()) {
            System.out.println("ok");
        }
        else
        System.out.println("error");
    }
}
