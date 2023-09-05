package org.example;

import java.util.Scanner;

public class WordManager {


    Scanner s = new Scanner(System.in);
    WordCRUD wordCRUD;
    WordManager(){
        wordCRUD = new WordCRUD(s);
    }


    public int selectMenu() {

        System.out.println("***Word Master***\n"
                + "************\n"
                + "1. Show all word\n"
                + "2. Show word order by level\n"
                + "3. Search word\n"
                + "4. Add word\n"
                + "5. Update word\n"
                + "6. Delete word\n"
                + "7. Save file\n"
                + "0. Exit\n"
                + "************\n"
                + " ==> select Menu : "
        );
        return s.nextInt();
    }

    public void start() {
        wordCRUD.loadFile();
        while(true) {
            int menu = selectMenu();
            if(menu == 0)break;
            if(menu == 4) {
                wordCRUD.addItem();
            }else if(menu == 1) {
                wordCRUD.listAll();
            }else if(menu == 5 ){
                wordCRUD.updateItem();
            }else if(menu == 6 ){
                wordCRUD.deleteItem();
            }else if(menu == 7 ){
                wordCRUD.saveFile();
            }
        }
    }
}
