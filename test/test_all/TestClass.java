/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test_all;


/**
 *
 * @author Wisdom K. Anyizah
 */

import org.junit.Assert;
import org.junit.Test;
public class TestClass {
    
    Mathematical_Algo math = new Mathematical_Algo(8, 252, 2, 31.74603176f, 6);
     
  //Test on calculate_total_unit_rate   
  @Test
    public void calculate_total_unit_rate_test(){
        Assert.assertEquals((8 * 3.96825397f), math.calculate_total_unit_rate(8));
    }
    
    //Test on calculate_total_dev_bill
   @Test
   public void calculate_total_dev_bill_test() {
         Assert.assertEquals(80.00000004, math.calculate_total_dev_bill());
       
   }
   
   //Test on calculate_bill_per_room_dev 
    @Test
    public void calculate_bill_per_room_dev_test() {
        
    }
    
    //Test calculate_constant_bill
    @Test
    public void calculate_constant_bill_test() {
        
    }
    
    //Test on calculate_flat_bill_per_room
    @Test
    public void calculate_flat_bill_per_room_test() {
        
    }
    
    //Test on calculate_total_bill_per_room
    @Test
    public void calculate_total_bill_per_room_test() {
        
    }
  
}
