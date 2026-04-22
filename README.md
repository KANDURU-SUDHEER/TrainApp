Train Consist Management App

Overview
This project is a console based Java application that simulates how a train consist is managed. It demonstrates validation and error handling using custom exceptions.

Project Structure
src/main contains application code
src/test contains test code

Package Structure
main
test

Use Case 14 Handle Invalid Bogie Capacity

Goal
Prevent invalid passenger bogies from being created using custom exception handling.

Features
Defines custom exception class
Validates capacity during object creation
Throws exception for invalid capacity
Prevents incorrect data entry
Displays valid bogies only

Validation Rule
Capacity must be greater than zero

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

========================================
UC14 Handle Invalid Bogie Capacity
==================================

Error Capacity must be greater than zero

Valid Bogies
Sleeper -> 72

Concepts Covered
Custom Exception
throw keyword
throws keyword
Fail fast validation
Defensive programming

Status
UC14 Completed Custom Exception Handling
