# Car Rental System

## **Project Overview**
The Car Rental System is a Java-based application that allows users to browse, book, and manage car rentals. It provides an interface for admins to manage car inventory and rental history while enabling users to search for available cars, book them for a desired period, and generate invoices.

---

## **Features**

### **Admin Features**
- Add, update, or remove car details (model, type, availability, rental price).
- View rental history and manage customer records.

### **User Features**
- Register and log in.
- Browse available cars by type (e.g., SUV, Sedan, Hatchback).
- Book a car, view rental charges, and confirm booking.
- Return cars and calculate rental duration and charges.

### **General Features**
- Store data in a database (e.g., MySQL) or files.
- Generate invoices for completed rentals.

---

## **Project Structure**
```
CarRentalSystem/
├── src/
│   ├── Main.java
│   ├── Admin.java
│   ├── Customer.java
│   ├── Car.java
│   ├── RentalService.java
├── resources/
│   ├── cars.csv (or cars.sql for DB)
│   ├── rentals.csv (or rentals.sql for DB)
└── README.md
```

---

## **Tech Stack**
- **Programming Language**: Java
- **Database**: MySQL (or file handling for simplicity)
- **Optional GUI**: JavaFX or Swing
- **Library**: JDBC for database interaction

---

## **Setup Instructions**

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/ANSXX/car-rental-system.git
   cd car-rental-system
   ```

2. **Configure the Database**:
   - Create a MySQL database.
   - Import the provided SQL scripts (`cars.sql` and `rentals.sql`) in the `resources/` folder.

3. **Compile the Code**:
   ```bash
   javac -d bin src/*.java
   ```

4. **Run the Application**:
   ```bash
   java -cp bin Main
   ```

---

## **Database Schema**

### **Cars Table**:
| Column         | Data Type  | Description              |
|----------------|------------|--------------------------|
| `car_id`       | INT        | Unique identifier for cars |
| `model`        | VARCHAR    | Model name of the car    |
| `type`         | VARCHAR    | Type (SUV, Sedan, etc.)  |
| `availability` | BOOLEAN    | Availability status      |
| `rental_price` | DECIMAL    | Rental price per day     |

### **Customers Table**:
| Column         | Data Type  | Description              |
|----------------|------------|--------------------------|
| `customer_id`  | INT        | Unique identifier for customers |
| `name`         | VARCHAR    | Name of the customer     |
| `email`        | VARCHAR    | Email address            |
| `phone`        | VARCHAR    | Contact number           |

### **Rentals Table**:
| Column         | Data Type  | Description              |
|----------------|------------|--------------------------|
| `rental_id`    | INT        | Unique identifier for rentals |
| `car_id`       | INT        | Foreign key to Cars table |
| `customer_id`  | INT        | Foreign key to Customers table |
| `start_date`   | DATE       | Start date of the rental |
| `end_date`     | DATE       | End date of the rental   |
| `total_amount` | DECIMAL    | Total rental cost        |

---

## **Sample Workflows**

### User Books a Car
1. Logs into the system.
2. Searches for available cars by type.
3. Selects a car and inputs the rental period.
4. Confirms booking and views an invoice.

### Admin Adds a New Car
1. Logs into the system as admin.
2. Inputs car details (model, type, rental price).
3. Car is added to the database and marked available.

---

## **Future Enhancements**
- Add payment gateway integration.
- Implement a rating and review system for cars.
- Enhance the GUI using JavaFX.
- Include advanced search and filter options.

---