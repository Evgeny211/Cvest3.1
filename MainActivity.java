package com.example.cvest31;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private LinearLayout butLayout;
    private TextView subject, text1;
    private Game game;
    private TextView a, r, k;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
        butLayout=findViewById(R.id.butLayout);
        subject=findViewById(R.id.subject);
        text1=findViewById(R.id.text1);
        a=findViewById(R.id.a);
        k=findViewById(R.id.k);
        r=findViewById(R.id.r);

        Character character=new Character("ssd",50,50,50);
        Sityation s=new Sityation( " Начало. ", "После крушения самолёта вы " +
                "оказались на берегу необитаемого острова.\n " +
                "Что будете делать?\n \n" +
                "1- Начать выживать.\n" +
                "2 -Искать помощи.\n", 2, -5,-5,-5);

        s.d[0]=new Sityation(" Выживание. ", "С чего начнёте?\n\n" +
                "1- Искать еду.\n" +
                "2- Искать убежище.", 2, -10,-10,-5);

        s.d[0].d[0]=new Sityation( " Еда. ", "Вы нашли немного еды с упавшего самолёта и ручей.\n" +
                " Что дальше?\n\n" +
                "1- Искать убежище.\n" +
                "2- Искать помощи.",2, 5,15,-5);


        s.d[0].d[0].d[0]=
                s.d[0].d[1]=
                        new Sityation( " Убежище. ", "Вы наши материалы и лодку.\n" +
                                "Из них можно сделать шалаш.\n Что дальше?\n\n" +
                                "1- Делать шалаш.\n" +
                                "2- Уплыть на лодке.",2, -5,-10,-5);

        s.d[0].d[0].d[1]=new Sityation(" Помощь. ", "C чего начнёте?\n " +
                "1- Искать других выживших.\n" +
                "2- Подавать сигналы ''SOS''", 2, -5,-5,-5);

        s.d[0].d[0].d[1].d[1]=new Sityation("SOS","Каким способом вы хотите подать сигнал?\n" +
                "1- Развести костёр.\n 2- Выложить камнями надпись.",2,100,100,100);

        s.d[0].d[1].d[0]= new Sityation(" Новый дом. ", "Вы сделали шалаш. Что дальше?\n" +
                "1- Искать еду.\n" +
                "2- Искать помощь.\n",2, 20,-15,-5);

        s.d[0].d[1].d[0].d[0]=new Sityation(" Перекус. ", "Вы нашли немного еды с упавшего самолёта и ручей.\n" +
                " Что дальше?\n" +
                "1- Искать других выживших.\n" +
                "2- Подавать сигналы ''SOS''",2, 15,20,-5);

        s.d[0].d[1].d[0].d[0].d[0]=new Sityation("Нападение.", "Вы нашли одичавшего выжившего," +
                "но он съел вас заживо.",0,-100,-100,-100);

        s.d[0].d[1].d[0].d[0].d[1]=new Sityation(" HELP!","Вас увидел спасательный вертолёт.\n" +
                "Вы выиграли!",0,100,100,100);

        s.d[0].d[1].d[0].d[1]=new Sityation(" Новый дом. ","Вы сделали шалаш." +
                " Что дальше?\n" +
                "1- Искать других выживших.\n" +
                "2- Подавать сигналы ''SOS''",2, 20,-15,-5);

        s.d[0].d[1].d[1]=new Sityation(" Корабль. ", "Вас увидел корабль.\n" +
                "Вы выиграли!", 0, 100,100,100);

        s.d[1]=new Sityation(" Новые знакомства. ", "Вы нашли выжившего. Теперь вас двое.\n " +
                "Что дальше?\n" + "1- Начать выживать.\n" +
                "2 - Подавать сигналы ''SOS''\n", 2,-5,-5,30);


        s.d[1].d[0]=new Sityation(" Выживание. ", "С чего начнёте?\n" +
                "1- Искать еду.\n" +
                "2- Искать убежище.",2,-5,-20,-5);

        s.d[1].d[0].d[0]=new Sityation(" Еда. ", "Вы не смогли найти еды и слишком истощены.\n" +
                "Но вы можете съесть своего друга и уталить голод.\n" +
                "Что сделаете?\n" + "1- Съесть друга.\n" + "2- Искать убежище.",2,20,80,-60);

        s.d[1].d[0].d[0].d[1]=new Sityation("Голодовка.", "Вы слишком голодны. У вас нет сил.\n" +
                "1- Съесть друга.\n" +
                "2- Искать еду дальше.", 2,-10,-15,-10);

        s.d[1].d[0].d[0].d[0]=new Sityation("Каннибал.", "Вы съели друга и вкусно поели," +
                " но слишком одичали.\n\n\n" + "1- Искать убежище.\n" +
                "2- Выбираться с острова.",2,-20,30,-10);

        s.d[1].d[0].d[0].d[0].d[0]=new Sityation("Темнота.", "Уже стемнело. Вы упали с обрыва, " +
                "пока искали убежище..",
                0,-100,-100,-100);

        s.d[1].d[0].d[0].d[0].d[1]=new Sityation("The End...","Вы не расчитали свои силы и утонули.",
                0,-100,-100,-100);

        s.d[0].d[0].d[1].d[0]=
                s.d[1];

        s.d[1].d[0].d[1]=
                s.d[0].d[1];//убежище

        s.d[0].d[0].d[0].d[0]=
                s.d[0].d[1].d[0];//шалаш

        s.d[0].d[0].d[0].d[1]=
                s.d[0].d[1].d[1];//корабль

        s.d[0].d[0].d[1].d[1].d[1]=
                s.d[0].d[1].d[0].d[0].d[1];

        s.d[0].d[1].d[0].d[1].d[1]=
                s.d[0].d[1].d[0].d[0].d[1];

        s.d[0].d[1].d[0].d[1].d[0]= s.d[1];

        s.d[0].d[0].d[1].d[1].d[0]=
                s.d[0].d[1].d[1];

        s.d[1].d[0].d[1].d[1]=
                s.d[0].d[1].d[0].d[0].d[1];//sos

        s.d[1].d[1]=s.d[0].d[0].d[1].d[1];


        Story story=new Story(s);
        this.game= new Game (character, story);

    }
    @Override
    protected void onResume(){
        super.onResume();
        showSit(game.story.currentSityation);

    }
    public void showSit(final Sityation sityation){
        butLayout.removeAllViews();
        subject.setText(sityation.subject);
        text1.setText(sityation.text);
        for (int i = 0; i < game.story.currentSityation.d.length; i++) {
            Button button = new Button(getBaseContext());
            button.setText(i+1+"  ");
            butLayout.addView(button);
            final int x=i;
            a.setText(" "+game.character.A+" ");
            k.setText(" "+game.character.K+" ");
            r.setText(" "+game.character.R+" ");
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    game.story.currentSityation=sityation.d[x];
                    showSit(game.story.currentSityation);
                    game.character.K+=sityation.dK;
                    game.character.A+=sityation.dA;
                    game.character.R+=sityation.dR;

                    a.setText(" "+game.character.A+"    ("+sityation.dA+")");
                    k.setText(" "+game.character.K+"    ("+sityation.dK+")");
                    r.setText(" "+game.character.R+"    ("+sityation.dR+")");

                }
            });
        }
        if (game.story.isEnd()){
            Button button = new Button(getBaseContext());
            button.setText("EXIT");
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    finish();
                }
            });
            butLayout.addView(button);
        }
    }
}