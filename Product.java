package jjuproject1_javazon;
// @author Johnson

public class Product 
{

    private String sku;
    private String type;
    private String description;
    private double price;

    //Constructor
    public Product(String aSku, String aType, String aDescription, double aPrice) 
    {
        sku = aSku;
        type = aType;
        description = aDescription;
        price = aPrice;
    }

    //Call to Get sku number
    public String getSku() 
    {
        return sku;
    }

    //Call to Set sku number
    public void setSku(String sku) 
    {
        this.sku = sku;
    }

    //Call to Get type of product
    public String getType() 
    {
        return type;
    }

    //Call to Set type of product
    public void setType(String type) 
    {
        this.type = type;
    }

    //Call to Get description(Name of product)
    public String getDescription() 
    {
        return description;
    }

    //Call to Set description(Name of product)
    public void setDescription(String description) 
    {
        this.description = description;
    }

    //Call to Get price
    public double getPrice() 
    {
        return price;
    }

    //Call to Set price
    public void setPrice(double price) 
    {
        this.price = price;
    }
}

// @author Johnson