package com.pluarlsight;

import java.util.Scanner;

public class Main {
        private static Book[] books = new Book[100];

        private static int numBooks = 20;

    static void main(String[] args) {
        books[0] = new Book(1,"9780345678123","The Silent Ember",false,"");
        books[1] = new Book(2,"9781456789234","Echoes of the Hollow Sky",false,"");
        books[2] = new Book(3,"9782567890345","The Clockmaker’s Secret",false,"");
        books[3] = new Book(4,"9783678901456","Ashes of the Forgotten Realm",false,"");
        books[4] = new Book(5,"9784789012567","The Last Lantern Keeper",false,"");
        books[5] = new Book(6,"9785890123678","Whispers Beneath the Ice",false,"");
        books[6] = new Book(7,"9786901234789","The Crimson Tides",false,"");
        books[7] = new Book(15,"9785789012568","The Obsidian Key",false,"");
        books[8] = new Book(8,"9787012345890","A Map of Endless Stars",false,"");
        books[9] = new Book(9,"9788123456901","The Garden of Lost Time",false,"");
        books[10] = new Book(10,"9789234567012","The Shadow Archivist",false,"");
        books[11] = new Book(11,"9781345678124","Fragments of a Distant Sun",false,"");
        books[12] = new Book(12,"9782456789235","The Ironwood Chronicles",false,"");
        books[13] = new Book(13,"9783567890346","The Midnight Cartographer",false,"");
        books[14] = new Book(14,"9784678901457","Storms Over Silver Ridge",false,"");
        books[15] = new Book(16,"9786890123679","Dreams of the Paper Moon",false,"");
        books[16] = new Book(17,"9787901234780","The Hidden City Below",false,"");
        books[17] = new Book(18,"9788012345891","A Song for the Vanished",false,"");
        books[18] = new Book(19,"9789123456902","The Emberlight Prophecy",false,"");
        books[19] = new Book(20,"9781234567013","The Keeper of Broken Clocks",false,"");

        Scanner scanner = new Scanner(System.in);
        boolean isDone = false;
        while (!isDone){
            System.out.println("Store Home Screen");
            System.out.println("==================");
            System.out.println("1). Show Books Available: \n2). Show Checked Out Books\n 3). Exit");
            int input = scanner.nextInt();
            switch (input){
                case 1 -> System.out.println("");
                case 2 -> System.out.println("");
                case 3 -> isDone = true;
                default -> System.out.println("Invalid Input");
            }
    }
        //hold a inventory of at least 20 books of my choice

        //while loop for Store Home Screen
        //store home screen
        //1. show avaible books//prompt user to select book to check out or go back//if check out get name
        //2. show checkout out books prompts user to check in book with c or go back with x

    }

}
