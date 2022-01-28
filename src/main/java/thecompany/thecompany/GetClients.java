package thecompany.thecompany;

import java.util.*;
        
public class GetClients 
{
    public static void main(String [] args)
    {
        
        //Remember to implement ontario labour laws.
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Please enter number: ");
        int intNum = scan.nextInt();
        System.out.println();
        
        if(intNum == 1)
        {
            //Worker Object
            Worker worker1 = new Worker("Sally","Production","west wing",40,15);
            
            //Manager Object
            Manager manager1 = new Manager("Tyler","Production","west wing","Director of Production",20000);
        }
        else if(intNum == 2)
        {
            //Worker Object1
            Worker worker1 = new Worker("Sally","Production","west wing",40,15);
            
            //Worker Object2
            Worker worker2 = new Worker("James","Production","west wing",38,15);
        }
        else if(intNum == 3)
        {
            //Worker Object1
            Worker worker1 = new Worker("Sally","Production","west wing",40,15);
            System.out.println("Worker");
            System.out.println(worker1);
            
            //Worker Object2
            Worker worker2 = new Worker("James","Production","west wing",38,15);
            System.out.println("Worker");
            System.out.println(worker2);

            //Manager Object1
            Manager manager1 = new Manager("Tyler","Production","west wing","Director of Production",20000);
            System.out.println("Manager");
            System.out.println(manager1);
        }
        else if(intNum == 4)
        {
            //Worker Object1
            Worker worker1 = new Worker("Sally","Production","west wing",40,15);
            
            System.out.print("Please input number of hours worked this week: ");
            int hrs = scan.nextInt();
            System.out.println();
            worker1.setwkHrs(hrs);   //Hours Worked
            System.out.println(worker1);
            
            //Worker Object2
            Worker worker2 = new Worker("James","Production","west wing",38,15);
            
            System.out.print("Please input number of hours worked this week: ");
            int hrs1 = scan.nextInt();
            System.out.println();
            worker2.setwkHrs(hrs1);   //Hours Worked
            System.out.println(worker2);
        }
        else if(intNum == 5)
        {
            //Worker Object1
            Worker worker1 = new Worker("Sally","Production","west wing",40,15);
            
            System.out.print("Please input hourly wage for the first worker: ");
            int wage = scan.nextInt();
            System.out.println();
            worker1.setwkWage(wage);    //Hourly Wage
            System.out.println(worker1);
            
            //Worker Object2
            Worker worker2 = new Worker("James","Production","west wing",38,15);
            
            System.out.print("Please input hourly wage for rhe second worker: ");
            int wage1 = scan.nextInt();
            System.out.println();
            worker2.setwkWage(wage1);    //Hourly Wage
            System.out.println(worker2);
        }
        else if(intNum == 6)
        {
            //Worker Object1
            Worker worker1 = new Worker("Sally","Production","west wing",40,15);
            worker1.getwkHrs();
            worker1.getwkWage();
            int intPay = worker1.getwkHrs() * worker1.getwkWage();
            
            System.out.print(worker1);
            System.out.print("First Worker Pay: ");
            System.out.println(intPay);   //Workers pay gotten from multiplying the Hourly Wage and Hours Worked
            
            //Worker Object2
            Worker worker2 = new Worker("James","Production","west wing",38,15);
            worker2.getwkHrs();
            worker2.getwkWage();
            int intPay1 = worker2.getwkHrs() * worker2.getwkWage();
            
            System.out.print(worker2);
            System.out.print("Second Worker Pay: ");
            System.out.println(intPay1);   //Workers pay gotten from multiplying the Hourly Wage and Hours Worked
        }
        else if(intNum == 7)
        {
            //Worker Object1
            Worker worker1 = new Worker("Sally","Production","west wing",40,15);
            
            System.out.print("Please input number of hours worked this week: ");
            int hrs = scan.nextInt();
            worker1.setwkHrs(hrs);
            
            System.out.print("Please input hourly wage for the first worker: ");
            int wage = scan.nextInt();
            worker1.setwkWage(wage);
            
            int intPay = worker1.getwkHrs() * worker1.getwkWage();
            
            System.out.println();
            System.out.print(worker1);
            System.out.print("First Worker Pay: ");
            System.out.println(intPay+"\n");
            
            //Worker Object2
            Worker worker2 = new Worker("James","Production","west wing",38,15);
            
            System.out.print("Please input number of hours worked this week: ");
            int hrs1 = scan.nextInt();
            worker2.setwkHrs(hrs1);
            
            System.out.print("Please input hourly wage for the second worker: ");
            int wage1 = scan.nextInt();
            worker2.setwkWage(wage1);
            
            int intPay1 = worker2.getwkHrs() * worker2.getwkWage();
            
            System.out.println();
            System.out.print(worker2);
            System.out.print("Second Worker Pay: ");
            System.out.println(intPay1);
        }
        else if(intNum == 8)
        {
            Manager manager1 = new Manager("Tyler","Production","west wing","Director of Production",20000);
            System.out.print("Please Enter the managers salary: $");
            int salary = scan.nextInt();
            manager1.setmSalary(salary);
            
            System.out.println(manager1);
        }
        else if(intNum == 9)
        {
            Manager manager1 = new Manager("Tyler","Production","west wing","Director of Production",20000);
            System.out.print("Please Eneter the departments revenue: $");
            int revenue = scan.nextInt();
            manager1.setmRevenue(revenue);
            
            System.out.println(manager1);
        }       
    }
}
