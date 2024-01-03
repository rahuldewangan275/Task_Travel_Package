# Travel Agency System

## Task

Design, implement, and test a software system that facilitates travel agencies in managing their travel packages' itinerary and passengers.

## Specification

1. Each travel package includes a name, passenger capacity, itinerary (list of destinations), and a list of its passengers.
2. Destinations have a name and a list of available activities.
3. Each activity includes a name, description, cost, and capacity, available at a specific destination.
4. Passengers can sign up for zero or more activities at each destination of the travel package.
5. Once an activity reaches its capacity, no more passengers can sign up for it.
6. Passengers have a name and a passenger number.
7. Passengers can be standard, gold, or premium, each with specific rules for signing up for activities:
    - Standard passengers have a balance, and the cost is deducted from their balance when signing up.
    - Gold passengers receive a 10% discount on the activity cost, deducted from their balance.
    - Premium passengers can sign up for activities for free.

## Functions

1. **Print Itinerary:**
   - Display the travel package name.
   - List destinations with details of available activities:
     - Activity name
     - Cost
     - Capacity
     - Description

2. **Print Passenger List:**
   - Display package name.
   - Show passenger capacity and the number currently enrolled.
   - List each passenger's name and number.

3. **Print Individual Passenger Details:**
   - Display a specific passenger's:
     - Name
     - Passenger number
     - Balance (if applicable)
     - List of signed-up activities, including destination, and the price paid.

4. **Print Available Activities:**
   - Display details of activities with available spaces, including the number of spaces.

## Usage

To use the system, create instances of the necessary classes (e.g., `TravelPackage`, `Destination`, `Activity`, `Passenger`) and utilize the provided functions to manage itineraries, passengers, and activities effectively.

Feel free to refer to the class methods and their documentation for seamless integration into your travel agency system.
