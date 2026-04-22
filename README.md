Train Consist Management App

Overview
This application simulates train consist management. In this use case, the system preserves insertion order of bogies while preventing duplicates using LinkedHashSet.

Use Case 5 Preserve Insertion Order of Bogies

Goal
Maintain insertion order and ensure no duplicate bogies are added.

Features
Stores bogies in insertion order
Prevents duplicate entries automatically
Displays final train formation

Technologies Used
Java
LinkedHashSet from Java Collections Framework

How to Run

Compile the program
javac TrainApp.java

Run the program
java TrainApp

Sample Output

========================================
UC5 Preserve Insertion Order
============================

Final Train Formation
[Engine, Sleeper, Cargo, Guard]

Concepts Covered
Set Interface
LinkedHashSet
add method
Automatic duplicate removal
Insertion order preservation

Status
UC5 Completed Ordered Unique Bogie Management
