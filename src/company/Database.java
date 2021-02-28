package company;
import java.util.Scanner;

   public class Database implements Printable {
       private String password; // password to log in
       private Scanner scanner = new Scanner(System.in);// Input

       @Override
       public void func() {
           password = scanner.nextLine();//input password
           String command;//statement
           if (password.equals("head")) //password for head
           {
               Head user = new Head();//data type of Director called user
               String id; //variables for table
               String name;
               String surname;
               String position;
               String address ;
               String salary;
               String input;
               System.out.println("Could you enter information? :");
               System.out.println("yes");
               System.out.println("no");
               input = scanner.nextLine();//input yes or no

               while (input.equals("yes")) // this loop used to add large number of employees
               {
                   System.out.println("Choose command:");//3 commands:insert,update,delete
                   System.out.println("1.Insert");
                   System.out.println("2.Update");
                   System.out.println("3.Delete");
                   command = scanner.nextLine();//choose command
                   if (command.equals("Insert") || command.equals("insert") || command.equals("1")) // Add information
                   {
                       System.out.println("Enter id:");//input id
                       id = scanner.nextLine();
                       System.out.println("Enter name:");//input name
                       name = scanner.nextLine();
                       System.out.println("Enter surname:");//input surname
                       surname = scanner.nextLine();
                       System.out.println("Enter position:");//input position
                       position = scanner.nextLine();
                       System.out.println("Enter address:");//input address
                       surname = scanner.nextLine();
                       System.out.println("Enter salary:");//input salary
                       salary = scanner.nextLine();
                       user.InputDataBase(id, name, surname, position, address, salary );//call function
                       System.out.println("Accepted!");


                   } else if (command.equals("Update") || command.equals("update") || command.equals("2")) //update information
                   {
                       System.out.println("Enter id:");//input id
                       id = scanner.nextLine();
                       System.out.println("Enter name:");//input name
                       name = scanner.nextLine();
                       System.out.println("Enter surname:");//input surname
                       surname = scanner.nextLine();
                       System.out.println("Enter position:");//input postion
                       position = scanner.nextLine();
                       System.out.println("Enter address:");//input address
                       surname = scanner.nextLine();
                       System.out.println("Enter salary:");//input salary
                       salary = scanner.nextLine();
                       user.UpdateDataBase(id, name, surname, position, address, salary);//call function
                       System.out.println("Accepted!");

                   } else if (command.equals("Delete") || command.equals("delete") || command.equals("3")) //delete information
                   {
                       System.out.println("Enter id:");//input id and delete row by id
                       id = scanner.nextLine();
                       user.DeleteDataBase(id);//call function
                       System.out.println("Accepted!");

                   }

               }
           } else if (password.equals("employee"))//if human is employee
           {
               Employee user = new Employee();
               String id; //variables for table
               String name;
               String surname;
               String position;
               String address = null ;//
               String salary;
               String input;
               System.out.println("Could you enter information?");
               System.out.println("yes");
               System.out.println("no");
               input = scanner.nextLine();//input yes or no
               while (input.equals("yes")) //
               {
                   System.out.println("Choose command:");//three commands:insert,update,delete
                   System.out.println("1.Insert");
                   System.out.println("2.Update");
                   System.out.println("3.Delete");
                   command = scanner.nextLine();//choose command
                   if (command.equals("Insert") || command.equals("insert") || command.equals("1")) // Add information
                   {
                       System.out.println("Enter id:");//input id
                       id = scanner.nextLine();
                       System.out.println("Enter name:");//input name
                       name = scanner.nextLine();
                       System.out.println("Enter surname:");//input surname
                       surname = scanner.nextLine();
                       System.out.println("Enter position:");//input position
                       position = scanner.nextLine();
                       System.out.println("Enter address:");//input address
                       surname = scanner.nextLine();
                       System.out.println("Enter salary:");//input salary
                       salary = scanner.nextLine();
                       user.InputDataBase(id, name, surname, position, address, salary);//call function
                       System.out.println("Accepted!");


                   } else if (command.equals("Update") || command.equals("update") || command.equals("2")) // update information
                   {
                       System.out.println("Enter id:");//input id
                       id = scanner.nextLine();
                       System.out.println("Enter name:");//input name
                       name = scanner.nextLine();
                       System.out.println("Enter surname:");//input surname
                       surname = scanner.nextLine();
                       System.out.println("Enter position:");//input postion
                       position = scanner.nextLine();
                       System.out.println("Enter address:");//input address
                       surname = scanner.nextLine();
                       System.out.println("Enter salary:");//input salary
                       salary = scanner.nextLine();
                       user.UpdateDataBase(id, name, surname, position,address, salary);//call function
                       System.out.println("Accepted!");

                   } else if (command.equals("Delete") || command.equals("delete") || command.equals("3")) //delete information
                   {
                       System.out.println("Enter id:");//input id and delete row by id
                       id = scanner.nextLine();
                       user.DeleteDataBase(id);//call function
                       System.out.println("Accepted!");

                   }

               }

           }
           else {//if password isn't correct
               System.out.println("Invalid password!");
           }
       }
   }

