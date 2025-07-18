# Problems For Static Factory Methods

## Beginner Level

### 1. **Temperature Converter**

**Task:** Create a `Temperature` class with a private constructor and static factory methods:

* `fromCelsius(double c)`
* `fromFahrenheit(double f)`
* `fromKelvin(double k)`

All should convert to an internal Celsius representation.

---

### 2. **RGB Color**

**Task:** Implement a `Color` class.

* Use static factory methods: `fromRGB(int r, int g, int b)`, `fromHex(String hex)`
* Validate inputs inside the factory methods.

---

### 3. **Point2D Factory**

**Task:** Create a `Point2D` class with:

* `Point2D.fromCartesian(double x, double y)`
* `Point2D.fromPolar(double radius, double angle)`

Both should return the same class but created differently.

---

## Intermediate Level

### 4. **User Roles**

**Task:** Create a `User` class with different roles.

* `User.admin(String name)`
* `User.moderator(String name)`
* `User.regular(String name)`
* Hide the constructor. Store the role internally.

---

### 5. **Immutable Range**

**Task:** Create an immutable `Range` class:

* `Range.of(int startInclusive, int endExclusive)`
* `Range.closed(int startInclusive, int endInclusive)`
* `Range.singleton(int value)`

Include logic to validate the range and handle edge cases.

---

### 6. **UUID Generator Wrapper**

**Task:** Implement a `UniqueId` class:

* `UniqueId.randomUUID()`
* `UniqueId.fromString(String uuid)`
* Encapsulate the `java.util.UUID` internally.

---

## Advanced Level

### 7. **Service Registry**

**Task:** Build a `ServiceFactory` class with methods like:

* `ServiceFactory.getDatabaseService()`
* `ServiceFactory.getEmailService()`

Use interfaces for the services and lazy initialization (or caching) inside factory methods.

---

### 8. **Shape Factory (Polymorphic)**

**Task:** Design an abstract class `Shape` with:

* `Shape.newCircle(double radius)`
* `Shape.newRectangle(double width, double height)`
* Internally return different subclasses but expose only `Shape`.

---

### 9. **Value Class Cache (Flyweight)**

**Task:** Implement a `Currency` class that:

* Uses a static map to cache instances for currency codes (`USD`, `EUR`, etc.)
* Has method: `Currency.of(String code)`
* Enforces only one instance per code.

---

### 10. **Factory Registry Using Reflection**

**Task:** Build a factory manager:

* Static method: `Object create(String type)`
* Internal registry maps type names to suppliers
* Use `Class.forName()` or reflection for dynamic instantiation

---
