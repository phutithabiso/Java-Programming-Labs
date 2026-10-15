package org.example;

public class Display {
    //display the main page
    static void display() {
        IO.println("Enter 1:   Student class");
        IO.println("Enter 2:  Bank account");
        IO.println("Enter 3:  Product inventory");
        IO.println("Enter 4: Rectangle");

    }

    static void runstudent() {
        Students s1 = new Students("Thabiso", "ST10219717", 98);
        Students s2 = new Students("Moe", "ST1021982239", 90);
        s1.displayDetails();
        IO.println("Passed: " + s1.hasPassed());
        IO.println("============================");
        s2.displayDetails();
        IO.println("Passed: " + s2.hasPassed());
        IO.println("============================");

    }
// display balance account
    static void runBalance() {
        BankAccount ac = new BankAccount("Phuti", "ACC001", 2000.00);

        // older amount
        IO.println("=====================");
        IO.println("Account Holder: " + ac.getAccHolder());
        IO.println("Account Number: " + ac.getAccNo());
        IO.println("Balance: R" + ac.getBalance());
        IO.println("*********************");
        // Update values using setters
        ac.setAccHolder("Phuti");
        ac.setAccNo("ACC001");
        // diposit
        ac.deposit(1500);
        ac.withdraw(300);
        //Display
        IO.println("=====================");
        IO.println("Current Amount");
        IO.println("=====================");

        IO.println("Updated Sytem");
        IO.println("=====================");
        IO.println("Account Holder: " + ac.getAccHolder());
        IO.println("Account Number: " + ac.getAccNo());
        IO.println("Balance: R" + ac.getBalance());
        IO.println("*********************");


    }
 void runProduct(){
     Product pdc = new Product(101, "Laptop", 18000.00, 5);

     boolean run = true;

     while (run) {

         IO.println("""

                === INVENTORY MANAGEMENT ===
                1. View product
                2. Add stock
                3. Sell product
                4. Check stock status
                5. Exit
                """);

         int choice = Integer.parseInt(IO.readln("Choose an option: "));

         if (choice == 1) {
             pdc.displayDetails();

         } else if (choice == 2) {
             int qyt = Integer.parseInt(
                     IO.readln("Enter product quantity to add: ")
             );

             pdc.addStock(qyt);

         } else if (choice == 3) {
             int qty= Integer.parseInt(
                     IO.readln("Enter quantity to sell: ")
             );

             pdc.sellProduct(qty);

         } else if (choice == 4) {

             int stock = pdc.getStockQuantity();

             if (stock == 0) {
                 IO.println("OUT OF STOCK");

             } else if (stock <= 5) {
                 IO.println("LOW STOCK: Reorder soon.");

             } else {
                 IO.println("STOCK AVAILABLE");
             }

         } else if (choice == 5) {
             IO.println("See you soon");
             run = false;

         } else {
             IO.println("Invalid. Try again.");
         }
     }
 }
}
