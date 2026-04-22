Train Consist Management App

Overview
This project is a console based Java application that simulates how a railway system manages a train consist. It demonstrates multiple Java concepts through different use cases such as collections, streams, validation, and performance measurement.

Project Structure
The project is organized into main and test source folders.

src/main contains application code
src/test contains test code

Package Structure
Main class package
main

Test class package
test

Use Case 13 Performance Comparison

Goal
Compare execution performance of loop based filtering and stream based filtering using time measurement.

Features
Creates a large dataset of bogies
Applies filtering using loop
Applies filtering using stream
Measures execution time using System.nanoTime
Displays execution time results
Compares performance of both approaches

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
UC13 Performance Comparison
===========================

Loop Filtering Time (ns) 123456
Stream Filtering Time (ns) 234567

Loop Result Size 20000
Stream Result Size 20000

Concepts Covered
System.nanoTime
Performance benchmarking
Loop based processing
Stream based processing
Filtering logic

Status
UC13 Completed Performance Comparison
