Train Consist Management App

Overview
The Train Consist Management App is a console based Java application that simulates how a train consist is managed. A consist is a collection of bogies attached to a train. This use case focuses on managing passenger bogies dynamically.

Use Case 2 Add Passenger Bogies to Train

Goal
Allow dynamic addition, removal, and checking of passenger bogies using ArrayList.

Features
Creates a list to store passenger bogies
Adds bogies such as Sleeper AC Chair and First Class
Displays the list after adding bogies
Removes a bogie from the list
Checks whether a bogie exists in the list
Displays final train consist

Technologies Used
Java
ArrayList from Java Collections Framework

How to Run

Compile the program
javac UseCase2TrainConsistMgmt.java

Run the program
java UseCase2TrainConsistMgmt

Sample Output

========================================
UC2 Add Passenger Bogies to Train
=================================

Bogies after addition
[Sleeper, AC Chair, First Class]

Bogies after removal of AC Chair
[Sleeper, First Class]

Is Sleeper bogie present true

Final Train Consist
[Sleeper, First Class]

Concepts Covered
ArrayList
add method
remove method
contains method
CRUD operations
Insertion order preservation

Status
UC2 Completed Passenger Bogie Management
