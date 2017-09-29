package jjuproject1_javazon;
// @author Johnson

import java.math.*;



public class JavaZon 
{

    private Clerk[] numClerks;
    private Order custOrder;

    //CLASS CONSTRUCTOR
    public JavaZon() 
    {
        loadClerkList();
    }

    //ASSIGN AN ORDER THROUGH SETTER
    public void setOrder(Order anOrder) 
    {
        custOrder = anOrder;
    }

    //PROCESS ORDER
    public void processOrder() 
    {
        //SUBTOTAL
        custOrder.calcSubtotal();
        //TAX
        custOrder.calcTax();
        //TOTAL
        custOrder.calcTotal();

    }

    //METHOD TO LOAD CLERKS
    public void loadClerkList() 
    {
        numClerks = new Clerk[3];
        Clerk musicClerk = new Clerk("EMP100", 1, "Homer", "Simpson", "243 North Main", "Spingfield", "CA", "98765", "909-987-6666");
        Clerk bookClerk = new Clerk("EMP200", 2, "Bart", "Simpson", "454 North Euclid", "Spingfield", "CA", "98765", "909-987-4444");
        Clerk gameClerk = new Clerk("EMP300", 3, "Lisa", "Simpson", "767 North Holt", "Spingfield", "CA", "98765", "909-987-3333");

		//TODO 
        //ADD THESE CLERKS TO THE CLERK ARRAY
        numClerks[0] = musicClerk;
        numClerks[1] = bookClerk;
        numClerks[2] = gameClerk;
    }

    //METHOD TO SET A CLERK TO THE ORDER
    public void setClerk() 
    {
		//TODO
        //Randomly assign a clerk to order 
        Order clerk = new Order();
        double randClerk = Math.random() * 3;
        int randNum = (int)randClerk;
        
        custOrder.setOrderClerk(numClerks[randNum]);
    }

    //RETURN RECEIPT
    public String getReceipt() 
    {
        String result;

        result = "JAVAZON WHOLESALE STORE\n\n";

        result += "90404 CENTRAL AVE\n";
        result += "MONTCLAIR, CA, 91763\n";
        result += "  (909)345-9876\n\n";

        result += custOrder.toString();

        return result;
    }
}

// @author Johnson