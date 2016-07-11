/* 
  * To change this license header, choose License Headers in Project Properties. 
3  * To change this template file, choose Tools | Templates 
4  * and open the template in the editor. 
5  */ 
package time2; 
 /** 
  * 
  * @author imranm 
  */ 
public class Time2 { 
 
 
     int hour; 
     int min; 
     int sec; 

      
     Time2(int hour, int min, int sec){ 
         this.hour = hour; 
         this.min = min;  
         this. sec = sec; 
          
         System.out.print("Time "+ hour + ":" + min + ":" + sec + "\n"); 
     } 
      
     //Example of using a Copy Constructor in Java -  
     //Copy Constructor copies data of one object to another. 
     Time2(Time2 time) { 
         //Notice this calls the above method 
         //- neat! 
         this(time.hour,time.min,time.sec);  
     } 
     /** 
      * @param args the command line arguments 
      */ 
     public static void main(String[] args) { 
         Time2 time2 = new Time2(12,30,55);  
         Time2 time3 = new Time2(time2);//Calling Copy Constructor 
    } 
      
 } 
