package jjuproject1_javazon;
// @author Johnson

import java.text.NumberFormat;
import java.util.Arrays;



public class Order 
{

    //class variables
    private Customer orderCustomer;
    private Clerk orderClerk;
    private Product[] orderProduct;
    private int[] orderQuantity;

    //store totals
    private double subtotal;
    private double tax;
    private double total;

    //constant defining tax
    private static double TAX_RATE = 0.0825;

    //keep track of how many products were added
    private int productCount;

    //constructor
    public Order() 
    {
        orderProduct = new Product[1];
        orderQuantity = new int[1];
        
        
    }

    //setter to assign customer
    public void setOrderCustomer(Customer aCustomer) 
    {
        orderCustomer = aCustomer;
    }

    //setter to assign clerk
    public void setOrderClerk(Clerk aClerk) 
    {
        orderClerk = aClerk;
    }

    //Dynamic Array storing ordered products and quantities
    public void setOrderProduct(Product aProduct, int aQty) 
    {
        if(orderProduct[0] == null)
        {
            orderProduct[0] = aProduct;
            orderQuantity[0] = aQty;
            
        }
        else
        {
            orderProduct = Arrays.copyOf(orderProduct, orderProduct.length + 1);
            orderProduct[orderProduct.length - 1] = aProduct;
            
            orderQuantity = Arrays.copyOf(orderQuantity, orderQuantity.length + 1);
            orderQuantity[orderQuantity.length - 1] = aQty;
        }
    }

    //Calculate subtotal
    public void calcSubtotal() 
    {
        for(int a = 0; a < orderProduct.length; a++)
        {
            subtotal+= (orderProduct[a].getPrice() * orderQuantity[a]);
        }

    }

    //Calculate tax
    public void calcTax() 
    {
        tax = subtotal * TAX_RATE;
    }

    //Calculate total
    public void calcTotal() 
    {
        total = subtotal + tax;
    }

    //Returns Summary of reciept
    public String toString() 
    {
        productCount = getNumberItemsSold();
        NumberFormat nf = NumberFormat.getCurrencyInstance();

        String result = "";

        
        result = "CASHIER @ REGISTER\n " + orderClerk.getFirstName() + " " + orderClerk.getLastName() + " @ " + orderClerk.getRegisterNbr() + "\n\n"
                + "CUSTOMER INFO \n"
                + orderCustomer.toString() + "\n"
                + "NUMBER OF ITEMS SOLD = " + productCount + "\n\n"
                + orderInvoice() + "\n"
                + "TOTALS \n"
                + "Subtotal: " + nf.format(subtotal) + "\n"
                + "Tax: " + nf.format(tax) + "\n"
                + "Total: " + nf.format(total);

        return result;
    }

    //Returns the number of items sold
    public int getNumberItemsSold() 
    {
        int totalQty = 0;
        for (int i = 0; i < orderQuantity.length; i++) 
        {
            totalQty += orderQuantity[i];
        }
        return totalQty;
    }
    
    //Returns Summary of Invoice
    public String orderInvoice()
    {
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        String result = "";
        
        for(int a = 0; a < orderProduct.length; a++)
        {
        result += orderQuantity[a] + " @ " + nf.format(orderProduct[a].getPrice()) + " = " + nf.format(orderQuantity[a] * orderProduct[a].getPrice()) 
                + "\n \t" + orderProduct[a].getDescription() + "\n";
        }
        
        return result;
    }
}

// @author Johnson