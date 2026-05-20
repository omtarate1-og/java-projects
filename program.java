1)write a multithreading program in java to display the numbers from 1 to 100.

package hello;
import java.util.ArrayList;
import java.util.Scanner;

class Student {
    int rollNo;
    String name;

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }
}

public class StudentDelete {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        // Adding student details
        students.add(new Student(1, "Ram"));
        students.add(new Student(2, "Sita"));
        students.add(new Student(3, "Amit"));

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter roll number to delete: ");
        int roll = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).rollNo == roll) {
                students.remove(i);
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Student deleted successfully.");
        } else {
            System.out.println("Student not found.");
        }

        System.out.println("\nRemaining Students:");
        for (Student s : students) {
            System.out.println(s.rollNo + " " + s.name);
        }

        sc.close();
    }
}

2)write a java program in multithreading to display "hello world" message 10 times

package hello;
class HelloThread extends Thread {

    @Override
    public void run() {
        // Print Hello World 10 times
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + ": Hello World");
            try {
                Thread.sleep(500); // Optional: small delay
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class HelloWorld {

    public static void main(String[] args) {

        // Create two thread objects
        HelloThread t1 = new HelloThread();
        t1.setName("Thread-1");

        HelloThread t2 = new HelloThread();
        t2.setName("Thread-2");

        // Start threads
        t1.start();
        t2.start();
    }
}

3)write a java program to create Emp(Eno,EName,Sal)table and insert record into it.

package hello;

import java.util.ArrayList;
import java.util.Scanner;

class Emp {
    int Eno;
    String EName;
    double Sal;

    // Constructor
    Emp(int Eno, String EName, double Sal) {
        this.Eno = Eno;
        this.EName = EName;
        this.Sal = Sal;
    }
}

public class EmpTable {

    public static void main(String[] args) {

        ArrayList<Emp> empList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employee records do you want to insert? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for employee " + (i + 1));

            System.out.print("Enter Employee Number: ");
            int eno = sc.nextInt();
            sc.nextLine(); // consume newline

            System.out.print("Enter Employee Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Salary: ");
            double sal = sc.nextDouble();

            // Add employee to list
            empList.add(new Emp(eno, name, sal));
        }

        // Display all employee records
        System.out.println("\nEmployee Table:");
        System.out.println("Eno\tEName\tSal");
        for (Emp e : empList) {
            System.out.println(e.Eno + "\t" + e.EName + "\t" + e.Sal);
        }

        sc.close();
    }
}

4)write a java program to count the number of records in a table.

package hello;
import java.util.ArrayList;
import java.util.Scanner;

class Emp {
    int Eno;
    String EName;
    double Sal;

    // Constructor
    Emp(int Eno, String EName, double Sal) {
        this.Eno = Eno;
        this.EName = EName;
        this.Sal = Sal;
    }
}

public class EmpCoun {

    public static void main(String[] args) {

        ArrayList<Emp> empList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employee records do you want to insert? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for employee " + (i + 1));

            System.out.print("Enter Employee Number: ");
            int eno = sc.nextInt();
            sc.nextLine(); // consume newline

            System.out.print("Enter Employee Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Salary: ");
            double sal = sc.nextDouble();

            // Add employee to list
            empList.add(new Emp(eno, name, sal));
        }

        // Count the number of records
        System.out.println("\nTotal number of records in the table: " + empList.size());

        sc.close();
    }
}

5)write a multithreading program in java to display all characters between A to Z after 5 seconds.

package hello;
public class CharDisplay extends Thread {

    @Override
    public void run() {
        try {
            // Wait for 5 seconds
            Thread.sleep(5000);

            // Display characters from A to Z
            for (char ch = 'A'; ch <= 'Z'; ch++) {
                System.out.println(Thread.currentThread().getName() + ": " + ch);
                Thread.sleep(200); // optional delay for readability
            }

        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        // Create thread objects
        CharDisplay t1 = new CharDisplay();
        t1.setName("Thread-1");

        CharDisplay t2 = new CharDisplay();
        t2.setName("Thread-2");

        // Start threads
        t1.start();
        t2.start();
    }
}

6)Write a Java program to accept the details of students (rno, sname, per) at least 5 Records.

package hello;
import java.util.ArrayList;
import java.util.Scanner;

class Student {
    int rno;
    String sname;
    double per;

    // Constructor
    Student(int rno, String sname, double per) {
        this.rno = rno;
        this.sname = sname;
        this.per = per;
    }
}

public class StudentRecords {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        System.out.println("Enter details of at least 5 students:");

        for (int i = 1; i <= 5; i++) {
            System.out.println("\nStudent " + i + ":");

            System.out.print("Enter Roll Number: ");
            int rno = sc.nextInt();
            sc.nextLine(); // consume newline

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Percentage: ");
            double per = sc.nextDouble();

            // Add student to list
            students.add(new Student(rno, name, per));
        }

        // Display all student records
        System.out.println("\nStudent Records:");
        System.out.println("Rno\tName\tPercentage");

        for (Student s : students) {
            System.out.println(s.rno + "\t" + s.sname + "\t" + s.per);
        }

        sc.close();
    }
}

7)Write a java program to display IP address of a machine.

package hello;
import java.net.InetAddress;

public class DisplayIP {

    public static void main(String[] args) {
        try {
            // Get the local host (machine) IP address
            InetAddress ip = InetAddress.getLocalHost();

            // Display IP address and host name
            System.out.println("Host Name: " + ip.getHostName());
            System.out.println("IP Address: " + ip.getHostAddress());

        } catch (Exception e) {
            System.out.println("Error occurred: " + e);
        }
    }
}

8)Write a java program to accept a String from user and display each vowel from a 
   String after 3 seconds.

package hello;
import java.util.Scanner;
public class VowelDisplay {

    public static void main(String[] args) {
        // Accept string input from user
        String input = getUserInput();

        // Display vowels with 3-second delay
        displayVowelsWithDelay(input);
    }

    // Method to get user input
    public static String getUserInput() {
        Scanner scanner = new Scanner(System.in); // Scanner to read input
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        scanner.close(); // Close scanner safely
        return input;
    }

    // Method to display vowels with 3-second delay
    public static void displayVowelsWithDelay(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (isVowel(ch)) {
                System.out.println(ch);

                // Pause for 3 seconds
                try {
                    Thread.sleep(3000); // 3000 milliseconds = 3 seconds
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt(); // Preserve interrupt status
                    System.out.println("Thread interrupted: " + e.getMessage());
                }
            }
        }
    }

    // Method to check if a character is a vowel
    public static boolean isVowel(char ch) {
        return "AEIOUaeiou".indexOf(ch) != -1; // Handles both uppercase and lowercase
    }
}

9)Write a java program using multithreading for the following: 
Display all the odd numbers between 1 to 10

package hello;
//Program to display odd numbers between 1 to 10 using multithreading
public class OddNumbersThread {

 public static void main(String[] args) {
     // Step 1: Create a thread for printing odd numbers
     Thread oddThread = new Thread(new OddNumberPrinter());

     // Step 2: Start the thread
     oddThread.start();

     // Optional: Wait for the thread to finish
     try {
         oddThread.join();
     } catch (InterruptedException e) {
         Thread.currentThread().interrupt();
         System.out.println("Thread interrupted: " + e.getMessage());
     }
 }

 // Method stub: Class implementing Runnable to print odd numbers
 static class OddNumberPrinter implements Runnable {

     @Override
     public void run() {
         printOddNumbers(1, 10);
     }

     // Method stub to print odd numbers between a given range
     public void printOddNumbers(int start, int end) {
         for (int i = start; i <= end; i++) {
             if (i % 2 != 0) { // Check if number is odd
                 System.out.println(i);

                 // Optional: Sleep for 1 second between numbers
                 try {
                     Thread.sleep(1000);
                 } catch (InterruptedException e) {
                     Thread.currentThread().interrupt();
                     System.out.println("Thread interrupted: " + e.getMessage());
                 }
             }
         }
     }
 }
}

10)Write a java program to accept the details of Hospital (HId, HName, Address, PH_No)
 and display the details.

package hello;

import java.util.Scanner;

public class HospitalProject {

    public static void main(String[] args) {
        // Step 1: Accept hospital details
        Hospital hospital = getHospitalDetails();

        // Step 2: Display hospital details
        displayHospitalDetails(hospital);
    }

    // Method to accept hospital details from user
    public static Hospital getHospitalDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Hospital ID:");
        int hId = scanner.nextInt();
        scanner.nextLine(); // consume newline

        System.out.println("Enter Hospital Name:");
        String hName = scanner.nextLine();

        System.out.println("Enter Address:");
        String address = scanner.nextLine();

        System.out.println("Enter Phone Number:");
        String phNo = scanner.nextLine();

        return new Hospital(hId, hName, address, phNo);
    }

    // Method to display hospital details
    public static void displayHospitalDetails(Hospital hospital) {
        System.out.println("\n--- Hospital Details ---");
        System.out.println("Hospital ID: " + hospital.getHId());
        System.out.println("Hospital Name: " + hospital.getHName());
        System.out.println("Address: " + hospital.getAddress());
        System.out.println("Phone Number: " + hospital.getPhNo());
    }
}

// Class to hold hospital details
class Hospital {
    private int hId;
    private String hName;
    private String address;
    private String phNo;

    public Hospital(int hId, String hName, String address, String phNo) {
        this.hId = hId;
        this.hName = hName;
        this.address = address;
        this.phNo = phNo;
    }

    // Getters
    public int getHId() { return hId; }
    public String getHName() { return hName; }
    public String getAddress() { return address; }
    public String getPhNo() { return phNo; }
}

11)Write a JAVA program to accept Name and Age of Voter and check whether he is eligible for voting or not.

package hello;
import java.util.Scanner;

public class VoterEligibility {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Accept name
        System.out.print("Enter Voter Name: ");
        String name = sc.nextLine();

        // Accept age
        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        // Check eligibility
        if (age >= 18) {
            System.out.println(name + " is eligible for voting.");
        } else {
            System.out.println(name + " is NOT eligible for voting.");
        }

        sc.close();
    }
}

12)Write a java program to accept username and password from user, if they are same then display “Login Successfully” message , otherwise display “Login Failed” Message.


package hello;
import java.util.Scanner;

public class LoginCheck{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Accept username
        System.out.print("Enter Username: ");
        String username = sc.nextLine();

        // Accept password
        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        // Check login
        if (username.equals(password)) {
            System.out.println("Login Successfully");
        } else {
            System.out.println("Login Failed");
        }

        sc.close();
    }
}

13)Write a Multithreading program in java to display the number’s between 1 to 100 continuously in a TextField by clicking on button. (use Runnable Interface).

package hello;
import javax.swing.*;
import java.awt.event.*;

public class NumberDisplay extends JFrame implements Runnable {

    JTextField tf;
    JButton btn;
    Thread t;

    public NumberDisplay() {
        // Create TextField
        tf = new JTextField();
        tf.setBounds(50, 50, 200, 30);

        // Create Button
        btn = new JButton("Start");
        btn.setBounds(90, 100, 100, 30);

        // Add action to button
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                t = new Thread(NumberDisplay.this);
                t.start();
            }
        });

        // Add components
        add(tf);
        add(btn);

        // Frame settings
        setLayout(null);
        setSize(300, 200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // Thread logic
    public void run() {
        try {
            for (int i = 1; i <= 100; i++) {
                tf.setText(String.valueOf(i));
                Thread.sleep(500); // delay
            }
        } catch (InterruptedException e) {
            System.out.println("Thread Interrupted");
        }
    }

    public static void main(String[] args) {
        new NumberDisplay();
    }
}

14)write a java program to demonstrate wait() and notify() methods.

package hello;
class SharedResource {
    private boolean available = false;

    // Method to produce data
    synchronized void produce() {
        System.out.println("Producer thread running...");

        available = true;
        System.out.println("Producer produced data.");

        // Notify waiting thread
        notify();
    }

    // Method to consume data
    synchronized void consume() {
        try {
            if (!available) {
                System.out.println("Consumer waiting...");
                wait();   // Wait until notified
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Consumer consumed data.");
        available = false;
    }
}

public class WaitNotifyDemo {

    public static void main(String[] args) {

        SharedResource obj = new SharedResource();

        // Consumer Thread
        Thread t1 = new Thread(() -> {
            obj.consume();
        });

        // Producer Thread
        Thread t2 = new Thread(() -> {
            try {
                Thread.sleep(2000);  // Delay to show waiting
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            obj.produce();
        });

        t1.start();
        t2.start();
    }
}

15)write a java program to use priority thread.

package hello;

class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        // Print thread name and priority
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " with priority " + getPriority() + " is running: " + i);
            try {
                Thread.sleep(200); // Sleep to simulate work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class PriorityThreadExample {
    public static void main(String[] args) {
        // Create threads
        MyThread t1 = new MyThread("Thread-1");
        MyThread t2 = new MyThread("Thread-2");
        MyThread t3 = new MyThread("Thread-3");

        // Set thread priorities
        t1.setPriority(Thread.MIN_PRIORITY);  // 1
        t2.setPriority(Thread.NORM_PRIORITY); // 5
        t3.setPriority(Thread.MAX_PRIORITY);  // 10

        // Start threads
        t1.start();
        t2.start();
        t3.start();
    }
}

16)write a java program to display 100,99,98......1 using thread.

package hello;
//CountdownThread.java
class CountdownThread extends Thread {
 @Override
 public void run() {
     for (int i = 100; i >= 1; i--) {
         System.out.println(i);
         try {
             Thread.sleep(50); // Small delay to make output readable
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
     }
 }
}

public class CountdownExample {
 public static void main(String[] args) {
     // Create and start the countdown thread
     CountdownThread thread = new CountdownThread();
     thread.start();
 }
}

17)write a java program to display "BYE CORONA...." MESSAGE n times using
 Runnable Interface.

package hello;
import java.util.Scanner;

//Class that implements Runnable
class ByeCorona implements Runnable {
 private int n; // number of times to print the message

 // Constructor
 public ByeCorona(int n) {
     this.n = n;
 }

 @Override
 public void run() {
     for (int i = 1; i <= n; i++) {
         System.out.println("BYE CORONA.... " + i);
         try {
             Thread.sleep(200); // small delay to make output readable
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
     }
 }
}

//Main class
public class ByeCoronaRunnable {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     System.out.print("Enter how many times to display the message: ");
     int n = sc.nextInt();

     // Create Runnable object
     ByeCorona byeCoronaTask = new ByeCorona(n);

     // Create Thread with Runnable
     Thread t = new Thread(byeCoronaTask);

     // Start the thread
     t.start();

     sc.close();
 }
}

18)write a java program to use sleep() method.

package hello;
class SleepDemoThread extends Thread {
 @Override
 public void run() {
     for (int i = 1; i <= 5; i++) {
         System.out.println("Count: " + i);
         try {
             // Pause the thread for 1 second (1000 milliseconds)
             Thread.sleep(1000);
         } catch (InterruptedException e) {
             System.out.println("Thread interrupted!");
         }
     }
     System.out.println("Thread finished execution.");
 }
}

public class SleepDemo {
 public static void main(String[] args) {
     SleepDemoThread thread = new SleepDemoThread();
     thread.start(); // Start the thread
 }
}

19)write a java program that shows how two thread can communicate using wait()
 and notify() method.
package hello;
class Message {
 private String message;
 private boolean hasMessage = false;

 // Synchronized method for sending a message
 public synchronized void sendMessage(String msg) {
     while (hasMessage) { // Wait if the previous message has not been read
         try {
             wait();
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
     }
     message = msg;
     hasMessage = true;
     System.out.println("Sent: " + msg);
     notify(); // Notify the waiting thread
 }

 // Synchronized method for reading a message
 public synchronized String readMessage() {
     while (!hasMessage) { // Wait if there is no message to read
         try {
             wait();
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
     }
     hasMessage = false;
     System.out.println("Received: " + message);
     notify(); // Notify the sending thread
     return message;
 }
}

//Thread that sends messages
class Sender extends Thread {
 private Message message;

 public Sender(Message message) {
     this.message = message;
 }

 @Override
 public void run() {
     String[] messages = {"Hello", "How are you?", "Bye"};
     for (String msg : messages) {
         message.sendMessage(msg);
         try {
             Thread.sleep(500); // Simulate delay
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
     }
 }
}

//Thread that receives messages
class Receiver extends Thread {
 private Message message;

 public Receiver(Message message) {
     this.message = message;
 }

 @Override
 public void run() {
     for (int i = 0; i < 3; i++) {
         message.readMessage();
         try {
             Thread.sleep(500); // Simulate delay
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
     }
 }
}

//Main class
public class ThreadCommunicationExample {
 public static void main(String[] args) {
     Message sharedMessage = new Message();
     Sender sender = new Sender(sharedMessage);
     Receiver receiver = new Receiver(sharedMessage);

     sender.start();
     receiver.start();
 }
}


20)write a java program to demonstrate synchronization.
package hello;
class example {

 // Shared Bank Account
 static class BankAccount {
     private int balance = 0;

     // Synchronized method to deposit money
     public synchronized void deposit(int amount) {
         int currentBalance = balance;
         System.out.println(Thread.currentThread().getName() + " depositing: " + amount);
         currentBalance += amount;

         // Simulate some delay
         try {
             Thread.sleep(100);
         } catch (InterruptedException e) {
             e.printStackTrace();
         }

         balance = currentBalance;
         System.out.println(Thread.currentThread().getName() + " new balance: " + balance);
     }

     public int getBalance() {
         return balance;
     }
 }

 // Thread that deposits money
 static class DepositThread extends Thread {
     private BankAccount account;
     private int amount;

     public DepositThread(BankAccount account, int amount) {
         this.account = account;
         this.amount = amount;
     }

     public void run() {
         account.deposit(amount);
     }
 }

 public static void main(String[] args) {
     BankAccount account = new BankAccount();

     // Create multiple threads depositing money
     Thread t1 = new DepositThread(account, 100);
     Thread t2 = new DepositThread(account, 200);
     Thread t3 = new DepositThread(account, 300);

     t1.setName("Thread-1");
     t2.setName("Thread-2");
     t3.setName("Thread-3");

     // Start all threads
     t1.start();
     t2.start();
     t3.start();

     // Wait for all threads to finish
     try {
         t1.join();
         t2.join();
         t3.join();
     } catch (InterruptedException e) {
         e.printStackTrace();
     }

     System.out.println("Final Balance: " + account.getBalance());
 }
}

