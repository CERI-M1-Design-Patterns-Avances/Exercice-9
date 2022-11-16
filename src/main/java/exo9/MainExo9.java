package exo9;

import java.util.Scanner;

public class MainExo9 {

    private static AppliEntrainement lAppli;

    private static void setFonctionnalite(int info) {
        switch (info) {
            case 1 :
                // A completer
                break;
            case 2 :
                // A completer
                break;
            default : lAppli.setVitesse(info);
        }
    }

    public static void main(String[] args) {

        lAppli = new AppliEntrainement(30);

        Scanner sc = new Scanner(System.in);
        int infoUser = sc.nextInt();
        while (infoUser != 0) {
            setFonctionnalite(infoUser);
            infoUser = sc.nextInt();
        }
    }
}
