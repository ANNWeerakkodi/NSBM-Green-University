
package com.mycompany.practical_02;

public class Item {
    //q01
    private int location;
    private String description;
    
    //q02
    public Item(int location,String description)
    {
      this.location=location;
      this.description=description;
      
      
    }
    //q04
    public int getLocation()
    {
     return location;
    }
    public void setLocation(int location)
    {
     this.location=location;
    }
    
    public String getDescription()
    {
     return description;
    }
    public void setDescription(String description)
    {
      this.description=description;
    }
}
