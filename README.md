Train Consist Management App

Overview
This application simulates train consist management. In this use case, the system maintains the correct order of bogies using LinkedList.

Use Case 4 Maintain Ordered Bogie Consist

Goal
Maintain the correct sequence of bogies and allow insertion and deletion at specific positions.

Features
Creates a LinkedList for train consist
Adds bogies in order
Inserts a bogie at a specific position
Removes bogies from beginning and end
Displays final ordered train

Technologies Used
Java
LinkedList from Java Collections Framework

How to Run

Compile the program
javac TrainApp.java

Run the program
java TrainApp

Sample Output

========================================
UC4 Maintain Ordered Bogie Consist
==================================

Initial Train Consist
[Engine, Sleeper, AC, Cargo, Guard]

After inserting Pantry at position 2
[Engine, Sleeper, Pantry, AC, Cargo, Guard]

After removing first and last bogies
[Sleeper, Pantry, AC, Cargo]

Final Train Consist
[Sleeper, Pantry, AC, Cargo]

Concepts Covered
LinkedList
add method
add at index
remove method
Order preservation

Status
UC4 Completed Ordered Bogie Management
