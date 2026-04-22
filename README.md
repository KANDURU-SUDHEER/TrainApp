Train Consist Management App

Overview
This project is a console based Java application that simulates how a railway system manages a train consist. A consist is a collection of bogies attached to a train. The application demonstrates multiple Java concepts through different use cases.

Project Structure
The project follows standard Java structure with separate folders for main and test code.

src/main contains application code
src/test contains test cases

Package Structure
Main class package
com.trainapp.main

Test class package
com.trainapp.test

Use Case 10 Count Total Seats in Train

Goal
Calculate total seating capacity of all bogies using stream aggregation.

Features
Creates a list of bogies
Stores bogie name and capacity
Uses stream to process data
Applies map to extract capacity
Uses reduce to calculate total seats
Displays total seating capacity

Technologies Used
Java
Stream API
ArrayList
JUnit for testing

How to Run

Compile the program
javac -d . TrainApp.java

Run the program
java com.trainapp.main.TrainApp

How to Run Tests

Run using IDE or JUnit runner

Sample Output

========================================
UC10 Count Total Seats in Train
===============================

Bogies in Train
Sleeper -> 72
AC Chair -> 56
First Class -> 24
Sleeper -> 70

Total Seating Capacity 222

Concepts Covered
Stream API
map method
reduce method
Aggregation
Functional programming

Status
UC10 Completed Total Seat Calculation
