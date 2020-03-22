package com.epam;

public class RemoveAfromFirst2 {
    public String removeA(String string)
    {
        String finalString = string;
        if(finalString.length()<=2 && finalString.contains("A"))
        {
           finalString = finalString.replace("A","");
        }
        else if(finalString.contains("A"))
        {
            finalString = string.substring(0,2).replace("A","") + string.substring(2,string.length());
        }
        return finalString;
    }
    public static void main(String[] args)
    {
        RemoveAfromFirst2 removeAfromFirst2 = new RemoveAfromFirst2();
        System.out.println(removeAfromFirst2.removeA("AB"));
    }
}
