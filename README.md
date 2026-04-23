Train Consist Management App

Overview
This project simulates train consist management and introduces defensive programming techniques. This use case ensures that invalid operations such as searching an empty train are prevented.

Project Structure
src/main contains application code
src/test contains test code

Package Structure
main
test

Use Case 20 Prevent Search on Empty Train

Goal
Prevent search operations on an empty train by throwing an exception early.

Features
Validates bogie collection before search
Throws IllegalStateException if empty
Stops execution immediately
Displays meaningful error message
Prevents invalid operations

Technologies Used
Java
Exception Handling
ArrayList
JUnit

How to Run

Compile the program
javac -d . TrainApp.java

Run the program
java main.TrainApp

Sample Output

UC20 Prevent Search on Empty Train

Exception in thread main
No bogies available for search operation

Concepts Covered
Defensive Programming
IllegalStateException
Fail fast principle
State validation
Runtime exception

Status
UC20 Completed Defensive Programming
