package com.example;

public class StudentGrade {

    public String calculateGrade(int marks) {
        if (marks >= 90) return "A";
        else if (marks >= 75) return "B";
        else if (marks >= 50) return "C";
        else return "F";
    }
}
----------------------------
package com.example;

public class BankAccount {

    private double balance = 0;

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            throw new ArithmeticException("Insufficient balance");
        }
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}
----------------------------

package com.example;

public class EmployeeSalary {

    public double calculateSalary(double basic, double bonus) {
        return basic + bonus;
    }
}




  ----------------------------

package com.example;

import java.util.HashMap;

public class Library {

    private HashMap<String, Boolean> books = new HashMap<>();

    public void addBook(String book) {
        books.put(book, true);
    }

    public void issueBook(String book) {
        if (!books.containsKey(book) || !books.get(book)) {
            throw new RuntimeException("Book not available");
        }
        books.put(book, false);
    }

    public boolean isBookAvailable(String book) {
        return books.getOrDefault(book, false);
    }
}
package com.example;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }
}

------------------
  Test Scripts

  package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testGrade() {
        StudentGrade sg = new StudentGrade();
        assertEquals("A", sg.calculateGrade(95));
        assertEquals("C", sg.calculateGrade(55));
    }

    @Test
    public void testBank() {
        BankAccount acc = new BankAccount();
        acc.deposit(1000);
        acc.withdraw(200);
        assertEquals(800, acc.getBalance(), 0.01);
    }

    @Test
    public void testSalary() {
        EmployeeSalary es = new EmployeeSalary();
        assertEquals(5500, es.calculateSalary(5000, 500), 0.01);
    }

    @Test
    public void testLibrary() {
        Library lib = new Library();
        lib.addBook("Java");
        assertTrue(lib.isBookAvailable("Java"));
        lib.issueBook("Java");
        assertFalse(lib.isBookAvailable("Java"));
    }

    @Test
    public void testCalculator() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.add(2, 3));
        assertEquals(1, calc.subtract(3, 2));
    }
}







  ----------------------------








  ----------------------------
