package ExceptionHandling;

public class Throw {
	   
	    public static void validate(int age) {  
	        if(age<5) {  
	            //throw Arithmetic exception if not eligible to enter Cinema Hall  
	            throw new ArithmeticException("Person is not eligible to enter Cinema Hall");    
	        }  
	        else {  
	            System.out.println("Person is eligible to enter Cinema Hall!!");  
	        }  
	    }  
	    //main method  
	    public static void main(String args[]){  
	        //calling the function  
	        validate(4);  
	        System.out.println("rest of the code...");    
	  }    
	   }


