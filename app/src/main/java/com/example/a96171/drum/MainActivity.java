package com.example.a96171.drum;

import android.content.res.AssetFileDescriptor;
import android.media.AudioManager;
//import android.media.MediaRecorder;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;
import android.os.Environment;



import java.io.IOException;




    public class MainActivity extends AppCompatActivity {


        SoundPool sounds=new SoundPool(10, AudioManager.STREAM_MUSIC, 0);

        public int soundid1_3() {
            int soundid1= 0;
            try {
                AssetFileDescriptor fileDescriptor = getAssets().openFd("crash.mp3");
                soundid1 = sounds.load(fileDescriptor.getFileDescriptor(), fileDescriptor.getStartOffset(), fileDescriptor.getLength(), 1);

            } catch (IOException e) {
                e.printStackTrace();
            }
            return soundid1;
        }
        public int soundid1_1() {
            int soundid1= 0;
            try {
                AssetFileDescriptor fileDescriptor = getAssets().openFd("crash0.5.mp3");
                soundid1 = sounds.load(fileDescriptor.getFileDescriptor(), fileDescriptor.getStartOffset(), fileDescriptor.getLength(), 1);

            } catch (IOException e) {
                e.printStackTrace();
            }
            return soundid1;
        }
        public int soundid1_2() {
            int soundid1= 0;
            try {
                AssetFileDescriptor fileDescriptor = getAssets().openFd("crash1.mp3");
                soundid1 = sounds.load(fileDescriptor.getFileDescriptor(), fileDescriptor.getStartOffset(), fileDescriptor.getLength(), 1);

            } catch (IOException e) {
                e.printStackTrace();
            }
            return soundid1;
        }
        public int soundid2_3() {
            int soundid1= 0;
            try {
                AssetFileDescriptor fileDescriptor = getAssets().openFd("hat.mp3");
                soundid1 = sounds.load(fileDescriptor.getFileDescriptor(), fileDescriptor.getStartOffset(), fileDescriptor.getLength(), 1);

            } catch (IOException e) {
                e.printStackTrace();
            }
            return soundid1;
        }
        public int soundid2_1() {
            int soundid1= 0;
            try {
                AssetFileDescriptor fileDescriptor = getAssets().openFd("hat0.5.mp3");
                soundid1 = sounds.load(fileDescriptor.getFileDescriptor(), fileDescriptor.getStartOffset(), fileDescriptor.getLength(), 1);

            } catch (IOException e) {
                e.printStackTrace();
            }
            return soundid1;
        }
        public int soundid2_2() {
            int soundid1= 0;
            try {
                AssetFileDescriptor fileDescriptor = getAssets().openFd("hat1.mp3");
                soundid1 = sounds.load(fileDescriptor.getFileDescriptor(), fileDescriptor.getStartOffset(), fileDescriptor.getLength(), 1);

            } catch (IOException e) {
                e.printStackTrace();
            }
            return soundid1;
        }
        public int soundid3_3() {

            int soundid1= 0;
            try {
                AssetFileDescriptor fileDescriptor = getAssets().openFd("kick.mp3");
                soundid1 = sounds.load(fileDescriptor.getFileDescriptor(), fileDescriptor.getStartOffset(), fileDescriptor.getLength(), 1);

            } catch (IOException e) {
                e.printStackTrace();
            }
            return soundid1;
        }
        public int soundid3_1() {
            int soundid1= 0;
            try {
                AssetFileDescriptor fileDescriptor = getAssets().openFd("kick0.5.mp3");
                soundid1 = sounds.load(fileDescriptor.getFileDescriptor(), fileDescriptor.getStartOffset(), fileDescriptor.getLength(), 1);

            } catch (IOException e) {
                e.printStackTrace();
            }
            return soundid1;
        }
        public int soundid3_2(){
            int soundid1= 0;
            try {
                AssetFileDescriptor fileDescriptor = getAssets().openFd("kick1.mp3");
                soundid1 = sounds.load(fileDescriptor.getFileDescriptor(), fileDescriptor.getStartOffset(), fileDescriptor.getLength(), 1);

            } catch (IOException e) {
                e.printStackTrace();
            }
            return soundid1;
        }
        public int soundid4_3() {
            int soundid1= 0;
            try {
                AssetFileDescriptor fileDescriptor = getAssets().openFd("snare.mp3");
                soundid1 = sounds.load(fileDescriptor.getFileDescriptor(), fileDescriptor.getStartOffset(), fileDescriptor.getLength(), 1);

            } catch (IOException e) {
                e.printStackTrace();
            }
            return soundid1;
        }
        public int soundid4_1() {
            int soundid1= 0;
            try {
                AssetFileDescriptor fileDescriptor = getAssets().openFd("snare0.5.mp3");
                soundid1 = sounds.load(fileDescriptor.getFileDescriptor(), fileDescriptor.getStartOffset(), fileDescriptor.getLength(), 1);

            } catch (IOException e) {
                e.printStackTrace();
            }
            return soundid1;
        }
        public int soundid4_2() {
            int soundid1= 0;
            try {
                AssetFileDescriptor fileDescriptor = getAssets().openFd("snare1.mp3");
                soundid1 = sounds.load(fileDescriptor.getFileDescriptor(), fileDescriptor.getStartOffset(), fileDescriptor.getLength(), 1);

            } catch (IOException e) {
                e.printStackTrace();
            }
            return soundid1;
        }
        public int soundid5_1() {
            int soundid1= 0;
            try {
                AssetFileDescriptor fileDescriptor = getAssets().openFd("ride0.5.mp3");
                soundid1 = sounds.load(fileDescriptor.getFileDescriptor(), fileDescriptor.getStartOffset(), fileDescriptor.getLength(), 1);

            } catch (IOException e) {
                e.printStackTrace();
            }
            return soundid1;
        }
        public int soundid5_2() {
            int soundid1= 0;
            try {
                AssetFileDescriptor fileDescriptor = getAssets().openFd("ride1.mp3");
                soundid1 = sounds.load(fileDescriptor.getFileDescriptor(), fileDescriptor.getStartOffset(), fileDescriptor.getLength(), 1);

            } catch (IOException e) {
                e.printStackTrace();
            }
            return soundid1;
        }
        public int soundid5_3() {
            int soundid1= 0;
            try {
                AssetFileDescriptor fileDescriptor = getAssets().openFd("ride.mp3");
                soundid1 = sounds.load(fileDescriptor.getFileDescriptor(), fileDescriptor.getStartOffset(), fileDescriptor.getLength(), 1);

            } catch (IOException e) {
                e.printStackTrace();
            }
            return soundid1;
        }
        public int soundid6_1() {
            int soundid1= 0;
            try {
                AssetFileDescriptor fileDescriptor = getAssets().openFd("snare_light0.5.mp3");
                soundid1 = sounds.load(fileDescriptor.getFileDescriptor(), fileDescriptor.getStartOffset(), fileDescriptor.getLength(), 1);

            } catch (IOException e) {
                e.printStackTrace();
            }
            return soundid1;
        }
        public int soundid6_2() {
            int soundid1= 0;
            try {
                AssetFileDescriptor fileDescriptor = getAssets().openFd("snare_light1.mp3");
                soundid1 = sounds.load(fileDescriptor.getFileDescriptor(), fileDescriptor.getStartOffset(), fileDescriptor.getLength(), 1);

            } catch (IOException e) {
                e.printStackTrace();
            }
            return soundid1;
        }
        public int soundid6_3() {
            int soundid1= 0;
            try {
                AssetFileDescriptor fileDescriptor = getAssets().openFd("snare_light.mp3");
                soundid1 = sounds.load(fileDescriptor.getFileDescriptor(), fileDescriptor.getStartOffset(), fileDescriptor.getLength(), 1);

            } catch (IOException e) {
                e.printStackTrace();
            }
            return soundid1;
        }

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            Button button1 = (Button)findViewById(R.id.btn_key1);
            Button button2 = (Button)findViewById(R.id.btn_key2);
            Button button3 = (Button)findViewById(R.id.btn_key3);
            Button button4 = (Button)findViewById(R.id.btn_key4);
            Button button5 = (Button)findViewById(R.id.btn_key5);
            Button button6 = (Button)findViewById(R.id.btn_key6);
            Button volumnup1 = (Button)findViewById(R.id.plus1);
            Button volumndown1 = (Button)findViewById(R.id.minus1);
            Button volumnup2 = (Button)findViewById(R.id.plus2);
            Button volumndown2 = (Button)findViewById(R.id.minus2);
            Button volumnup3 = (Button)findViewById(R.id.plus3);
            Button volumndown3 = (Button)findViewById(R.id.minus3);
            Button volumnup4 = (Button)findViewById(R.id.plus4);
            Button volumndown4 = (Button)findViewById(R.id.minus4);
            Button volumnup5 = (Button)findViewById(R.id.plus5);
            Button volumndown5 = (Button)findViewById(R.id.minus5);
            Button volumnup6 = (Button)findViewById(R.id.plus6);
            Button volumndown6 = (Button)findViewById(R.id.minus6);

            final RadioGroup radioGroup1 = findViewById(R.id.control1);
            final RadioGroup radioGroup2 = findViewById(R.id.control2);
            final RadioGroup radioGroup3 = findViewById(R.id.control3);
            final RadioGroup radioGroup4 = findViewById(R.id.control4);
            final RadioGroup radioGroup5 = findViewById(R.id.control5);
            final RadioGroup radioGroup6 = findViewById(R.id.control6);
            final TextView text = findViewById(R.id.textview);


            class mychangelistener implements CompoundButton.OnCheckedChangeListener{
                public int loop1;
                public int getLoop1(){return loop1;}
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked == true)
                    {
                        loop1 = -1;
                    }
                    else
                    {
                        loop1 = 0;
                    }
                }
            }



            final int id_1 = soundid1_1();
            final int id_2 = soundid1_2();
            final int id_3 = soundid1_3();
            final int id2_1 = soundid2_1();
            final int id2_2 = soundid2_2();
            final int id2_3 = soundid2_3();
            final int id3_1 = soundid3_1();
            final int id3_2 = soundid3_2();
            final int id3_3 = soundid3_3();
            final int id4_1 = soundid4_1();
            final int id4_2 = soundid4_2();
            final int id4_3 = soundid4_3();
            final int id5_1 = soundid5_1();
            final int id5_2 = soundid5_2();
            final int id5_3 = soundid5_3();
            final int id6_1 = soundid6_1();
            final int id6_2 = soundid6_2();
            final int id6_3 = soundid6_3();




            class MyListener implements View.OnClickListener{
                public int loop1;
                public float a1 = 0.5f;
                public float a2 = 0.5f;
                public float a3 = 0.5f;
                public float a4 = 0.5f;
                public float a5 = 0.5f;
                public float a6 = 0.5f;
                public ToggleButton loop = (ToggleButton)findViewById(R.id.loop);
                public mychangelistener mychangelistener1 = new mychangelistener();


                public boolean getisplaying1(){return isplaying1;}
                public boolean getisplaying2(){return isplaying2;}
                public boolean getisplaying3(){return isplaying3;}
                public boolean getisplaying4(){return isplaying4;}
                public boolean getisplaying5(){return isplaying5;}
                public boolean getisplaying6(){return isplaying6;}

                public int sound1;
                public int sound2;
                public int sound3;
                public int sound4;
                public int sound5;
                public int sound6;
                boolean isplaying1 = false;
                boolean isplaying2 = false;
                boolean isplaying3 = false;
                boolean isplaying4 = false;
                boolean isplaying5 = false;
                boolean isplaying6 = false;
                public void setsound1(int i){
                    sound1 = i;
                }
                public void setsound2(int i){
                    sound2 = i;
                }
                public void setsound3(int i){
                    sound3 = i;
                }
                public void setsound4(int i){
                    sound4 = i;
                }
                public void setsound5(int i){
                    sound5 = i;
                }
                public void setsound6(int i){
                    sound6 = i;
                }

                @Override

                public void onClick(View v) {

                    loop.setOnCheckedChangeListener(mychangelistener1);
                    loop1 = mychangelistener1.getLoop1();

                            if (v.getId() == R.id.btn_key1) {
                                if (loop1 == -1) {
                                    if (isplaying1 == false) {
                                        sound1 = sounds.play(id_3, a1, a1, 1, loop1, 1);
                                        isplaying1 = true;

                                    } else {
                                        sounds.pause(sound1);
                                        isplaying1 = false;
                                    }
                                }
                                else {
                                    sounds.play(id_3, a1, a1, 1, loop1, 1);
                                }


                            }
                            else if (v.getId() == R.id.btn_key2)
                            {
                                if (loop1 == -1) {
                                    if (isplaying2 == false) {
                                        sound2 = sounds.play(id2_3, a2, a2, 1, loop1, 1);
                                        isplaying2 = true;

                                    } else {
                                        sounds.pause(sound2);
                                        isplaying2 = false;
                                    }
                                }
                                else {
                                    sounds.play(id2_3, a2, a2, 1, loop1, 1);
                                }

                            }
                            else if (v.getId() == R.id.btn_key3)
                            {
                                if (loop1 == -1) {
                                    if (isplaying3 == false) {
                                        sound3 = sounds.play(id3_3, a3, a3, 1, loop1, 1);
                                        isplaying3 = true;

                                    } else {
                                        sounds.pause(sound3);
                                        isplaying3 = false;
                                    }
                                }
                                else {
                                    sounds.play(id3_3, a3, a3, 1, loop1, 1);
                                }
                            }
                            else if (v.getId() == R.id.btn_key4)
                            {
                                if (loop1 == -1) {
                                    if (isplaying4 == false) {
                                        sound4 = sounds.play(id4_3, a4, a4, 1, loop1, 1);
                                        isplaying4 = true;

                                    } else {
                                        sounds.pause(sound4);
                                        isplaying4 = false;
                                    }
                                }
                                else {
                                     sounds.play(id4_3, a4, a4, 1, loop1, 1);
                                }
                            }
                            else if (v.getId() == R.id.btn_key5)
                            {
                                if (loop1 == -1) {
                                    if (isplaying5 == false) {
                                        sound5 = sounds.play(id5_3, a5, a5, 1, loop1, 1);
                                        isplaying5 = true;

                                    } else {
                                        sounds.pause(sound5);
                                        isplaying5 = false;
                                    }
                                }
                                else {
                                     sounds.play(id5_3, a5, a5, 1, loop1, 1);
                                }
                            }
                            else if (v.getId() == R.id.btn_key6)
                            {
                                if (loop1 == -1) {
                                    if (isplaying6 == false) {
                                        sound6 = sounds.play(id6_3, a6, a6, 1, loop1, 1);
                                        isplaying6 = true;

                                    } else {
                                        sounds.pause(sound6);
                                        isplaying6 = false;
                                    }
                                }
                                else {
                                     sounds.play(id6_3, a6, a6, 1, loop1, 1);
                                }
                            }

                            else if (v.getId() == R.id.plus1)
                            {
                                if (a1 < 0.95f)
                                {
                                    a1 = a1+0.05f;
                                    sounds.setVolume(sound1,a1,a1);
                                }
                            }
                            else if (v.getId() == R.id.minus1)
                            {
                                if (a1 > 0.05f)
                                {
                                    a1 = a1-0.05f;
                                    sounds.setVolume(sound1,a1,a1);
                                }
                            }
                            else if (v.getId() == R.id.plus2)
                            {
                                if (a2 < 0.95f)
                                {
                                    a2 = a2+0.05f;
                                    sounds.setVolume(sound2,a2,a2);
                                }
                            }
                            else if (v.getId() == R.id.minus2)
                            {
                                if (a2 > 0.05f)
                                {
                                    a2 = a2-0.05f;
                                    sounds.setVolume(sound2,a2,a2);
                                }
                            }
                            else if (v.getId() == R.id.plus3)
                            {
                                if (a3 < 0.95f)
                                {
                                    a3 = a3+0.05f;
                                    sounds.setVolume(sound3,a3,a3);
                                }
                            }
                            else if (v.getId() == R.id.minus3)
                            {
                                if (a3 > 0.05f)
                                {
                                    a3 = a3-0.05f;
                                    sounds.setVolume(sound3,a3,a3);
                                }
                            }
                            else if (v.getId() == R.id.plus4)
                            {
                                if (a4 < 0.95f)
                                {
                                    a4 = a4+0.05f;
                                    sounds.setVolume(sound4,a4,a4);
                                }
                            }
                            else if (v.getId() == R.id.minus4)
                            {
                                if (a4 > 0.05f)
                                {
                                    a4 = a4-0.05f;
                                    sounds.setVolume(sound4,a4,a4);
                                }
                            }
                            else if (v.getId() == R.id.plus5)
                            {
                                if (a5 < 0.95f)
                                {
                                    a5 = a5+0.05f;
                                    sounds.setVolume(sound5,a5,a5);
                                }
                            }
                            else if (v.getId() == R.id.minus5)
                            {
                                if (a5 > 0.05f)
                                {
                                    a5 = a5-0.05f;
                                    sounds.setVolume(sound5,a5,a5);
                                }
                            }
                            else if (v.getId() == R.id.plus6)
                            {
                                if (a6 < 0.95f)
                                {
                                    a6 = a6+0.05f;
                                    sounds.setVolume(sound6,a6,a6);
                                }
                            }
                            else if (v.getId() == R.id.minus6)
                            {
                                if (a6 > 0.05f)
                                {
                                    a6 = a6-0.05f;
                                    sounds.setVolume(sound6,a6,a6);
                                }
                            }
                            String a = "looping:"+"\n";
                            if (isplaying1 == true){
                                a = a+"sound1, volume = "+a1*100+"\n";
                            }
                    if (isplaying2 == true){
                        a= a + "sound2, volume = "+a2*100+"\n";
                    }
                    if (isplaying3 == true){
                        a = a+"sound3, volume = "+a3*100+"\n";
                    }
                    if (isplaying4 == true){
                        a = a+"sound4, volume = "+a4*100+"\n";
                    }
                    if (isplaying5 == true){
                        a = a+"sound5, volume = "+a5*100+"\n";
                    }
                    if (isplaying6 == true){
                        a = a + "sound6, volume = "+a6*100+"\n";
                    }
                    text.setText(a);
                    }
                }

                final MyListener myListener = new MyListener();

            button1.setOnClickListener(myListener);
            button2.setOnClickListener(myListener);
            button3.setOnClickListener(myListener);
            button4.setOnClickListener(myListener);
            button5.setOnClickListener(myListener);
            button6.setOnClickListener(myListener);
            volumndown1.setOnClickListener(myListener);
            volumnup1.setOnClickListener(myListener);
            volumndown2.setOnClickListener(myListener);
            volumnup2.setOnClickListener(myListener);
            volumndown3.setOnClickListener(myListener);
            volumnup3.setOnClickListener(myListener);
            volumndown4.setOnClickListener(myListener);
            volumnup4.setOnClickListener(myListener);
            volumndown5.setOnClickListener(myListener);
            volumnup5.setOnClickListener(myListener);
            volumndown6.setOnClickListener(myListener);
            volumnup6.setOnClickListener(myListener);


            class rate implements RadioGroup.OnCheckedChangeListener{
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    if (group == radioGroup1){

                        int sound1;

                        //RadioButton radio = (RadioButton)findViewById(check1);


                            if (myListener.isplaying1 == true&&checkedId == R.id.speed1) {
                                sounds.stop(myListener.sound1);
                                sound1 = sounds.play(id_1,myListener.a1,myListener.a1,1,myListener.loop1,1);
                                myListener.setsound1(sound1);
                            }
                            else if (myListener.isplaying1 == true&&checkedId == R.id.speed2) {sounds.stop(myListener.sound1);
                                sound1 = sounds.play(id_2,myListener.a1,myListener.a1,1,myListener.loop1,1);
                                myListener.setsound1(sound1);}
                            else if (myListener.isplaying1 == true&&checkedId == R.id.speed3) {sounds.stop(myListener.sound1);
                                sound1 = sounds.play(id_3,myListener.a1,myListener.a1,1,myListener.loop1,1);
                                myListener.setsound1(sound1);}

                            }



                    else if (group == radioGroup2){
                        int sound2;
                        if (myListener.isplaying2 == true&&checkedId == R.id.speed4) {sounds.pause(myListener.sound2);
                                sound2 = sounds.play(id2_1,myListener.a2,myListener.a2,1,myListener.loop1,1);
                                myListener.setsound2(sound2);}
                            if (myListener.isplaying2 == true&&checkedId == R.id.speed5) {sounds.pause(myListener.sound2);
                                sound2 = sounds.play(id2_2,myListener.a2,myListener.a2,1,myListener.loop1,1);
                                myListener.setsound2(sound2);}
                            if (myListener.isplaying2 == true&&checkedId == R.id.speed6) {sounds.pause(myListener.sound2);
                                sound2 = sounds.play(id2_3,myListener.a2,myListener.a2,1,myListener.loop1,1);
                                myListener.setsound2(sound2);}

                    }
                    else if (group == radioGroup3){
                        int sound3;

                            if (myListener.isplaying3 == true&&checkedId == R.id.speed7) {sounds.pause(myListener.sound3);
                                sound3 = sounds.play(id3_1,myListener.a3,myListener.a3,1,myListener.loop1,1);
                                myListener.setsound3(sound3);}
                            if (myListener.isplaying3 == true&&checkedId == R.id.speed8) {sounds.pause(myListener.sound3);
                                sound3 = sounds.play(id3_2,myListener.a3,myListener.a3,1,myListener.loop1,1);
                                myListener.setsound3(sound3);}
                            if (myListener.isplaying3 == true&&checkedId == R.id.speed9) {sounds.pause(myListener.sound3);
                                sound3 = sounds.play(id3_3,myListener.a3,myListener.a3,1,myListener.loop1,1);
                                myListener.setsound3(sound3);}

                    }
                    else if (group == radioGroup4){
                        int check4 = radioGroup4.getCheckedRadioButtonId();
                        int sound4;
                        if (myListener.isplaying4 == true&&checkedId == R.id.speed10) {sounds.pause(myListener.sound4);
                                sound4 = sounds.play(id4_1,myListener.a4,myListener.a4,1,myListener.loop1,1);
                                myListener.setsound4(sound4);}
                            if (myListener.isplaying4 == true&&checkedId == R.id.speed11) {sounds.pause(myListener.sound4);
                                sound4 = sounds.play(id4_2,myListener.a4,myListener.a4,1,myListener.loop1,1);
                                myListener.setsound4(sound4);}
                            if (myListener.isplaying4 == true&&checkedId == R.id.speed12) {sounds.pause(myListener.sound4);
                                sound4 = sounds.play(id4_3,myListener.a4,myListener.a4,1,myListener.loop1,1);
                                myListener.setsound4(sound4);}

                    }
                    else if (group == radioGroup5){
                        int check5 = radioGroup5.getCheckedRadioButtonId();
                        int sound5;
                        if (myListener.isplaying5 == true&&checkedId == R.id.speed13) {sounds.pause(myListener.sound5);
                                sound5 = sounds.play(id5_1,myListener.a5,myListener.a5,1,myListener.loop1,1);
                                myListener.setsound5(sound5);}
                            if (myListener.isplaying5 == true&&checkedId == R.id.speed14) {sounds.pause(myListener.sound5);
                                sound5 = sounds.play(id5_2,myListener.a5,myListener.a5,1,myListener.loop1,1);
                                myListener.setsound5(sound5);}
                            if (myListener.isplaying5 == true&&checkedId == R.id.speed15) {sounds.pause(myListener.sound5);
                                sound5 = sounds.play(id5_3,myListener.a5,myListener.a5,1,myListener.loop1,1);
                                myListener.setsound5(sound5);}

                    }
                    else if (group == radioGroup6){
                        int check6 = radioGroup6.getCheckedRadioButtonId();
                        int sound6;
                        if (myListener.isplaying6 == true&&checkedId == R.id.speed16) {sounds.pause(myListener.sound6);
                                sound6 = sounds.play(id6_1,myListener.a6,myListener.a6,1,myListener.loop1,1);
                                myListener.setsound6(sound6);}
                            if (myListener.isplaying6 == true&&checkedId == R.id.speed17) {sounds.pause(myListener.sound6);
                                sound6 = sounds.play(id6_2,myListener.a6,myListener.a6,1,myListener.loop1,1);
                                myListener.setsound6(sound6);}
                            if (myListener.isplaying6 == true&&checkedId == R.id.speed18) {sounds.pause(myListener.sound6);
                                sound6 = sounds.play(id6_3,myListener.a6,myListener.a6,1,myListener.loop1,1);
                                myListener.setsound6(sound6);}

                    }
                }
            }
            final rate rate = new rate();
            radioGroup1.setOnCheckedChangeListener(rate);
            radioGroup2.setOnCheckedChangeListener(rate);
            radioGroup3.setOnCheckedChangeListener(rate);
            radioGroup4.setOnCheckedChangeListener(rate);
            radioGroup5.setOnCheckedChangeListener(rate);
            radioGroup6.setOnCheckedChangeListener(rate);






            }
        }


