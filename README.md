# Messagin
It is an Android Studio Project I made for my Mobile Application Development Subject in my College. It is a basic form of Modern-Day Messaging Applications like WhatsApp

There are a few steps that are needed to be followed to get this application working on you’re Android Studio. 

This application uses Google Firebase as it’s backend as it was created for educational and learning purpose I had used all the free resource available on Firebase, it only allows the access of the app for 30 days for a single project and it is operated on test mode.


We require to understand how to disconnect and reconnect the application from Firebase. For reference you can used the following YouTube link to understand how long with following the steps given below as it contains app specific instructions.

YT link: - https://www.youtube.com/watch?v=SRpdgIl8j-g 
The above video is in Hindi but English Subtitles are also available.
1.	In Android Studio Switch to Project View, in app/ there is a file called google-services.json file, delete it.
2.	Switch to Android View and open gradle delete the Firebase dependencies (Auth, database and Storage) and sync the gradle.(Stpe 1 and 2 can be referred in the YoutTube Link)
3.	By Following the Step 1 and 2 the firebase is disconnected from the previous firebase project.
4.	Create a new Project in firebase and connected it to the android project (Can be reffered in the YouTube link).
5.	Then we have to build 3 options in Firebase they are Authentication, Storage and database.
6.	In the web of Firebase create Authentication option as Email/password.
7.	Create Storage and while creating it, it is necessary to create it in test mode or else the app won’t work.
8.	Similar with Database.
9.	Once they are created go to android studio /tools/Firebase and add SDK dependencies for all 3 Authentication, Database and Storage.
10.	Once the dependencies are added successfully Sync the gradle and the app would be ready to work.



Note:-
As this Project was for My Mobile Application Development Subject in my college I had created a document on this project which contains it’s images, technologies used, etc. 
It can be view using the following link: - https://drive.google.com/file/d/1QpjCZ9AFMIKm3By3P81N7tojndk7i_Cd/view?usp=drive_link


