package jjuproject1_javazon;
// @author Johnson

public class Clerk extends Person 
{

    private String employeeID;
    private int registerNbr;

    //CONSTRUCTOR
    public Clerk(String anID, int aRegister, String firstName, 
                String lastName, String anAddress, String city, 
                String state, String zip, String phone) 
    {

        super(firstName, lastName, anAddress, city, state, zip, phone);

        registerNbr = aRegister;
    }

    //METHOD TO RETURN SUMMARY ABOUT OBJECT
    @Override
    public String toString() 
    {
        String result = "";

        result += super.getFirstName();
        result += "EmployeeID:\t" + employeeID + "\n";

        return result;
    }

    //GETTER FOR EMPLOYEE ID
    public String getEmployeeID() 
    {
        return employeeID;
    }

    //GETTER FOR EMPLOYEE CASH REGISTER
    public int getRegisterNbr() 
    {
        return registerNbr;
    }
}

// @author Johnson