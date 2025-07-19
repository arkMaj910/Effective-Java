# Builder Pattern

## Problem 1: Design a NutritionFacts class

Build a class to represent nutritional info on a food label:  

Required: `servingSize`, `servings`  
Optional: `calories`, `fat`, `sodium`, `carbohydrate`

- All fields should be final and immutable.  
- The class should be constructed using the **Builder pattern** (inner static builder class).
- Include a `toString()` method for pretty printing.  

## Problem 2: Create a Computer configuration builder

You are designing a system for building PC configurations.  

Required fields: `CPU`, `RAM`

Optional fields:`GPU`, `SSD`, `PSU`, `coolingSystem`

 Constraints:

    Validate that if GPU is added, PSU must also be present (or throw IllegalStateException)

    All fields should be immutable

## Problem 3: Implement a FlightTicket Builder

Design a class to represent a flight ticket with the following:

Required:

    passengerName

    flightNumber

    departureDate

Optional:

    mealPreference

    seatNumber

    extraBaggage

    frequentFlyerNumber

Bonus:

    Prevent invalid combinations (e.g., can't set extraBaggage without seatNumber)

    Add a .build() method that throws an exception if required fields are missing

## Problem 4: HttpRequest Builder (similar to real-world use)

Design a class to build an immutable HTTP request object.

Required:

    url

    method (GET, POST, etc.)

Optional:

    headers

    body

    timeoutSeconds

🎯 Add validations like:

    body is only allowed for POST/PUT

    Throw IllegalStateException if invalid combinations are set

## Problem 5: Bonus — Fluent Builder with Generics (Pizza)

Make a base class Pizza and extend it with NyPizza, CalzonePizza, etc.

    Use a builder hierarchy using recursive generics to maintain type safety

    Required fields: size

    Optional fields: toppings

    Each subclass can add specific options
