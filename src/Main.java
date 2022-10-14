/*::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
                                  ||                               *      *
Developer :: Charles RADOLANIRINA ||                               *      *
                                  ||                               *      *
==================================||                         *                  *
TP3 - Scanner & ASCII             ||                           *              *
Date :: 30th September 2022       ||                              * * * * * *
                                  ||
***********************************************************************************************************************
:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        SafeScanner();
        ASCIArt(int 2; int 2);
    }

    public static void SafeScanner(){

        System.out.println("Saisissez la taille et la hauteur du chat");//lecture de ce que l'utilisateur rentre

        boolean inputValid = false;
        while(!inputValid){
            try{
                Scanner xscanner = new Scanner(System.in);//création du scanner
                int answer = xscanner.nextInt();//affecte ce qu'il a mis dans la variable answer
                inputValid = true;//si c'est bon imputValid est vraie
                xscanner.close();//suppression du scanner : "xscanner"
            } catch(InputMismatchException e){
                System.out.println("\nErreur de saisi de votre âge merci de bien vouloir saisir une nouvelle fois votre âge : ");
            }
        }
    }

    //définition de la fonction ASCIArt
    public class ASCIArt(int height, int width) {


    }

}