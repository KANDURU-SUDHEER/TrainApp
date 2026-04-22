Train Consist Management App

Overview
This project is a console based Java application that simulates how a railway system manages a train consist. It demonstrates multiple Java concepts through different use cases such as collections, streams, and validation.

Project Structure
The project is organized into main and test source folders.

src/main contains application code
src/test contains test code

Package Structure
Main class package
main

Test class package
test

Use Case 12 Safety Compliance Check for Goods Bogies

Goal
Ensure that goods bogies follow safety rules using stream validation.

Features
Creates goods bogie list with type and cargo
Uses stream to process data
Applies safety validation using allMatch
Checks cylindrical bogie cargo rule
Displays whether train is safe or unsafe

Safety Rule
Cylindrical bogies must carry only Petroleum
Other bogie types can carry any cargo

Technologies Used
Java
Stream API
ArrayList
JUnit for testing

How to Run

Compile the program
javac -d . TrainApp.java

Run the program
java main.TrainApp

How to Run Tests

Run using IDE or JUnit runner

Sample Output

========================================
UC12 Safety Compliance Check
============================

Train Safety Status Safe

Concepts Covered
Streams API
allMatch method
Lambda expressions
Conditional logic
Business rule validation

Status
UC12 Completed Safety Validation
