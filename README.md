# COSC-310
- Name: Nils Kelley 
- Student Number: 80904394
- Final Projecct - A modification of Team 30's Assignment #3!

**Things I added**
- **(Google Translate API) Translation Feature**: The program is now able to translate the keywords (with their definitions) into German.
                      - See 'Device' class for overview of implementation
                      - Method: Type 'translate' before keyword for its definition
                                 - (Example) 
                                 -You: translate power 
                                 -Chatbot: Power - Supply (a device - i.e., your phone) with mechanical or electrical energy
- **(Wikipedia API) Definition Feature**: The program is now equipped to define the keywords to the user upon request.
 See 'Device' class for overview of implementation
                      - Method: Type 'define' before keyword for its definition
                                 - (Example) 
                                 -You: define power  
                                 -Chatbot:  ($) KEYWORD: Power (i.e., electricity)
                                            ($) TRANSLATION: Elektrizität
                                            ($) DEFINITION IN GERMAN: Elektrische Energie, elektrischer Strom
                                               (was du benutzt um dein händy aufzuladen)
- **GUI Changes**: See 'GUI1' class for overview of implementation 
- Increased the screen size (horizontally) by ~20%
- Changes color(s) from Black and White to White and Blue for easier readability and better appeal (in my opinion)
- Changed the initial / openning messages to the user to adapt to the new features + a little nicer of a design (in my opinion) 
 See 'Device' class for overview of implementation
                      - Method: Type 'define' before keyword for its definition                                               
                                               
                                   
**Overview** **from** **before**: 
This code is a conversation between a user and a chat bot to discuss problems revolving around phone repair
It is comprised of the following classes:

--> The first class is the Apple class, it is responsible for creating the list of keywords necessary for our program to return a corresponding response. It also creates the list of prepared responses.

--> The second class is the GUI class, it is responsible for developing the user interface for our chat bot. (all the visual stuff)

--> The 3rd class is the survey class, it is responsible for providing the closing survey for users to fill out. It will also save the results of the survey to a text file.

--> The 4th class is the main class and simply responible for creating a new GUI object

--> The 5th class is called the solution class. It is responsible for searching the device class, with the user-entered keyword, and finding a solution.

--> The 6th class is called the Test class and used for testing our code's functionality. 

--> The 7th class is called the logger class and it is reponible for recording the entire conversation between the user and bot. 

--> The 8th class is a new class called the Android Class which adds a functionality for android users. 

--> The 9th class is a new class called Spell check and it compares incorrectly spelt words with its data base to see if it can detect underlying meaning

--> The 10th class is a new class called POS which takes apart the sentences inputted by the user and seperates them into parts of speech. 

--> The 11th class is a new class called Digital Client. It is responsible for chatting with the other chat bot. 


The rest of the classes just help the other various classes work. In summary, added features are (improved GUI, Spellcheck, Conversation with other groups (#17) bot, POS recognition, a new functionality (device), and 5 non-answer responses.  


