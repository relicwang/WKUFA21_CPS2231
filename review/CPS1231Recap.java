package review;

import java.util.Scanner;

public class CPS1231Recap {

	public static void main(String[] args) {
		//1. Print things in console
		System.out.println("Welcome CPS2231");
		
		//2. Different Errors
		
		//  a. Syntax Errors
		//      --> mising ;, typos .etc 
		System.out.println("Welcome CPS2231");

		//  b. Runtime Errors
		//
//		System.out.println(9/0);
		
		//  c. Logical Error
		//  5/2 ---> 2.5
		System.out.println(5/2);
		
		System.out.println(5.0*2);
		
		//3. Variables, Constants
		//   Variables: the 1st letter of 1st word should be lower
		//               rest words the 1st letter upper--> carSpeed
		    int carSpeed;  int stockPrice;
		    //String, char, int, double etc.
		//   Constants: all letter is upper. moon gravity ---> MOON_GRAVITY     
		    double MOON_GRAVITY;
		    
		//4. Get user input from console
		   Scanner input = new Scanner(System.in);
		   System.out.println("Please eneter a enter integer between [1,10]");
		   int num = input.nextInt();
		  
		//5. Selection
		//   a. 1-way selection
		   if(num>1) {
			   
		   }
		   
		//  b. 2-way selection 
		   if(num>1) {
			   //do something
		   }
		   else {
			   //do something else
		   }
		
		 //Multi-Ways
		   if(num>1&&num<5) {
			   //do something
		   }
		   else if(num>5&&num<7) {
			   //do something else
		   }
		   else {
			   //do more things =
		   }
		   
		   
		//Switch
		   
		   //Print month based on user #
//		  if(num==1) {
//			  System.out.println("Jan.");
//		  }
//		  else if(num==2) {
//			  System.out.println("Feb.");
//		  }
//		  else if(num==3) {
//			  System.out.println("Mar.");
//		  }
//		  //...
//		  else if(num==12) {
//			  System.out.println("Dec.");
//		  }
		  
		  //Switch Approach
		  String month ="";
		  switch(num) {
		  	case 1: 
		  		month="Jan";
		  		System.out.println("In case 1");
			case 2: 
				month="Feb";
				System.out.println("In case 2");
				break;
			case 3: 
				month="March";
				System.out.println("In case 3");
			//...
		  }
		  System.out.println(month);
		  
		//6. Loops
		  for(int i=0;i<5;i++) {
			  System.out.println(i);
		  }
//		  System.out.print(i);
		  
		  int i=0;
		  while(i<5) {
			  i++;//Loc 1
			  //Other actions
			  // using i vaues
			  System.out.println(i);
			  
//			  i++;//Loc 2
		  }
		  
		  
		  do {
			System.out.println("inside do-while loop");  
		  }while(false);
		 
		  //Arrays
		  int [] nums= new int[5];
		  
		  System.out.println("Please enter 10 integers:");
		  for(int index=0;index<nums.length;index++) {
			  nums[index]=input.nextInt();
		  }
		  
		  //Compute the sum value from given array: nums
		  int sum =0;
		  for(int index=0;index<nums.length;index++) {
			  sum = sum+ nums[index];
		  }//=====   sum=nums[nums.length-1]
		  
		  int[] org = {98,79,81,56,78,90};
		  
		  
		  //1. Linear Search
		  //Test Cases:
		  // 1. Find key in empty array
//		  int[] orgArr =  {1,2,3};
		  System.out.println(linearSearch(new int[] {},1)==-1);
		  
		  //2. Find the key 
		  System.out.println(linearSearch(new int[] {2,3,1,6},1)==2);
		  System.out.println(linearSearch(new int[] {2,3,1,6},2)==0);
		  System.out.println(linearSearch(new int[] {2,3,1,6},6)==3);

		  //3. Can't Find the key
		  System.out.println(linearSearch(new int[] {2,3,1,6},5)==-1);
		  System.out.println(linearSearch(new int[] {-2,-3,1,6},0)==-1);

	}
	
	
	//1. Signature: linearSearch: int[], int ->int
	//2. Purpose:   Find the key in the given int array 
	//                  using linear search
	//3. Examples:
	//       linearSearch({1}, 9)->-1
	//       linearSearch({2,3,4}, 2)->0
	//       linearSearch({}, 2)->-1
	public static int linearSearch(int[] orgArr, int key) {
		//1. Array is empty --> -1
		if(orgArr.length==0) {
			return -1;
		}
		
		//2. If not empty, we will search the key in the array
		for(int i=0;i<orgArr.length;i++) {
			if(key==orgArr[i]) {
				return i;
			}
		}//--> till now nothing returned, what does it mean?
		
		
		return -1;
	}


	
	
	

}
