
# 🚗 Car Showroom Management System

This is a **Java-based console application** that simulates a simple car showroom management system using **Object-Oriented Programming (OOP)** principles.

---

## 🔧 Features

- Add new cars to showroom inventory
- Register new customers
- Sell cars to customers
- Display all available cars
- Display registered customers
- Uses OOP concepts like:
  - Encapsulation
  - Abstraction
  - Inheritance (via interface)
  - Polymorphism

---

## 📁 Project Structure

- `Car`: Represents a car in the inventory.
- `Customer`: Represents a customer.
- `Showroom`: Manages inventory and customer records.
- `Displayable`: Interface to ensure consistent display behavior.
- `CarShowroomApp`: Main application class with the console menu.

---

## ▶️ How to Run

1. Make sure you have **Java 8 or above** installed.
2. Compile the project:
   ```bash
   javac CarShowroomApp.java
   ```
3. Run the application:
   ```bash
   java CarShowroomApp
   ```

---

## 📸 Sample Output

```
--- Car Showroom Management ---
1. Add Car
2. Register Customer
3. Sell Car
4. Display Cars
5. Display Customers
0. Exit
Enter choice:
```

---

## 💡 Example Use Case

> Abdullah opens his own showroom called **Auto Concept**. He uses this system to add cars like Honda Civic, manage buyers, and track sold units through a clean and simple terminal interface.

---

## 📚 OOP Concepts Used

| Concept        | Description                           |
|----------------|---------------------------------------|
| Abstraction    | Via `Displayable` interface           |
| Encapsulation  | Private fields with public methods    |
| Polymorphism   | `displayInfo()` behaves differently   |
| Composition    | Showroom has `Car` and `Customer` lists |

---

## 🧑‍💻 Author

**Muhammad Abdullah**  
Student of Software Engineering  
Passionate about cars and clean OOP design 🚘

---

## 🏁 License

This project is open for learning and personal use. Feel free to expand it!
