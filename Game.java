package com.example.cvest31;


import java.util.Scanner;
public class Game {
    public Character character;
    protected Story story;

    public Game(Character character, Story story) {
        this.story = story;
        this.character=character;
    }

    private void start() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            story.currentSityation();
            story.currentSityation.show();
            if (story.isEnd()) break;
            else {
                int answer = scanner.nextInt();
                story.go(answer);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите имя");
        Character character=new Character("reg4rg", 100,100,100);

        Sityation s=new Sityation( "  ", "После крушения самолёта вы оказались на берегу необитаемого острова.\n " +
                "Что будете делать?" +
                "Куда вы пойдете дальше?\n" +
                "1- Начать выживать.\n" +
                "2 -Искать помощи.\n", 2, 0,0,0);
        s.d[0]=new Sityation("  ", "С чего начнёте?\n" +
                "1- Искать еду.\n" +
                "2- Искать убежище.", 2, 0,0,0);
        s.d[0].d[0]=new Sityation( "  ", "Вы нашли немного еды с упавшего самолёта и ручей.\n" +
                " Что дальше?\n" +
                "1- Искать убежище.\n" +
                "2- Искать помощи.",2, 0,0,0);
        s.d[0].d[0].d[0]=
        s.d[0].d[1]=
                new Sityation( "  ", "Вы наши материалы и лодку.\n" +
                "Из них можно сделать шалаш. Что дальше?\n" +
                "1- Делать шалаш.\n" +
                "2- Уплыть на лодке.",2, 0,0,0);
        s.d[0].d[0].d[1]=new Sityation("  ", "C чего начнёте?\n " +
                "1- Искать других выживших.\n" +
                "2- Подавать сигналы ''SOS''", 2, 0,0,0);


        s.d[0].d[1].d[0]= new Sityation("  ", "Вы сделали шалаш. Что дальше?\n" +
                "1- Искать еду.\n" +
                "2- Искать помощь.\n",2, 0,0,0);
        s.d[0].d[1].d[0].d[0]=new Sityation("  ", "Вы нашли немного еды с упавшего самолёта и ручей.\n" +
                " Что дальше?\n" +
                "1- Искать других выживших.\n" +
                "2- Подавать сигналы ''SOS''",2, 0,0,0);
        s.d[0].d[1].d[0].d[1]=new Sityation("  ","Вы сделали шалаш." +
                " Что дальше?\n" +
                "1- Искать других выживших.\n" +
                "2- Подавать сигналы ''SOS''",2, 0,0,0);


        s.d[0].d[1].d[1]=new Sityation("  ", "Вас увидел корабль.\n" +
                "============\n" +
                "Вы выиграли!", 0, 0,0,0);





        s.d[1]=new Sityation("  ", "Вы нашли выжившего. Теперь вас двое.\n " +
                "Что дальше?\n" +
                "1- Начать выживать.\n" +
                "2 -Искать помощи.\n", 2,0,0,0);
        s.d[1].d[0]=new Sityation("  ", "С чего начнёте?\n" +
                "1- Искать еду.\n" +
                "2- Искать убежище.",2,0,0,0);
        s.d[1].d[0].d[0]=new Sityation("  ", "Вы нашли немного еды с упавшего самолёта и ручей.\n" +
                "Что дальше?\n" +
                "1- \n" +
                "2- ",2,0,0,0);
        s.d[1].d[0].d[1]=new Sityation("  ", "Вы нащли материалы...\n "+
                "1- Искать других выживших.\n"+
                "2- Подавать сигналы ''SOS'",2,0,0,0);
        s.d[1].d[0].d[0].d[0]=new Sityation("  ", "",2,0,0,0);
        s.d[1].d[0].d[0].d[1]=new Sityation("  ", "",2,0,0,0);
        s.d[1].d[0].d[1].d[0]=new Sityation("  ", "",2,0,0,0);
        s.d[1].d[0].d[1].d[1]=new Sityation("  ", "",2,0,0,0);
        s.d[1].d[1]=new Sityation("  ", "",2,0,0,0);


        Story story=new Story(s);
        Game game= new Game (character, story);
        game.start();
    }
}