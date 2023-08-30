
# Scenario: Notification System

Let's assume that we have a notification system that sends notifications to users through various channels
(**email**, **SMS**, **messaging apps**). We want to design the system in such a way that we can add new
notification channels without modifying the existing code.

## Step 1: Creating a Notification Interface

We will define an interface called **NotificationChannel** that any notification channel must implement.

## Step 2: Implementing Existing Channels

We will implement the existing channels (email and SMS) using the **NotificationChannel** interface.

## Step 3: Creating the Notification System

We will create a class **NotificationSystem** that can send notifications through any channel that implements
NotificationChannel.

## Step 4: Testing the Notification System

## In the Context of OOP and SOLID:

* OCP (Open/Closed Principle): The notification system is open for extension (you can add new notification channels)
but closed for modification (you don't have to change NotificationSystem to add new channels).

* OOP (Object-Oriented Programming): We use polymorphism and interfaces to allow different notification channels to be
treated uniformly.

Since you're specializing in object-oriented programming with Java, this is an excellent example to consider.
The design outlined here adheres to SOLID principles, especially the Open/Closed Principle (OCP).
It makes use of interfaces and polymorphism, fundamental concepts in OOP, to allow for a system that's both extendable
and robust.
