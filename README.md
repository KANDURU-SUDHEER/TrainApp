Train Consist Management App

Overview
This project simulates railway train consist management using Java. It demonstrates safe runtime handling of cargo assignments using structured exception handling.

Project Structure
src/main contains application code
src/test contains test code

Package Structure
main
test

Use Case 15 Safe Cargo Assignment

Goal
Handle unsafe cargo assignments using try catch finally without crashing the system.

Features
Defines custom runtime exception
Validates cargo and bogie compatibility
Throws exception for unsafe assignments
Handles exception using catch block
Executes finally block for completion
Continues program execution safely

Safety Rule
Rectangular bogie cannot carry Petroleum cargo

Technologies Used
Java
Exception Handling
JUnit

How to Run

Compile the program
javac -d . TrainApp.java

Run the program
java main.TrainApp

Sample Output

UC15 Safe Cargo Assignment

Cargo assigned Petroleum
Error Unsafe cargo Rectangular bogie cannot carry Petroleum
Assignment attempt completed

Final Bogie States
Cylindrical -> Petroleum
Rectangular -> Coal

Concepts Covered
try catch finally
Runtime Exception
Custom Exception
Graceful error handling
Program continuation

Status
UC15 Completed Safe Cargo Handling
