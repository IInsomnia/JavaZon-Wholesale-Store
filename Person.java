package jjuproject1_javazon;
// @author Johnson

public class Person 
{

    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phone;

    //Constructor
    public Person(String aFirstName, String aLastName, String anAddress, String aCity, String aState, String aZip, String aPhone) 
    {
	//Assigning local variables
        firstName = aFirstName;
        lastName = aLastName;
        address = anAddress;
        city = aCity;
        state = aState;
        zip = aZip;
        phone = aPhone;
        
    }

    //Summary Display of Person information
    public String toString() 
    {
        String result = "";

        result += "Name: " + firstName + " " + lastName + "\n";
        result += "Phone: " + phone + "\n\n";
        result += "Address\n";
        result += address + "\n";
        result += city + ", " + state + ", " + zip + "\n";

        return result;
    }

    //Call to Get first name
    public String getFirstName() 
    {
        return firstName;
    }

    //Call to Set first name
    public void setFirstName(String firstName) 
    {
        this.firstName = firstName;
    }
    
    //Call to Get
    public String getLastName() 
    {
        return lastName;
    }

    //Call to Set last name
    public void setLastName(String lastName) 
    {
        this.lastName = lastName;
    }
    
    //Call to Get address
    public String getAddress() 
    {
        return address;
    }

    //Call to Set address
    public void setAddress(String address) 
    {
        this.address = address;
    }

    //Call to Get city
    public String getCity() 
    {
        return city;
    }

    //Call to Set city
    public void setCity(String city) 
    {
        this.city = city;
    }
    
    //Call to Get state
    public String getState() 
    {
        return state;
    }

    //Call to Set state
    public void setState(String state) 
    {
        this.state = state;
    }

    //Call to Get zipcode
    public String getZip() 
    {
        return zip;
    }

    //Call to Set zipcode
    public void setZip(String zip) 
    {
        this.zip = zip;
    }

    //Call to Get phone number
    public String getPhone() 
    {
        return phone;
    }

    //Call to Set phone number
    public void setPhone(String phone) 
    {
        this.phone = phone;
    }
}

// @author Johnson