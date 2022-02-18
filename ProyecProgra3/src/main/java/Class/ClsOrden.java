/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import javax.swing.JTable;

/**
 *
 * @author Alexis
 */
public class ClsOrden {
    
    String[][] equipos = new String[12][10];

    String[] nombreclubes = new String[12];
    int[] juegos = new int[12];
    int[] puntos = new int[12];
    int[] ganados = new int[12];
    int[] empates = new int[12];
    int[] perdidos = new int[12];
    int[] golesfavor = new int[12];
    int[] golescontra = new int[12];
    int[] diferenciagoles = new int[12];

    public String[][] ordenar(String[][] clubs) {

        for (int i = 0; i < juegos.length; i++) {
            nombreclubes[i] = clubs[i][1];
            juegos[i] = Integer.parseInt(clubs[i][2]);
            puntos[i] = Integer.parseInt(clubs[i][3]);
            ganados[i] = Integer.parseInt(clubs[i][4]);
            empates[i] = Integer.parseInt(clubs[i][5]);
            perdidos[i] = Integer.parseInt(clubs[i][6]);
            golesfavor[i] = Integer.parseInt(clubs[i][7]);
            golescontra[i] = Integer.parseInt(clubs[i][8]);
            diferenciagoles[i] = Integer.parseInt(clubs[i][9]);
        }

        int jor, pts, ganar, empatar, perder, golesfav, golescon, golesdif;
        String temp_nombreClub;

        for (int i = 0; i < (juegos.length - 1); i++) {
            for (int j = 0; j < (juegos.length - 1); j++) {

                //Ordenar por Puntos
                if (puntos[j] < puntos[j + 1]) {
                    pts = puntos[j];
                    temp_nombreClub = nombreclubes[j];
                    jor = juegos[j];
                    ganar = ganados[j];
                    empatar = empates[j];
                    perder = perdidos[j];
                    golesfav = golesfavor[j];
                    golescon = golescontra[j];
                    golesdif = diferenciagoles[j];
                    puntos[j] = puntos[j + 1];
                    nombreclubes[j] = nombreclubes[j + 1];
                    juegos[j] = juegos[j + 1];
                    ganados[j] = ganados[j + 1];
                    empates[j] = empates[j + 1];
                    perdidos[j] = perdidos[j + 1];
                    golesfavor[j] = golesfavor[j + 1];
                    golescontra[j] = golescontra[j + 1];
                    diferenciagoles[j] = diferenciagoles[j + 1];
                    puntos[j + 1] = pts;
                    nombreclubes[j + 1] = temp_nombreClub;
                    juegos[j + 1] = jor;
                    ganados[j + 1] = ganar;
                    empates[j + 1] = empatar;
                    perdidos[j + 1] = perder;
                    golesfavor[j + 1] = golesfav;
                    golescontra[j + 1] = golescon;
                    diferenciagoles[j + 1] = golesdif;

                    if (diferenciagoles[j] < diferenciagoles[j + 1]) {
                        pts = puntos[j];
                        temp_nombreClub = nombreclubes[j];
                        jor = juegos[j];
                        ganar = ganados[j];
                        empatar = empates[j];
                        perder = perdidos[j];
                        golesfav = golesfavor[j];
                        golescon = golescontra[j];
                        golesdif = diferenciagoles[j];
                        puntos[j] = puntos[j + 1];
                        nombreclubes[j] = nombreclubes[j + 1];
                        juegos[j] = juegos[j + 1];
                        ganados[j] = ganados[j + 1];
                        empates[j] = empates[j + 1];
                        perdidos[j] = perdidos[j + 1];
                        golesfavor[j] = golesfavor[j + 1];
                        golescontra[j] = golescontra[j + 1];
                        diferenciagoles[j] = diferenciagoles[j + 1];
                        puntos[j + 1] = pts;
                        nombreclubes[j + 1] = temp_nombreClub;
                        juegos[j + 1] = jor;
                        ganados[j + 1] = ganar;
                        empates[j + 1] = empatar;
                        perdidos[j + 1] = perder;
                        golesfavor[j + 1] = golesfav;
                        golescontra[j + 1] = golescon;
                        diferenciagoles[j + 1] = golesdif;

                        if (golesfavor[j] < golesfavor[j + 1]) {
                            pts = puntos[j];
                            temp_nombreClub = nombreclubes[j];
                            jor = juegos[j];
                            ganar = ganados[j];
                            empatar = empates[j];
                            perder = perdidos[j];
                            golesfav = golesfavor[j];
                            golescon = golescontra[j];
                            golesdif = diferenciagoles[j];
                            puntos[j] = puntos[j + 1];
                            nombreclubes[j] = nombreclubes[j + 1];
                            juegos[j] = juegos[j + 1];
                            ganados[j] = ganados[j + 1];
                            empates[j] = empates[j + 1];
                            perdidos[j] = perdidos[j + 1];
                            golesfavor[j] = golesfavor[j + 1];
                            golescontra[j] = golescontra[j + 1];
                            diferenciagoles[j] = diferenciagoles[j + 1];
                            puntos[j + 1] = pts;
                            nombreclubes[j + 1] = temp_nombreClub;
                            juegos[j + 1] = jor;
                            ganados[j + 1] = ganar;
                            empates[j + 1] = empatar;
                            perdidos[j + 1] = perder;
                            golesfavor[j + 1] = golesfav;
                            golescontra[j + 1] = golescon;
                            diferenciagoles[j + 1] = golesdif;
                        }

                    }
                }
            }
        }

        for (int i = 0; i < clubs.length; i++) {
            equipos[i][0] = (i + 1) + "";
            equipos[i][1] = nombreclubes[i];
            equipos[i][2] = juegos[i] + "";
            equipos[i][3] = puntos[i] + "";
            equipos[i][4] = ganados[i] + "";
            equipos[i][5] = empates[i] + "";
            equipos[i][6] = perdidos[i] + "";
            equipos[i][7] = golesfavor[i] + "";
            equipos[i][8] = golescontra[i] + "";
            equipos[i][9] = diferenciagoles[i] + "";
        }

        return equipos;

    }

    public String[][] ordenar(JTable equipos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
