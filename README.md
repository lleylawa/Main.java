# Personal Account Management

## Overview

This project implements a simple personal account management system in Java. It allows users to create a bank account, deposit and withdraw money, and keep track of their transaction history.

## Features

- **Transaction Types**: Supports deposits and withdrawals.
- **Transaction History**: Keeps a record of all transactions.
- **Balance Tracking**: Provides the current balance of the account.
- **Error Handling**: Validates deposit and withdrawal amounts.

## Classes

### 1. `TransactionType`
An enum representing the type of transaction:
- `DEPOSIT`
- `WITHDRAWAL`

### 2. `Amount`
A class representing a transaction amount, including:
- `amount`: The monetary value of the transaction.
- `transactionType`: The type of transaction (DEPOSIT or WITHDRAWAL).

### 3. `PersonalAccount`
A class representing a personal bank account, including:
- `accountNumber`: Unique identifier for the account.
- `accountHolder`: The name of the account holder.
- `balance`: The current balance in the account.
- `transactions`: A list to store transaction history.

#### Methods:
- `void deposit(double amount)`: Adds money to the account.
- `void withdraw(double amount)`: Takes money out of the account.
- `void printTransactionHistory()`: Displays all transactions.
- `double getBalance()`: Returns the current balance.
- `int getAccountNumber()`: Returns the account number.
- `String getAccountHolder()`: Returns the account holder's name.
