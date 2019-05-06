# Mobile Drum Machine Team  
This is the group project of EC500 in Boston University, which is a good experience in building software.
## User Story
A drum machine is an Android app which is designed for the users to build their own beats.  
Basically, our drum machine is aimed to have the following functions:  
1. The users can compose their own music.
2. The users should be able to record the music they composed.  
3. It should be easy for the beginners to use based on the metronome in app.
4. Recommandation link for the users
## Defination of Sprint 1  
1.Building enviroment of Android app.  
2.The modular architechture should contains：  
` front end `   
` record `      
` sound processor `    
` sound files `     
` metronome `  
## Technologies
Tools: React Native  
Platform: Android Studio  (developed by Google which is especially used to build Android apps)  
Language: JavaScript and React  
APIs: Java Sound API  
icon source:
https://www.flaticon.com
## Frontend
For the frontend of our app, it is composed of 6 different sound effect botton, frequency choice of each beat, volume bottons, a loop botton and a display screen to show which beats are being used now.  
`sound effect botton:` we use different patterns to represent different sound effect  
`frequency choice:` This is a Radiogroup which allows users to choose the frequency of 0.5,1.0 or 1.5  
`volume bottons:` under each beat botton, there will be a set of volume bottons to change the volume of the beat.    
`loop botton:` This is the master switch. Switch on to start adding your own beats.  
'display screen:' the screen will shows the beats that are being used now.  
<div align=center><img src="https://github.com/ec500-software-engineering/project-13-mobile_drum_machine/blob/master/Frontend.png" width=400/></div>
## Run on real phone
To run drum machine on a real Android phone, put app-release.apk in folder release in your phone and run it.
