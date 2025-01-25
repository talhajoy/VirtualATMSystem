# Virtual ATM System

## Project Overview
The **Virtual ATM System** is a Java-based application that simulates an Automated Teller Machine (ATM). Users can check their balance, deposit money, and withdraw money. The project demonstrates key Object-Oriented Programming (OOP) concepts including:

- **Inheritance**
- **Polymorphism**
- **Encapsulation**
- **Abstraction**

---

## Features
- **Account Types**: Supports Savings Account and Current Account.
- **Operations**:
  - Check Balance
  - Deposit Money
  - Withdraw Money
  - Overdraft support for Current Accounts

---

## Technologies Used
- **Programming Language**: Java
- **Development Environment**: Any Java IDE (e.g., IntelliJ IDEA, Eclipse) or command-line tools.

---

## Directory Structure
```
VirtualATMSystem/
├── src/
│   ├── main/
│   │   ├── ATM.java                   # Main entry point for the application
│   │
│   ├── accounts/
│   │   ├── Account.java               # Base class for all account types
│   │   ├── SavingsAccount.java        # Derived class for savings accounts
│   │   ├── CurrentAccount.java        # Derived class for current accounts
│   │
│   ├── services/
│   │   ├── BankService.java           # Abstract class for ATM services
│
├── README.md                          # Project description and instructions
```

---

## How to Run the Project

### Using Command Line
1. Navigate to the `src/` directory.
2. Compile the files:
   ```
   javac main/ATM.java accounts/*.java services/*.java
   ```
3. Run the program:
   ```
   java main.ATM
   ```

### Using an IDE (e.g., IntelliJ, Eclipse)
1. Import the project into your IDE.
2. Set `ATM.java` as the main class.
3. Run the program.

---

## OOP Concepts Demonstrated

### Encapsulation
- The `Account` class uses private fields for sensitive data (e.g., balance) and provides public getter and setter methods to access and modify them.

### Inheritance
- The `SavingsAccount` and `CurrentAccount` classes inherit from the `Account` class and add specific behaviors.

### Polymorphism
- The `withdraw()` method is overridden in both `SavingsAccount` and `CurrentAccount` to handle withdrawals differently based on account type.

### Abstraction
- The `BankService` abstract class defines common operations (`checkBalance()`, `deposit()`, `withdraw()`) that all account types implement.

---

## Sample Output
```
Welcome to the Virtual ATM!
1. Savings Account
2. Current Account
Select account type: 1

Menu:
1. Check Balance
2. Deposit Money
3. Withdraw Money
4. Exit
Choose an option: 1
Balance: $1000.0

Choose an option: 2
Enter amount to deposit: 200
Successfully deposited $200.0

Choose an option: 3
Enter amount to withdraw: 300
Savings account withdrawal allowed: $300.0
Successfully withdrew $300.0

Choose an option: 4
Thank you for using the Virtual ATM!
```

---

## Author
Md. Abu Talha

---

## License
This project is for educational purposes and is not intended for commercial use.


