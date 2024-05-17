/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test_all;

/**
 *
 * @author Wisdom K. Anyizah
 */
public class Mathematical_Algo {

	/**
	 * Bellow is a real-time data collected at the University of Cape Coast
	 * in a certain hostel of 5rooms/meter. Date: 18TH March, 2024.
	 *
	 * ID | R.Mem  | No. Equip. | Bill_252 | Bill_50 | Bill_100
	 * ++++|+++++++|++++++++++++|++++++++++|+++++++++|++++++++++ 
	 * R14 | 2     | 4          | 97.33    | 19.17   | 38.34
	 * ----|-------|------------|----------|---------|---------- 
	 * R15 | 1     | 3          | 58.67    | 11.66   | 23.32
	 * ----|-------|------------|----------|---------|---------- 
	 * R16 | 1     | 0          | 28.67    | 5.73    | 11.46
	 * ----|-------|------------|----------|---------|---------- 
	 * R17 | 1     | 0          | 28.67    | 5.73    | 11.46
	 * ----|-------|------------|----------|---------|---------- 
	 * R18 | 1     | 1          | 38.57    | 7.71    | 15.42
	 *
	 * The Algorithm behind the scene; (bill/equipment)/month = GHc10.00;
	 * unit_rate/equipment = (10/252) * 100 = (1.98/50) * 100 = 15.42 -
	 * 11.46 ≈ 3.968 . Therefore our unit_rate/equipment = (10/252) * 100 .
	 * *
	 */
	/**
	 * These are all fields declared as private access modifier
	 */
	private final float unitRate = 3.96825397f;
	private float t_amount;
	private float t_unit_rate;
	private int num_mem_per_room;
	private int room_equip;
	private int t_mem;

	// This constructor is default  and takes no argument, in order to invoke class methods easily using this to create our instance or object.
	Mathematical_Algo() {
		;;
	}

	/**
	 *
	 * This is a parameterized constructor which take three argument i.e.
	 * room_equipment, unit_rate and total_amount. And set those variables
	 * to the fields/ instance variables / class variables.
	 *
	 */
	Mathematical_Algo(int room_equip, float t_amount, int num_mem_per_room, float t_unit_rate, int t_mem) {

		this.room_equip = room_equip;
		this.t_amount = t_amount;
		this.num_mem_per_room = num_mem_per_room;
		this.t_unit_rate = t_unit_rate;
		this.t_mem = t_mem;
	}

	/**
	 * This method return total unit rate for sum of devices.
	 *
	 * @param total_device
	 * @return
	 */

	
	public float calculate_total_unit_rate(int total_device) {
		
		return total_device * unitRate;
	}
	/**
	 * This return equipment total bill for sum of the equipment.
	 *
	 * @return
	 */
	public float calculate_total_dev_bill() {
		return (t_unit_rate / 100) * t_amount;
	}

	/**
	 * This method return the cost of unitRate per a room equipment.
	 */
	public float calculate_bill_per_room_dev() {
				
		float roomDevBill = room_equip * ((unitRate / 100) * t_amount);

		if (calculate_total_dev_bill() > t_amount) {
			return (roomDevBill / calculate_total_dev_bill()) * t_amount;
		}
		return roomDevBill;
	}

	//This method take three arguments i.e total_amount, total_unit_rate and total_members on a meter.
	public float calculate_constant_bill() throws Exception /*ZeroDivisionError*/ {
		if (calculate_total_dev_bill() >= t_amount) {
			return 0;
		}
		return (t_amount - calculate_total_dev_bill()) / t_mem;
	}

	//This method take two arguments i.e total human per a room and constant bill  and return bill without equipment cost per a room.
	public float calculate_flat_bill_per_room() throws Exception {

		return num_mem_per_room * calculate_constant_bill();

	}

	//This method take in bill only per room and total equipment using and return the total payable bill for each room
	public float calculate_total_bill_per_room() throws Exception {

		return calculate_flat_bill_per_room() + calculate_bill_per_room_dev();
	}
	

	/**
	 * This mathematics_algorithm class keep the computational of the data
	 * entered. Bye! Have a marvelous great time. End of the program!
	 */
}
