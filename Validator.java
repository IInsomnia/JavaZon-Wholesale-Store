package jjuproject1_javazon;
// @author Johnson

import javax.swing.JOptionPane;


public class Validator 
{
    //Call to Get Valid first name
    public static String getValidFirstName(String firstName) 
    {
        while(isValidFirstName(firstName) == false)
        {
            firstName = JOptionPane.showInputDialog("Please enter a valid First Name. \n The name " + firstName + " is not valid");
        }
        
        return firstName;
    }
    
    //To Validate first name input
    private static boolean isValidFirstName(String firstName) 
    {
        boolean result = true;

        if(firstName.length() < 1)
        {
            result = false;
        }
        else if(firstName.matches("[a-zA-Z]+") != true)
        {
            result = false;
        }
        
        return result;
    }
    
    //Call to Get Valid last name
    public static String getValidLastName(String lastName) 
    {
        while(isValidLastName(lastName) == false)
        {
            lastName = JOptionPane.showInputDialog("Please enter a valid Last Name. \n The name " + lastName + " is not valid");
        }
        
        return lastName;
    }

    //To Validate last name input
    private static boolean isValidLastName(String lastName) 
    {
        boolean result = true;

        if(lastName.length() < 1)
        {
            result = false;
        }
        else if(lastName.matches("[a-zA-Z]+") != true)
        {
            result = false;
        }
        
        return result;
    }
    
    //Call to Get Valid street
    public static String getValidStreet(String streetNameNum)
    {
        while(isValidStreet(streetNameNum) == false)
        {
            streetNameNum = JOptionPane.showInputDialog("Please enter a valid street address \n" + streetNameNum + " is not a valid street");
        }
        
        return streetNameNum;
    }
    
    //To Validate street input
    private static boolean isValidStreet(String streetName)
    {
        boolean result = true;
        
        if(streetName.length() < 1)
        {
            result = false;
        }
        else if(streetName.matches("[a-zA-Z0-9 ]+") != true)
        {
            result = false;
        }

        return result;
    }
    
    //Call to Get Valid city
    public static String getValidCity(String cityName)
    {
        while(isValidCity(cityName) == false)
        {
            cityName = JOptionPane.showInputDialog("Please enter a valid City Name \n" + cityName + " is not a valid City");
        }
        
        return cityName;
    }
    
    //To Validate city input
    private static boolean isValidCity(String cityName)
    {
        boolean result = true;
        if(cityName.length() < 1)
        {
            result = false;
        }
        else if(cityName.matches("[a-zA-Z ]+") != true)
        {
            result = false;
        }
        
        return result;
    }
    
    //Call to Get Valid state
    public static String getValidState(String stateName)
    {
        while(isValidState(stateName) == false)
        {
            stateName = JOptionPane.showInputDialog("Please enter a valid State \n " + stateName + " is not a valid state");
        }
        
        return stateName;
    }

    //To Validate state input
    private static boolean isValidState(String stateName)
    {
        boolean result = true;
        if(stateName.length() != 2)
        {
            result = false;
        }
        else if(stateName.matches("[a-zA-Z]+") != true)
        {
            result = false;
        }
        
        return result;
    }
    
    //Call to Get Valid zipcode
    public static String getValidZip(String zipCode)
    {
        while(isValidZip(zipCode) == false)
        {
            zipCode = JOptionPane.showInputDialog("Please enter a valid five digit Zipcode \n " + zipCode + " is not valid");
        }
        
        return zipCode;
    }
    
    //To Validate zipcode input
    private static boolean isValidZip(String zipCode)
    {
        boolean result = true;
        if(zipCode.length() != 5)
        {
            result = false;
        }
        else if(zipCode.matches("[0-9]+") != true)
        {
            result = false;
        }
        
        return result;
    }
    
    //Call to Get Valid phone number
    public static String getValidPhone(String phoneNum)
    {
        while(isValidPhone(phoneNum) == false)
        {
            phoneNum = JOptionPane.showInputDialog("Please enter a valid ten digit Phone Number including the area code \n" + phoneNum + " is not a valid number");
        }
        
        return phoneNum;
    }
    
    //To Validate phone number input
    private static boolean isValidPhone(String phoneNum)
    {
        boolean result = true;
        if(phoneNum.length() != 10)
        {
            result = false;
        }
        else if(phoneNum.matches("[0-9]+") != true)
        {
            result = false;
        }
        
        return result;
    }
    
    //Call to Get Valid membership id
    public static String getValidMembership(String membershipID)
    {
        while(isValidMembership(membershipID) == false)
        {
            membershipID = JOptionPane.showInputDialog("Please enter a valid membership ID consisting of 2 characters followed by 4 numbers \n " + membershipID + " is not valid");
        }
        
        return membershipID;
    }
    
    //To Validate membership id input
    private static boolean isValidMembership(String membershipID)
    {
        boolean result = true;
        if(membershipID.length() != 6)
        {
            result = false;
        }
        else if(membershipID.matches("^[a-zA-Z][a-zA-Z][0-9][0-9][0-9][0-9]$") != true)
                {
                    result = false;
                }
                
        return result;
    }
    
    //Call to Get Valid product quantity
    public static String getValidQuantity(String productQuantity)
    {
        while(isValidQuantity(productQuantity) == false)
        {
            productQuantity = JOptionPane.showInputDialog("Please enter a valid Quantity from 1 - 10 \n" + productQuantity + " is not a valid quantity.");
        }
        
        return productQuantity;
    }
    
    //To Validate product quantity input
    private static boolean isValidQuantity(String productQuantity)
    {
        boolean result = true;
        if(productQuantity.matches("[0-9]+") == true)
        {
            int Quantity = Integer.parseInt(productQuantity);
            if(Quantity >= 1 && Quantity <= 10)
            {
                result = true;
            }
            else
            {
                result = false;
            }
        }
        else
        {
            result = false;
        }

        return result;
    }
}

// @author Johnson