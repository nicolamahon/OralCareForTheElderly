# Oral Care for the Elderly					![app_icon_opaque](/screenshots/app_icon_opaque.png?raw=true "app_icon_opaque")
This mobile app was designed in conjunction with Dental Tech Group, to support the learning of oral care procedures for dental and nursing-home staff, in providing care to the elderly.

<b>Click image below to play video:</b>

[![Video](http://img.youtube.com/vi/N28Om1PuSe4/0.jpg)](http://www.youtube.com/watch?v=N28Om1PuSe4)

<b>PROJECT OVERVIEW</b><br>
This mobile app was designed as part of a 2nd year Object Oriented Programming assignment. We were given free reign to build anything we like, in any language, using any tools or software we desired. We decided that despite having no previous experience of mobile app development, we would like to push ourselves to build something using completely new tools, new to us at least.<br><br>
In deciding what exactly to make as a mobile app, we approached a business owner who had expressed an interested in building an app, and who like us, had no previous experience of such a project. We met with the business owner to discuss if this might be a feasible project from both sides. It would be an opportunity for us to build something that someone wanted, and provide the business owner with an opportunity to discover how mobile apps were designed and built from a business point of view. Both parties were in agreement, we were in uncharted territory, but we were there together. 

<b>REQUIREMENTS GATHERING</b><br>
To begin the requirements gathering we met with the business owner to discuss the project goals, and be sure we were on the same page. During the meeting the business owner explained what the app was intented for. It would be a teaching tool for nursing home staff in how to provide oral care to patients in their care, as well as an aid to general members of the public. We discussed with the business owner how the app might function from a technical point of view. The business owner had provided us with a number of information packs relating to the content of the application. Together we tried to fit the information contained in the packs, into a format that would work as part of the app design. 

<b>DESIGN</b><br>
Together we came up with a simple design; the app would be an information repository with a menu-lead interface, incorporating a database and with access to content in a restricted area through user-registration. 

<hr>
<i><b>Functionality</b></i><br>
- A repository for oral health care learning tools and techniques <br>
- Restricted access for Dental Tech Group clients <br><br>

<i><b>Special Requirements</b></i>
- Simple and intuitive design to suppport a majoratively aged user group
- Interface buttons or links to be large for users with dexterity issues
- Large font types for support to the visualy impaired
- Imagery where possible to assist with those with learning difficulties/illiteracy/non-English speakers

<i><b>Appearance of the App</b></i><br>
The app will be menu driven. The concept is that user's will select the menu option that is most specific to their needs. 
Responsibility for the design of the app, including the app icon, were freely given to us by the business owner. 

<i><b>Landing Page</b></i><br>
Here the user has the opportunity to register as a user and login to the content via a web-hosted database that we created as part of the project. There is also an option to view contact information for Dental Tech Group without having to login or register. The decision to restrict access to the content was a decision made by the business owner.  

![landing_page](/screenshots/landing_page.png?raw=true "landing_page")
![login](/screenshots/login.png?raw=true "login")
![register](/screenshots/register.png?raw=true "register")
![useful_info](/screenshots/useful_info.png?raw=true "useful_info")

<i><b>Main Menu</b></i><br>
The main menu options help to direct the user to the appropriate area of interest. 
1) Self Care - aimed at general users
2) Patient Care - specifically aimed at Carers/Nurses caring for Patients

![main_menu](/screenshots/main_menu.png?raw=true "main_menu")
![self_care_menu](/screenshots/self_care_menu.png?raw=true "self_care_menu")
![patient_care_menu](/screenshots/patient_care_menu.png?raw=true "patient_care_menu")

<i><b>Self Care</b></i><br>
This menu takes the user to a view where they can select from a number of further menu options.
1) Natural Teeth
2) Denture Care
3) Mouth Care
4) Difficult Mouth Opening 
5) Dry Mouth
6) Dexterity Issues
7) Why Oral Care is Important
8) Difficulty with Mouth Opening

![self_care_menu](/screenshots/self_care_menu.png?raw=true "self_care_menu")
![denture_care_menu](/screenshots/denture_care_menu.png?raw=true "denture_care_menu")
![oral_health](/screenshots/oral_health.png?raw=true "oral_health")
![natural_teeth_menu](/screenshots/natural_teeth_menu.png?raw=true "natural_teeth_menu")

<i><b>Self Care - Sub Menus</b></i><br>
These sub menus take the user to tutorials and information on various oral health issues. Content for these areas was provided by Dental Tech Group. Some of the sub-menus contain duplicate content, as the app redirects to various content sections. This requirement was submitted by the business owner as part of the design specification i.e. some categories of information fall under a number of different menus. To account for this, we designed the app with a number of activies, and linked access to them using buttons and intents in Java. That allowed for an activity to be created just once, but to be available to the user from many different areas within the app interface.

![dexterity1](/screenshots/dexterity1.png?raw=true "dexterity1")
![drymouth1](/screenshots/drymouth1.png?raw=true "drymouth1")
![whyoral1](/screenshots/whyoral1.png?raw=true "whyoral1")
![mouth_open](/screenshots/mouth_open.png?raw=true "mouth_open")

<i><b>Patient Care</b></i><br>
This section is typically aimed at Carers and Nurses. It takes the user to a view where they can select from a number of further menu options that assist them in deciding on a specific course of action, based on the situation they might be dealing with with a patient i.e. that they have lost or perhaps broken their denture. 
1) Change in Residents
2) Broken Dentures
3) Lost Denture
4) Emergency Services

![patient_care_menu](/screenshots/patient_care_menu.png?raw=true "patient_care_menu")
![broken_denture1](/screenshots/broken_denture1.png?raw=true "broken_denture1")
![lost_denture1](/screenshots/lost_denture1.png?raw=true "lost_denture1")
![emergency](/screenshots/emergency.png?raw=true "emergency")

<hr>
<b>SELF DIRECTED LEARNING</b><br>
In order to complete this project, we had to do a large amount of self directed learning, initially building some very simple apps using Android Studio in order to familiarise ourselves with the technology and concepts involved. 

Some of the things we learned on this project include:
- dealing with merge conflicts both in Android VCS and using the Git Shell
- how to hack the developer settings on our Android devices
- how to connect a database to an app using PHP within java
- how to use Android Studio to design and build an app
- implementing different Layout Views to optimise the UI of the app
- how to combine xml files and java files for more functionality
- how to interact with differant API's to improve our app e.g MapBox
- how to hack together ideas/solutions using various resources like YoutTube tutorials, StackOverflow and other internet sources. 

<b>THINGS WE ARE PROUD OF</b><br>
- the extent of self-directed learning, every step of this project we were pushing ourselves to research and learn through tutorials, videos and guidance documents. 
- scroll view implementation added to every view, this allows user's to rotate the device for comfort and still have full visibility of the app content
- swipe view implementation and page indicator functionality, this involved a number of iterations firstly with just text, then images, then using arrays, finally adding an indicator to show which swipe view the user was on. Each iteration involved taking apart the code already written into the app, and adding in only the additional concepts that were needed for the new iteration - a great exercise in refactoring.
- successfully managing the project remotely using GitHub
- building an online database and successfully linking it to the app this involved a lot of trial and error plus copious amounts of research. There are three differant versions that we went through in order to get it right, this involved adding a background worker class to take care of all the php because we are using the database in both the login page and the register page.
- the fact that the app is so robust and looks quite professional

<b><i>NOTE:</i></b> As the content of this app has been written and provided to us by Dental Tech Group for the purposes of this project, this GitHub repository will be made private after this assignment has been graded.

That's it, we hope you enjoy the app and perhaps find it interesting. 

<b>CONTRIBUTORS</b><br>
- Aaron Byrne (DT228)
- Nicola Mahon (DT228)
- Bevin Murray (Dental Tech Group)

<hr>
<b>Below are a selection of screenshots from <i>some</i> of the content on the mobile app, showing a typical navgation through the content:</b><br><br>

![landing_page](/screenshots/landing_page.png?raw=true "landing_page")
![login](/screenshots/login.png?raw=true "login")
![register](/screenshots/register.png?raw=true "register")
![useful_info](/screenshots/useful_info.png?raw=true "useful_info")
![main_menu](/screenshots/main_menu.png?raw=true "main_menu")
![self_care_menu](/screenshots/self_care_menu.png?raw=true "self_care_menu")
![oral_health](/screenshots/oral_health.png?raw=true "oral_health")
![gum_disease_causes](/screenshots/gum_disease_causes.png?raw=true "gum_disease_causes")
![gum_disease_signs](/screenshots/gum_disease_signs.png?raw=true "gum_disease_signs")
![self_care_menu](/screenshots/self_care_menu.png?raw=true "self_care_menu")
![dexterity1](/screenshots/dexterity1.png?raw=true "dexterity1")
![dexterity2](/screenshots/dexterity2.png?raw=true "dexterity2")
![self_care_menu](/screenshots/self_care_menu.png?raw=true "self_care_menu")
![drymouth1](/screenshots/drymouth1.png?raw=true "drymouth1")
![drymouth2](/screenshots/drymouth2.png?raw=true "drymouth2")
![self_care_menu](/screenshots/self_care_menu.png?raw=true "self_care_menu")
![mouth_open](/screenshots/mouth_open.png?raw=true "mouth_open")
![self_care_menu](/screenshots/self_care_menu.png?raw=true "self_care_menu")
![whyoral1](/screenshots/whyoral1.png?raw=true "whyoral1")
![main_menu](/screenshots/main_menu.png?raw=true "main_menu")
![patient_care_menu](/screenshots/patient_care_menu.png?raw=true "patient_care_menu")
![resident1](/screenshots/resident1.png?raw=true "resident1")
![resident2](/screenshots/resident2.png?raw=true "resident2")
![patient_care_menu](/screenshots/patient_care_menu.png?raw=true "patient_care_menu")
![broken_denture1](/screenshots/broken_denture1.png?raw=true "broken_denture1")
![broken_denture2](/screenshots/broken_denture2.png?raw=true "broken_denture2")
![patient_care_menu](/screenshots/patient_care_menu.png?raw=true "patient_care_menu")
![lost_denture1](/screenshots/lost_denture1.png?raw=true "lost_denture1")
![lost_denture2](/screenshots/lost_denture2.png?raw=true "lost_denture2")
![patient_care_menu](/screenshots/patient_care_menu.png?raw=true "patient_care_menu")
![emergency](/screenshots/emergency.png?raw=true "emergency")