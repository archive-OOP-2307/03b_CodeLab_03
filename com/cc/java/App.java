package com.cc.java;

public class App {
  
    public static void main(String[] args) {

      MA_Prod ma1 = new MA_Prod("Mustermann", "Max", 1970, "ID001" , "production", "worker",2010);
      MA_Acc ma2 = new MA_Acc("Chapeau", "Maxine", 1980, "ID002" , "accounting", "accountant",2012);
      MA_Adv ma3 = new MA_Adv("Martinelli", "Silvia", 1995, "ID003" , "advertising", "consultant", 2018);
      
      
      output("------- MA 1 --------------");	
      output(ma1.startsWork());
      output(ma1.hasLunch());
      output(ma1.getEmployedTime());
      output(ma1.doYourWork());


      output("------- MA 2 --------------");	
      output(ma2.startsWork());
      output(ma2.hasLunch());
      output(ma2.getEmployedTime());
      output(ma2.doYourWork());

      output("------- MA 3 --------------");	
      output(ma3.startsWork());
      output(ma3.hasLunch());
      output(ma3.getEmployedTime());
      output(ma3.doYourWork());
      
    }
  
    private static void output(String outStr) {
        System.out.println(outStr);
    }
}
